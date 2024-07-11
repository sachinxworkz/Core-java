class Refrigerator{

	static boolean isRefrigeratorOn = false ;
	static int maxFreez = 6;
	static int minFreez = 0;
	static int currentFreez;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
       isRefrigeratorOn =(isRefrigeratorOn== false)? true : false;
	   

		/*if(isRefrigeratorOn == false){
			isRefrigeratorOn = true;
			
		}else if(isRefrigeratorOn == true){
			isRefrigeratorOn = false;
			
		}*/
		System.out.println("End of turnOn method");
	return isRefrigeratorOn;
	}
	public static void increaseFreez(){
		
		System.out.println("Start of increase freez method");
	
			if(isRefrigeratorOn == true){
				if(currentFreez < maxFreez){
					currentFreez = currentFreez + 1;
					System.out.println("Current freez is "+ currentFreez);
				}else System.out.println("Maximum freez reached");
			}else System.out.println("Turn on the Refrigerator");

		System.out.println("End of increase freez method");
	return;
	}
	
	public static void decreaseFreez(){
		
		System.out.println("Start of decrease freez method");
	
			if(isRefrigeratorOn == true){
				if(currentFreez > minFreez){
					currentFreez = currentFreez - 1;
					System.out.println("Current freez is "+ currentFreez);
				}else System.out.println("Minimum freez reached");
			}else System.out.println("Turn on the Refrigerator");

		System.out.println("End of decrease freez method");
	return;
	}
}	
	