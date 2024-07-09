class WashingMachineRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean run = WashingMachine.onOrOff();
		System.out.println("is Washing Machine on : "+run);
	
		run =WashingMachine.onOrOff();
		System.out.println("is Washing Machine on : "+run);
		
		run = WashingMachine.onOrOff();
		System.out.println("is Washing Machine on : "+run);
		
		run =	WashingMachine.onOrOff();
		System.out.println("is Washing Machine on : "+run);
		
		System.out.println("End of main method");
	}
}