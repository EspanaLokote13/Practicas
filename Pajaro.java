public class Pajaro{
	String color;
	String tamano;
	String nombre;
	
	public Pajaro(String color, String tamano, String nombre){
	this.color = color;
	this.tamano = tamano;
	this.nombre = nombre;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public void setTamano(String tamano){
		this.tamano = tamano;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getColor(){
		return color;
	}
	public String getTamano(){
		return tamano;
	}
	public String getNombre(){
		return nombre;
	}
}