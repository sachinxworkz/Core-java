class LaptopRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean running = Laptop.onOrOff();
		System.out.println("is Laptop on : "+running);
	
		running =Laptop.onOrOff();
		System.out.println("is Laptop on : "+running);
		
		running = Laptop.onOrOff();
		System.out.println("is Laptop on : "+running);
		
		running =	Laptop.onOrOff();
		System.out.println("is Laptop on : "+running);
		
		System.out.println("End of main method");
	}
}