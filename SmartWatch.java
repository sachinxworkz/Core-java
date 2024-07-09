class SmartWatch{

	static boolean isSmartWatchOn = false ;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isSmartWatchOn == false){
			isSmartWatchOn = true;
			
		}else if(isSmartWatchOn == true){
			isSmartWatchOn = false;
		
		}
		System.out.println("End of turnOn method");
	return isSmartWatchOn;
	}
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isSmartWatchOn == true){
			isSmartWatchOn = false;
			System.out.println("Smart Watch is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}*/
}