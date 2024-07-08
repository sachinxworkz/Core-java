class FanRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Fan.turnOn();
		Fan.turnOff();
		Fan.turnOn();
		Fan.turnOff();
		
		System.out.println("End of main method");
	}
}