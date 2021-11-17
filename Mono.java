public class Mono extends Animales{
	String clase;
	
	public Mono(String clase, String nombre, int edad){
		super(nombre, edad);
		this.clase = clase;
	}
	
	public void saltar(){
		System.out.println(nombre + "esta saltando entre los arboles.");
	}
	
	@Override
	public void comer(){
		System.out.println(nombre + "esta comiendo platanos.");
	}
	
	@Override
	public void imprimir(){
		System.out.println("Mono.");
		System.out.println("Raza: " + clase);
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
	
	//Setter
	public void setClase(String clase){
		this.clase = clase;
	}
	
	//Getter
	public String getClase(){
		return clase;
	}
}