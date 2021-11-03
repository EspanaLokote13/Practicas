class MagnumOpus{
	
	boolean cuchillos = false;
	boolean manoscalientes = false;
	boolean robotchef = false;
	
	Cuchillos robotCuchillos = new Cuchillos(100, "Robot con 2 cuchillos", 1234, "cortar carne y vegetales");
	ManosCalientes robotManos = new ManosCalientes(100, "Robot manos calientes", 2345, "cocinar carne y vegetales");
	RobotChef Chef = new RobotChef(100, "Robot Chef", 3456, "Servir platillo");	

	public static void main (String args[]){
		
		MagnumOpus menus = new MagnumOpus();
		menus.menuPrincipal();
	}

	public void menuPrincipal(){

		int opc;
		
		do{
			System.out.println("\n");
			System.out.println("Seleccione un Robot: ");
			System.out.println("1. Mini Robot Chef cuchillos.");
			System.out.println("2. Mini Robot Chef Manos Calientes.");
			System.out.println("3. Robot Chef ");
			System.out.println("4. Salir.");
			
			opc = CapturaEntrada.capturarEntero(" ");
			
			switch (opc){
				case 1:	 
					menuCuchillos();
					cuchillos = true;
					System.out.println("Bateria: " + robotCuchillos.Bateria(cuchillos));
					break;
				
				case 2:	 
					if(cuchillos){
						menuManos();
						manoscalientes = true;
						System.out.println("Bateria: " + robotManos.Bateria(manoscalientes));
					}
					else{
						System.out.println("Primero hay que cortar los vegetales y la carne"); 
					}
					break;
				
				case 3:	 
					if(cuchillos && manoscalientes){
						menuServir();
						robotchef = true;
						System.out.println("Bateria: " + Chef.Bateria(robotchef));
					}
					else{
						System.out.println("Primero hay que cocinar los vegetales y la carne"); 
					}
					break;
				
				default:
					if (opc == 4){
						break;
					}
					else{
						System.out.println("Opcion incorrecta.");
					}
						 break;
			}
			System.out.println("\n");
		}while(opc != 4);
	}//fin de menuPrincipal
	
	
	public void menuCuchillos(){
		int opc;
		System.out.println("Bateria: " + robotCuchillos.Bateria(cuchillos));
		robotCuchillos.nombreRobot();
		robotCuchillos.num();
		robotCuchillos.Action(robotCuchillos.getAccion());
		System.out.println("\n");	
		
		do{
			System.out.println("1. Cortar vegetales.");
			System.out.println("2. Cortar carne.");
			System.out.println("3. Regresar");
			opc = CapturaEntrada.capturarEntero(" ");
			
			switch (opc){
				case 1:	 
					robotCuchillos.vegetalescut();
					break;
				case 2:	
					robotCuchillos.carnecut();
					break;
				default: 
					System.out.println("Opcion incorrecta.");
			}
			System.out.println("\n");
		}while(opc != 3);
	}//fin de menuCuchillos

	
	public void menuManos(){
		int opc;
		System.out.println("Bateria: " + robotManos.Bateria(manoscalientes));
		robotManos.nombreRobot();
		robotManos.num();
		robotManos.Action(robotManos.getAccion());
		System.out.println("\n");
		
		do{
			System.out.println("1. Cocinar vegetales.");
			System.out.println("2. Cocinar carne.");
			System.out.println("3. Regresar.");
			opc = CapturaEntrada.capturarEntero(" ");
			switch (opc){
				case 1:	
					robotManos.vegetalescut();
					break;
				case 2:	
					robotManos.carnecut();
					break;
				default: 
					System.out.println("Opcion incorrecta.");
			}
			System.out.println("\n");
		}while(opc != 3);
	}//fin de menuManos
	
	
	public void menuServir(){
		int opc;
		System.out.println("Bateria: " + Chef.Bateria(robotchef));
		Chef.nombreRobot();
		Chef.num();
		Chef.Action(Chef.getAccion());
		System.out.println("\n");
		
		do{
			System.out.println("1. Servir vegetales");
			System.out.println("2. Servir carne. ");
			System.out.println("3. Presentar platillo.");
			opc = CapturaEntrada.capturarEntero(" ");
			switch (opc){
				case 1:	
					Chef.vegetalescut();
					break;
				case 2:	
					Chef.carnecut();
					break;
				case 3:	
					System.out.println("¡Hurra! El plato estaba delicioso");
					break;
				default: 
					System.out.println("Opcion no encontrada.");
			}
			System.out.println("\n");
		}while(opc != 3);
	}
}//fin de clase Menus