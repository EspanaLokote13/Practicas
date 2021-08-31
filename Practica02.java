/*
 Programa para llevar un control de calificaciones de un alumno
 y mostrar su estado dependiendo de su calificacion
 */
import java.util.*;
public class Practica02{
	//Método maina()
	public static void main(String args[]){
		Estudiante es1 = new Estudiante("Miguel", 1261066, "Programacion", 75, " Aprobado");
		Estudiante es2 = new Estudiante("Angel", 1261177, "Calculo", 70, "Aprobado");
		Estudiante es3 = new Estudiante("Jose", 126128566, "Ecuaciones", 80, "Aprobado");
		Estudiante es4 = new Estudiante("Luis", 1261396, "Circuitos", 55, "Reprobado");
		Estudiante es5 = new Estudiante("Ruben", 1265510, "Seniales", 50, "Reprobado");
		
		Estudiante es6 = new Estudiante(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce identificacion "), CapturaEntrada.capturarCadena("Introduce materia "),CapturaEntrada.capturarEntero("Introduce calificacion "),CapturaEntrada.capturarCadena("Introduce estado "));
		Estudiante es7 = new Estudiante(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce identificacion "), CapturaEntrada.capturarCadena("Introduce materia "),CapturaEntrada.capturarEntero("Introduce calificacion "),CapturaEntrada.capturarCadena("Introduce estado "));
		Estudiante es8 = new Estudiante(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce identificacion "), CapturaEntrada.capturarCadena("Introduce materia "),CapturaEntrada.capturarEntero("Introduce calificacion "),CapturaEntrada.capturarCadena("Introduce estado "));
		Estudiante es9 = new Estudiante(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce identificacion "), CapturaEntrada.capturarCadena("Introduce materia "),CapturaEntrada.capturarEntero("Introduce calificacion "),CapturaEntrada.capturarCadena("Introduce estado "));
		Estudiante es10 = new Estudiante(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce identificacion "), CapturaEntrada.capturarCadena("Introduce materia "),CapturaEntrada.capturarEntero("Introduce calificacion "),CapturaEntrada.capturarCadena("Introduce estado "));
		
		/*Llamando los métodos de la clase Estudiante -Estos no son metódos estaticos. Son metódos llamados 
		a traves de un objeto declarado como tipo de la clase Estudiante.*/
		System.out.println(es1.getNombre());
		System.out.println(es1.getIdentificacion());
		System.out.println(es1.getMateria());
		System.out.println(es1.getCalificacion());
		System.out.println(es1.getEstado());
		System.out.println();
		System.out.println(es2.getNombre());
		System.out.println(es2.getIdentificacion());
		System.out.println(es2.getMateria());
		System.out.println(es2.getCalificacion());
		System.out.println(es2.getEstado());
		System.out.println();
		System.out.println(es3.getNombre());
		System.out.println(es3.getIdentificacion());
		System.out.println(es3.getMateria());
		System.out.println(es3.getCalificacion());
		System.out.println(es3.getEstado());
		System.out.println();
		System.out.println(es4.getNombre());
		System.out.println(es4.getIdentificacion());
		System.out.println(es4.getMateria());
		System.out.println(es4.getCalificacion());
		System.out.println(es4.getEstado());
		System.out.println();
		System.out.println(es5.getNombre());
		System.out.println(es5.getIdentificacion());
		System.out.println(es5.getMateria());
		System.out.println(es5.getCalificacion());
		System.out.println(es5.getEstado());
		System.out.println();
		System.out.println(es6.getNombre());
		System.out.println(es6.getIdentificacion());
		System.out.println(es6.getMateria());
		System.out.println(es6.getCalificacion());
		System.out.println(es6.getEstado());
		System.out.println();
		System.out.println(es7.getNombre());
		System.out.println(es7.getIdentificacion());
		System.out.println(es7.getMateria());
		System.out.println(es7.getCalificacion());
		System.out.println(es7.getEstado());
		System.out.println();
		System.out.println(es8.getNombre());
		System.out.println(es8.getIdentificacion());
		System.out.println(es8.getMateria());
		System.out.println(es8.getCalificacion());
		System.out.println(es8.getEstado());
		System.out.println();
		System.out.println(es9.getNombre());
		System.out.println(es9.getIdentificacion());
		System.out.println(es9.getMateria());
		System.out.println(es9.getCalificacion());
		System.out.println(es9.getEstado());
		System.out.println();
		System.out.println(es10.getNombre());
		System.out.println(es10.getIdentificacion());
		System.out.println(es10.getMateria());
		System.out.println(es10.getCalificacion());
		System.out.println(es10.getEstado());
		System.out.println();
	
	}
}

class Estudiante{
	//sección de datos/campos/variables de clase/atributos
	String nombre;
	int identificacion;
	String materia;
	int calificacion;
	String estado;
	
	//Método constructor
	public Estudiante(String nombre, int identificacion, String materia, int calificacion, String estado){
		setNombre(nombre);
		setIdenticacion(identificacion);
		setMateria(materia);
		setCalificacion(calificacion);
		setEstado(estado);
	}
	
	//Sección de metodos: setters
	/*A excepción de la identificacion que recibe y regresa un entero, los demás métodos reciben y 
	regresan una cadena*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setIdenticacion(int identificacion){
		this.identificacion = identificacion;
	}
	public void setMateria(String materia){
		this.materia = materia;
	}
	public void setCalificacion(int calificacion){
		this.calificacion = calificacion;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	//Sección de metodos: getters
	public String getNombre(){
		return nombre;
	}
	public int getIdentificacion(){
		return identificacion;
	}
	public String getMateria(){
		return materia;
	}
	public int getCalificacion(){
		return calificacion;
	}
	public String getEstado(){
		return estado;
	}
	
	//public String calcularRFC(...){...}
	
}

class CapturaEntrada{
	/*Aqui capturamos lo que sea tecleado por el usuario
	cada uno de estos recibe y regresa un tipo de dato diferente
	ya sea entero o flotante*/
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