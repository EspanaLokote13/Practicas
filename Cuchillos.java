class Cuchillos extends Robot implements Vegetales, Carne {
	public Cuchillos(int bateria, String nombre, int num, String accion){
		super(bateria, nombre, num, accion);
	}
	
	public int Bateria(boolean usando){
		if(usando){
			bateria -= 10;
		}
		return bateria;
	}
	public void nombreRobot(){
		System.out.println("Soy un mini robot con cuchillos, y preparare tus vegetales y corte de carne");
		System.out.println("Mi nombre es: " + getNombre());
		System.out.println("\n");
	}
	public void num(){
		System.out.println("Soy un mini robot con cuchillos, y preparare tus vegetales y corte de carne");
		System.out.println("ID num: " + getNum());
		System.out.println("\n");
	}
	public void Action(String Action){
		System.out.println("Soy un mini robot con cuchillos, y preparare tus vegetales y corte de carne");
		System.out.println("La ultima accion que realice fue " + Action);
		System.out.println("\n");
	}
	
	//método de la interfaz vegetales
	public void vegetalescut(){
		System.out.println("Soy un mini robot con cuchillos, y preparare tus vegetales y corte de carne");
		System.out.println("Estoy cortando tus vegetales");
		System.out.println("\n");
	}
	
	//método de la interfaz carne
	public  void carnecut(){
		System.out.println("Soy un mini robot con cuchillos, y preparare tus vegetales y corte de carne");
		System.out.println("Estoy cortando la carne");
		System.out.println("\n");
	}
}