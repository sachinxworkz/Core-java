class WashingMachineRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		WashingMachine.turnOn();
		WashingMachine.turnOff();
		WashingMachine.turnOn();
		WashingMachine.turnOff();
		
		System.out.println("End of main method");
	}
}