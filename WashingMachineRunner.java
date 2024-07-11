class WashingMachineRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean run = WashingMachine.onOrOff();
		System.out.println("is Washing Machine on : "+run);
		
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		WashingMachine.increaseSpeed();
		
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
		WashingMachine.decreaseSpeed();
	
		run =WashingMachine.onOrOff();
		System.out.println("is Washing Machine on : "+run);
		
		
		WashingMachine.increaseSpeed();
		
		
		WashingMachine.decreaseSpeed();
		
		System.out.println("End of main method");
	}
}