class SmartWatchRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean on = SmartWatch.onOrOff();
		System.out.println("is SmartWatch on : "+on);
		
		SmartWatch.increaseVolume();
		SmartWatch.increaseVolume();
		SmartWatch.increaseVolume();
		SmartWatch.increaseVolume();
		SmartWatch.increaseVolume();
		SmartWatch.increaseVolume();
		SmartWatch.increaseVolume();
		
		SmartWatch.decreaseVolume();
		SmartWatch.decreaseVolume();
		SmartWatch.decreaseVolume();
		SmartWatch.decreaseVolume();
		SmartWatch.decreaseVolume();
		SmartWatch.decreaseVolume();
		SmartWatch.decreaseVolume();
	
		on =SmartWatch.onOrOff();
		System.out.println("is SmartWatch on : "+on);
		
		SmartWatch.increaseVolume();
		SmartWatch.decreaseVolume();
		
		System.out.println("End of main method");
	}
}