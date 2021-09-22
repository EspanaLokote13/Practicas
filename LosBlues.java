public class LosBlues extends Pajaro{

	String poder;
	
	public LosBlues(String color, String tamano, String nombre, String poder){
		super(color, tamano, nombre);
		this.poder = poder;
	}
	
	public void setPoder(String poder){
		this.poder = poder;
	}
	
	public String getPoder(){
		return poder;
	}
	
}

class Chuck extends Pajaro{

	String poder;
	
	public Chuck(String color, String tamano, String nombre, String poder){
		super(color, tamano, nombre);
		this.poder = poder;
	}
	
	public void setPoder(String poder){
		this.poder = poder;
	}
	
	public String getPoder(){
		return poder;
	}
	
}

class Bomb extends Pajaro{

	String poder;
	
	public Bomb(String color, String tamano, String nombre, String poder){
		super(color, tamano, nombre);
		this.poder = poder;
	}
	
	public void setPoder(String poder){
		this.poder = poder;
	}
	
	public String getPoder(){
		return poder;
	}
	
}