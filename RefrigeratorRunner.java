class RefrigeratorRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean work = Refrigerator.onOrOff();
		System.out.println("is Refrigerator on : "+work);
	
		work =Refrigerator.onOrOff();
		System.out.println("is Refrigerator on : "+work);
		
		work = Refrigerator.onOrOff();
		System.out.println("is Refrigerator on : "+work);
		
		work =	Refrigerator.onOrOff();
		System.out.println("is Refrigerator on : "+work);
		
		System.out.println("End of main method");
	}
}