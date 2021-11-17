public class Veterinarian{
	String nombre;
	double salario;
	String genero;
	int experiencia;
	
	public Veterinarian(String nombre, double salario, String genero, int experiencia){
		this.nombre = nombre;
		this.salario = salario;
		this.genero = genero;
		this.experiencia = experiencia;
	}
	
	public void vaccinate(Animales animal){
		animal.setVacunado(true);
		System.out.println(animal.getNombre() + " Fue vacunado correctamente!");
	}
	
	public void atender(Animales animal){
		animal.setAtendido(true);
		System.out.println(animal.getNombre() + " fue atendido por el veterinario");
	}
	
	//Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	public void setExperiencia(int Experiencia){
		this.experiencia = experiencia;
	}
	
	//Getters
	public String getNombre(){
		return nombre;
	}
	public double getSalario(){
		return salario;
	}
	public String getGenero(){
		return genero;
	}
	public int getExperiencia(){
		return experiencia;
	}
	
}