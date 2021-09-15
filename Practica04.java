/*
 Programa que simula operaciones bancarias
 */
import java.util.Scanner;

public class Practica04{
	public static void main(String args[]){
		int Cuentas = 3;
		int posicionActual = 0;
		Scanner in = new Scanner(System.in);
        int opcion = 0;
		do{
			//Muestra todas las opciones del menu
			System.out.println("Bienvenido al Banco");
			System.out.println("1. Dar de alta una Cuenta");
			System.out.println("2. Acceder a una cuenta existente");
			System.out.println("0. Fin");
			System.out.println("\nElige una opcion");
			opcion= in.nextInt();
				switch (opcion) {
					case 0:
						break;
					case 1:       // Crear un alumno
						if(posicionActual<Cuentas){
							Cuenta cu = new Cuenta(CapturaEntrada.capturarCadena("Introduce nombre: "), CapturaEntrada.capturarEntero("Introduce PIN: "), CapturaEntrada.capturarEntero("Introduce saldo: "));
							System.out.println(cu.getNombre());
							System.out.println(cu.getPin());
							System.out.println(cu.getSaldo());
							/*System.out.print("Escriba su nombre: ");
							String nombre = in.next();    
							nombres[posicionActual]= nombre;
							System.out.println("Nombre del alumno: "+nombre);
							
							System.out.print("Escriba la calificacion: ");
							int nota = in.nextInt();
							notas[posicionActual] = nota;
							// Para evitar que todo se vea muy «pegado»
							System.out.println();*/
							posicionActual++;
						}
						else{
							System.out.println("Ya no se pueden ingresar mas Cuentas\n");
						}
					break;
					case 2:
						System.out.println("Ingrese Pin: ");
					break;
					default:
						System.out.println("Opcion incorrecta");
				}
		}while (opcion!=0);
	}
}
//Clase Cuenta
class Cuenta {

    private String nombre;
    private int pin;
    private int saldo;
	
    //Constructor
    public Cuenta(String nombre, int pin, int saldo) {
        setNombre(nombre);
		setPin(pin);
		setSaldo(saldo);
    }

    //Seccion de metodos: setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPin(int pin) {
        this.pin= pin;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

	//Seccion de metodos: getters
    public String getNombre() {
        return nombre;
    }
    public int getPin() {
        return pin;
    }
    public int getSaldo() {
        return saldo;
    }
}

class CapturaEntrada{
	/*Aqui capturamos lo que sea tecleado por el usuario
	cada uno de estos recibe y regresa un tipo de dato diferente
	ya sea entero, flotante, doble o cadena*/
    public static int capturarEntero(String msg){
        Scanner sc = new Scanner(System.in);//declaramos la variable de tipo Scanner
        System.out.print(""+msg+": ");
        return (sc.nextInt());
    }
	public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }

}