class Refrigerator{

	static boolean isRefrigeratorOn = false ;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isRefrigeratorOn == false){
			isRefrigeratorOn = true;
			
		}else if(isRefrigeratorOn == true){
			isRefrigeratorOn = false;
			
		}
		System.out.println("End of turnOn method");
	return isRefrigeratorOn;
	}
}	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isRefrigeratorOn == true){
			isRefrigeratorOn = false;
			System.out.println("Refrigerator is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}*/