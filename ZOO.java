import java.util.ArrayList;
import java.util.*;
public class ZOO{
	public static void main(String[] args){
		int opc, opc2, borrar,tamanoArray = 5;
		
		//arreglo
		Animales animales[] = new Animales[tamanoArray];
		
		//arreglo de copia, para usar cuando se elimine algun elemento
		Animales animalesCopy[] =   null;
		
		//Polimorfismo
		animales[0] = new Animales("Menio", 3);
		animales[1] = new Mono("Mono araña", "Chispa", 4);
		animales[2] = new Elefante("Sonido de elefante","Hercules", 2);
		
		Veterinarian veterinario = new Veterinarian("Miguel",1000.00,"Masculino", 5);
 
		//Imprimiendo arreglo de animales 
		System.out.println();
		System.out.println("Animales que se tiene actualmente.");
		for(int i = 0; i < 5; i++){
		    if(animales[i] != null)
		        System.out.println(animales[i].getNombre());
            else
		        break;
		}


		do{
			System.out.print("\n");
			System.out.println("Seleccione una opcion");
			System.out.println("1. Agregar un animal");
			System.out.println("2. Mostrar todos los animales");
			System.out.println("3. Eliminar un animal");
			System.out.println("4. Salir");
			opc = CapturaEntrada.capturarEntero(" ");
			System.out.println();
			
			switch(opc){
				case 1:	//Únicamente se puede agreger al arreglo una instancia de la clase Animal
					for(int i = 0; i < animales.length; i++){
						if(animales[i] == null){
							animales[i] = new Animales(CapturaEntrada.capturarCadena("Nombre del nuevo animal"), CapturaEntrada.capturarEntero("Edad del animal"));
							break;
						}
						else
							continue;		
					}
				break;
				case 2:	//Muestra el arreglo de animales
					for(Animales i: animales){
						if(i != null){
							i.imprimir();
							veterinario.vaccinate(i);
							System.out.println();
						}
						else
							break;
					}
				break;		
				case 3:	//Elimina un animal del arreglo
					System.out.println("Animales que estan en el zoologico.");
					for(int i = 0; i < animales.length - 1; i++){
						if(animales[i] != null){
							System.out.println((i+1) + ") " + animales[i].getNombre());
						}
						else{
							break;
						}
					}
					//Elimina animal del arreglo
					borrar = CapturaEntrada.capturarEntero("Seleccione el NUMERO del animal que decea eliminar.");
					
					//recorre el arreglo hasta encontrar el elemento
					for(int i = 0; i < animales.length - 1; i++){
						if(borrar == i+1){
							animalesCopy = new Animales[tamanoArray];
							//copia el arreglo, quitando el elemento 
							for(int index = 0; index < i; index++){
								animalesCopy[index] = animales[index];
							}
							for(int j = i; j < animales.length - 1; j++){
								animalesCopy[j] = animales[j+1];
							}
							break;
						}
					}
						
					//copia los elementos del segundo arreglo de regreso al original e imprime el resultado final
					System.out.println("Animales que estan en el zoologico actualmente.");
					for(int i = 0; i < animalesCopy.length; i++){
						animales[i] = animalesCopy[i];
						if(animales[i] != null)
							System.out.println((i+1) + ") " + animales[i].getNombre());
					}
				break;		
				case 4: 
					System.exit(0);
					break;           
				default:
					System.out.println("Seleccione un opcion valida");
					System.out.println();
			}//switch
		}while(opc != 4);  	
	}//main
}//class

class CapturaEntrada{
	/*Aqui capturamos lo que sea tecleado por el usuario
	cada uno de estos recibe y regresa un tipo de dato diferente
	ya sea entero, flotante, doble o cadena*/
	
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);//declaramos la variable de tipo Scanner
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }

    public static float capturarFlotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextFloat());
    }

    public static double capturarDoble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextDouble());
    }

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

}