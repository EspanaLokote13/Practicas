//Clase principal
abstract class Robot{ 
	int bateria;
	String nombre;
	int num;
	String accion;
	
	public Robot(int bateria, String nombre, int num, String accion){
		this.bateria = bateria;
		this.nombre = nombre;
		this.num = num;
		this.accion = accion;
	}
	
	public abstract int Bateria(boolean usando);
	public abstract void nombreRobot();
	public abstract void num();
	public abstract void Action(String Action);
	
	
	
	public void setBateria(int bateria){
		this.bateria = bateria;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setNum(int num){
		this.num = num;
	}
	public void setAccion(String accion){
		this.accion = accion;
	}
	
	public int getBateria(){
		return bateria;
	}
	public String getNombre(){
		return nombre;
	}
	public int getNum(){
		return num;
	}
	public String getAccion(){
		return accion;
	}
	
}