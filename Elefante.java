public class Elefante extends Animales{
	String barritar;
	
	public Elefante(String barritar,String nombre, int edad){
		super(nombre, edad);
		this.barritar = barritar;
	}
	
	public void Trompa(){
		System.out.println(nombre + "esta usando su trompa");
	}
	
	@Override
	public void comer(){
		System.out.println(nombre + "esta comiendo fruta y corteza.");
	}
	
	@Override
	public void imprimir(){
		System.out.println("Elefante.");
		System.out.println("Barrito: " + barritar);
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
	
	//Setter
	public void setBarritar(String barritar){
		this.barritar =barritar;
	}
	
	//Getter
	public String getBarritar(){
		return barritar;
	}
}