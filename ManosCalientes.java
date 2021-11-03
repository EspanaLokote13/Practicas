class ManosCalientes extends Robot implements Vegetales, Carne {
	public ManosCalientes(int bateria, String nombre, int num, String accion){
		super(bateria, nombre, num, accion);
	}
	public int Bateria(boolean usando){
		if(usando){
			bateria -= 15;
		}
		return bateria;
	}
	public void nombreRobot(){
		System.out.println("Soy un mini robot con manos calientes, y cocinare correctamente tu comida");
		System.out.println("Mi nombre es: " + getNombre());
		System.out.println("\n");
	}
	public void num(){
		System.out.println("Soy un mini robot con manos calientes, y cocinare correctamente tu comida");
		System.out.println("ID num: " + getNum());
		System.out.println("\n");
	}
	public void Action(String Action){
		System.out.println("Soy un mini robot con manos calientes, y cocinare correctamente tu comida");
		System.out.println("La ultima accion que realice fue " + Action);
		System.out.println("\n");
	}
	
	//método de la interfaz vegetales
	public void vegetalescut(){
		System.out.println("Soy un mini robot con manos calientes, y cocinare correctamente tu comida");
		System.out.println("Estoy cocinando tus vegetales");
		System.out.println("\n");
	}
	
	//método de la interfaz carne
	public  void carnecut(){
		System.out.println("Soy un mini robot con manos calientes, y cocinare correctamente tu comida");
		System.out.println("Estoy cocinando tu corte de carne");
		System.out.println("\n");
	}
}