class WashingMachine{

	static boolean isWashingMachineOn = false ;
	static int maxSpeed = 6;
	static int minSpeed = 0;
	static int currentSpeed;
	
	public static boolean onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isWashingMachineOn == false){
			isWashingMachineOn = true;
			
		}else if(isWashingMachineOn == true){
			isWashingMachineOn = false;
			
		}
		System.out.println("End of turnOn method");
	return isWashingMachineOn;
	}
	
	public static void increaseSpeed(){
		
		System.out.println("Start of increase Speed method");
	
			if(isWashingMachineOn == true){
				if(currentSpeed < maxSpeed){
					currentSpeed = currentSpeed + 1;
					System.out.println("Current Speed is "+ currentSpeed);
				}else System.out.println("Maximum Speed reached");
			}else System.out.println("Turn on the Washing Machine");

		System.out.println("End of increase Speed method");
	return;
	}
	
	public static void decreaseSpeed(){
		
		System.out.println("Start of decrease Speed method");
	
			if(isWashingMachineOn == true){
				if(currentSpeed > minSpeed){
					currentSpeed = currentSpeed - 1;
					System.out.println("Current Speed is "+ currentSpeed);
				}else System.out.println("Minimum Speed reached");
			}else System.out.println("Turn on the Washing Machine");

		System.out.println("End of decrease Speed method");
	return;
	}
}