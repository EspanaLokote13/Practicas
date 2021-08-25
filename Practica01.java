/*
 Programa para llevar un control de calificaciones de un alumno
  e introducir la instruccion switch
 */
import java.util.Scanner;

public class Practica01{
	public static void main(String args[]){
		int totalNotas = 5;
		int posicionActual = 0;
		
		Scanner in = new Scanner(System.in);
        String nombres[] = new String[totalNotas];
        int notas[] = new int[totalNotas];
        int opcion = 0;
		do{
			//Muestra todas las opciones del menu
			System.out.println("Menu de calificaciones");
			System.out.println("1. Capturar nombre y calificaciones");
			System.out.println("2. Imprimir calificaciones y promedio");
			System.out.println("3. Imprimir calificaciones y calificacion baja");
			System.out.println("4. Imprimir calificaciones y calificacion alta");
			System.out.println("0. Fin");
			System.out.println("\nElige una opcion");
			opcion= in.nextInt();
				switch (opcion) {
					case 0:
						break;
					case 1:       // Crear un alumno
						if(posicionActual<totalNotas){
							System.out.print("Escriba su nombre: ");
							String nombre = in.next();    
							nombres[posicionActual]= nombre;
							System.out.println("Nombre del alumno: "+nombre);
							
							System.out.print("Escriba la calificacion: ");
							int nota = in.nextInt();
							notas[posicionActual] = nota;
							// Para evitar que todo se vea muy «pegado»
							System.out.println();
							posicionActual++;
						}
						else{
							System.out.println("Ya no se pueden ingresar mas calificaciones\n");
						}
					break;
					case 2:       //Calcula el promedio
						int total = 0, prom = 0;
						if (posicionActual > 0) {
							System.out.println("Calificaciones:");
							for(int i = 0; i < posicionActual; i++) {
								System.out.println(" " + nombres[i] + " = " + notas[i]);
							}
                        System.out.println();
						}	
						else {
                        System.out.println("No hay calificaiones que mostrar.\n");
						}
						if (posicionActual > 0) {
							for(int i = 0; i < posicionActual; i++) {
								total += notas[i];
							}
							prom = total / posicionActual;
							System.out.println("El promedio es: " + prom + "\n");
						}
						else {
							System.out.println("Aún no ingresa calificaciones.\n");
						}
					break;
					case 3:   // Encuentra la calificacion mas baja
					int menor = 0, indice = 0;
						if (posicionActual > 0) {
							System.out.println("Calificaciones:");
							for(int i = 0; i < posicionActual; i++) {
								System.out.println(" " + nombres[i] + " = " + notas[i]);
							}
                        System.out.println();
						}	
						else {
                        System.out.println("No hay calificaciones que mostrar.\n");
						}
						if (posicionActual > 0) {
							for (int i = 0; i < posicionActual; i--){
								if (notas[i] > menor){
									menor = notas[i];
									indice = i;
								}
							}
							System.out.println("La calificacion mas baja es: " +notas[indice] + "\n");
						}
						else {
							System.out.println("Aún no ingresa calificaciones.\n");
						}
					break;
					case 4:    // Encuentra la calificacion mas alta
						int mayor = 0, marca = 0;
						if (posicionActual > 0) {
							System.out.println("Calificaciones:");
							for(int i = 0; i < posicionActual; i++) {
								System.out.println(" " + nombres[i] + " = " + notas[i]);
							}
							System.out.println();
						}	
						else {
							System.out.println("No hay calificaciones que mostrar.\n");
						}
						if (posicionActual > 0) {
							for (int i = 0; i < posicionActual; i++){
								if (notas[i] > mayor){
									mayor = notas[i];
									marca = i;
								}
							}
							System.out.println("La calificacion más alta: " +notas[marca] + "\n");
						}
                    else {
                        System.out.println("Aún no ingresa notas.\n");
                    }
					default:
						System.out.println("Opcion incorrecta");
				}
		}while (opcion!=0);
	}
}