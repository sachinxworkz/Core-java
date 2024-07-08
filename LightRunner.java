class LightRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Light.turnOn();
		Light.turnOff();
	    Light.turnOn();
		Light.turnOff();
		
		System.out.println("End of main method");
	}
}