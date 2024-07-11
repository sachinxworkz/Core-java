class TV{

	static boolean isDisplayOn = false ;
	static int maxVolume = 6;
	static int minVolume = 0;
	static int currentVolume;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of onOrOff method");
		
		/*ref = condition ? value1: value2 ;

		isDisplayOn = (isDisplayOn == false) ? true : false ;*/



		if(!isDisplayOn)	isDisplayOn = true;
		else	isDisplayOn = false;
		
		System.out.println("End of onOrOff method");
	return isDisplayOn;
	}
	public static void increaseVolume(){
		
		System.out.println("Start of increase volume method");
	
			if(isDisplayOn == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1;
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Maximum volume reached");
			}else System.out.println("Turn on the tv");

		System.out.println("End of increase volume method");
	return;
	}
	
	public static void decreaseVolume(){
		
		System.out.println("Start of decrease volume method");
	
			if(isDisplayOn == true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println("Current volume is "+ currentVolume);
				}else System.out.println("Minimum volume reached");
			}else System.out.println("Turn on the tv");

		System.out.println("End of decrease volume method");
	return;
	}
}