class TVRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean connect = TV.onOrOff();
		System.out.println("is tv on : "+connect);
	
		connect =TV.onOrOff();
		System.out.println("is tv on : "+connect);
		
		connect = TV.onOrOff();
		System.out.println("is tv on : "+connect);
		
		connect =	TV.onOrOff();
		System.out.println("is tv on : "+connect);
		
		System.out.println("End of main method");
	}
}