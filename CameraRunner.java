class CameraRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean work = Camera.onOrOff();
		System.out.println("is Camera on : "+work);
	
		work =Camera.onOrOff();
		System.out.println("is Camera on : "+work);
		
		work = Camera.onOrOff();
		System.out.println("is Camera on : "+work);
		
		work =	Camera.onOrOff();
		System.out.println("is Camera on : "+work);
		
		
		System.out.println("End of main method");
	}
}