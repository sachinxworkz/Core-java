class RefrigeratorRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean work = Refrigerator.onOrOff();
		System.out.println("is Refrigerator on : "+work);
		
		Refrigerator.increaseFreez();
		Refrigerator.increaseFreez();
		Refrigerator.increaseFreez();
		Refrigerator.increaseFreez();
		Refrigerator.increaseFreez();
		Refrigerator.increaseFreez();
		Refrigerator.increaseFreez();
		
		Refrigerator.decreaseFreez();
		Refrigerator.decreaseFreez();
		Refrigerator.decreaseFreez();
		Refrigerator.decreaseFreez();
		Refrigerator.decreaseFreez();
		Refrigerator.decreaseFreez();
		Refrigerator.decreaseFreez();
	
		work =Refrigerator.onOrOff();
		System.out.println("is Refrigerator on : "+work);
		
		Refrigerator.increaseFreez();
		
		Refrigerator.decreaseFreez();
		
		System.out.println("End of main method");
	}
}