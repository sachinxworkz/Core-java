class SmartWatchRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean on = SmartWatch.onOrOff();
		System.out.println("is SmartWatch on : "+on);
	
		on =SmartWatch.onOrOff();
		System.out.println("is SmartWatch on : "+on);
		
		on = SmartWatch.onOrOff();
		System.out.println("is SmartWatch on : "+on);
		
		on =	SmartWatch.onOrOff();
		System.out.println("is SmartWatch on : "+on);
		
		System.out.println("End of main method");
	}
}