class SpeakerRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Speaker.turnOn();
		Speaker.turnOff();
		Speaker.turnOn();
		Speaker.turnOff();
		
		System.out.println("End of main method");
	}
}