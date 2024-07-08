class RadioRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Radio.turnOn();
		Radio.turnOff();
		Radio.turnOn();
		Radio.turnOff();
		
		System.out.println("End of main method");
	}
}