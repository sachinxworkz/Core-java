class ProjectorRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Projector.turnOn();
		Projector.turnOff();
		Projector.turnOn();
		Projector.turnOff();
		
		System.out.println("End of main method");
	}
}