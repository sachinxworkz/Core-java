class CameraRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean work = Camera.onOrOff();
		System.out.println("is Camera on : "+work);
	
		Camera.increaseZoom();
		Camera.increaseZoom();
		Camera.increaseZoom();
		Camera.increaseZoom();
		Camera.increaseZoom();
		Camera.increaseZoom();
		
		Camera.decreaseZoom();
		Camera.decreaseZoom();
		Camera.decreaseZoom();
		Camera.decreaseZoom();
		Camera.decreaseZoom();
		Camera.decreaseZoom();
		
		
		work =Camera.onOrOff();
		System.out.println("is Camera on : "+work);
		
		Camera.increaseZoom();
		
		Camera.decreaseZoom();
		
		
		System.out.println("End of main method");
	}
}