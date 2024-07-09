class MobileRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean working = Mobile.onOrOff();
		System.out.println("is Mobile on : "+working);
	
		working =Mobile.onOrOff();
		System.out.println("is Mobile on : "+working);
		
		working = Mobile.onOrOff();
		System.out.println("is Mobile on : "+working);
		
		working =	Mobile.onOrOff();
		System.out.println("is Mobile on : "+working);
		
		System.out.println("End of main method");
	}
}