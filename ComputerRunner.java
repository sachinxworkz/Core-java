class ComputerRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Computer.turnOn();
		Computer.turnOff();
		Computer.turnOn();
		Computer.turnOff();
		
		System.out.println("End of main method");
	}
}