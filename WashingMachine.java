class WashingMachine{

	static boolean isWashingMachineOn = false ;
	
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
/*	public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isWashingMachineOn == true){
			isWashingMachineOn = false;
			System.out.println("Washing Machine is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}*/
}