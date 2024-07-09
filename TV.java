class TV{

	static boolean isDisplayOn = false ;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of onOrOff method");
		
		if(isDisplayOn == false){
			isDisplayOn = true;
			
		}
		else if(isDisplayOn == true){
			isDisplayOn = false;
			
		}
		System.out.println("End of onOrOff method");
	return isDisplayOn;
	}
	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isDisplayOn == true){
			isDisplayOn = false;
			System.out.println("TV is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}*/
}