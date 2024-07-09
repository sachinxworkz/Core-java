class Camera{

	static boolean isCameraOn = false ;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isCameraOn == false){
			isCameraOn = true;
			
		}else if(isCameraOn == true){
			isCameraOn = false;
			
		}
		System.out.println("End of turnOn method");
	return isCameraOn;
	}
}
	/* public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isCameraOn == true){
			isCameraOn = false;
			System.out.println("Camera is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}*/