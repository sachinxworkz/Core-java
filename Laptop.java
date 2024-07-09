class Laptop{

	static boolean isLaptopOn = false ;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isLaptopOn == false){
			isLaptopOn = true;
	
		}else if(isLaptopOn == true){
			isLaptopOn = false;
		
		}
		System.out.println("End of turnOn method");
	return isLaptopOn;
	}
}	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isLaptopOn == true){
			isLaptopOn = false;
			System.out.println("Laptop is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}*/