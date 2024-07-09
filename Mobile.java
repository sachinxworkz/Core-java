class Mobile{

	static boolean isMobileOn = false ;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isMobileOn == false){
			isMobileOn = true;
		
		}else if(isMobileOn == true){
			isMobileOn = false;
			
		}
		System.out.println("End of turnOn method");
	return isMobileOn;
	}	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isMobileOn == true){
			isMobileOn = false;
			System.out.println("Mobile is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}*/
}