public class Animales{
	String nombre;
	int edad;
	boolean vacunado;
	boolean atendido;
	
	public Animales(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void comer(){
		System.out.println(nombre + "esta comiendo");
	}
	
	public void dormir(){
		System.out.println(nombre + "esta durmiendo");
	}
	
	public void imprimir(){
		System.out.println("Animales en el zoologico");
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
	
	//Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setVacunado(boolean vacunado){
		this.vacunado = vacunado;
	}
	public void setAtendido(boolean atendido){
		this.atendido = atendido;
	}
	
	//Getters
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public boolean getVacunado(){
		return vacunado;
	}
	public boolean getAtendido(){
		return atendido;
	}
	
}