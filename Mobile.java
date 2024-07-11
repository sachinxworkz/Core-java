class Mobile{

	static boolean isMobileOn = false ;
	static int maxVolume = 6;
	static int minVolume = 0;
	static int currentVolume;
	
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
	public static void increaseVolume(){
		
		System.out.println("Start of increase volume method");
	
			if(isMobileOn == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1; 
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the Mobile");

		System.out.println("End of increase volume method");
	return;
	}
	
	public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isMobileOn == true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the Mobile");

		System.out.println("End of decrease volume method");
	return;
	}
}