class HeaterRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Heater.turnOn();
		Heater.turnOff();
		Heater.turnOn();
		Heater.turnOff();
		
		System.out.println("End of main method");
	}
}