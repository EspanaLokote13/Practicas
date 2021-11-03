class RobotChef extends Robot implements Vegetales, Carne{
	public RobotChef(int bateria, String nombre, int num, String accion){
		super(bateria, nombre, num, accion);
	}

	public int Bateria(boolean usando){
		if(usando){
			bateria -= 20;
		}
		return bateria;
	}
	
	public void nombreRobot(){
		System.out.println("Soy Robot Chef y te preprare el platillo.");
		System.out.println("Mi nombre es: " + getNombre());
		System.out.println("\n");
	}
	
	public void num(){
		System.out.println("Soy Robot Chef y te preprare el platillo.");
		System.out.println("ID num: " + getNum());
		System.out.println("\n");
	}
	
	public void Action(String Action){
		System.out.println("Soy Robot Chef y te preprare el platillo.");
		System.out.println("La ultima accion que realice fue " + Action);
		System.out.println("\n");
	}
	
	public void vegetalescut(){
		System.out.println("Soy Robot Chef y te preprare el platillo.");
		System.out.println("Te estoy sirvierdo tus vegetales favoritos");
		System.out.println("\n");
	}
	
	public  void carneWorks(){
		System.out.println("Soy Robot Chef y te preprare el platillo.");
		System.out.println("Te estoy sirvierto tu corte de carne favorito.");
		System.out.println("\n");
	}
}