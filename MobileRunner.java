class MobileRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean working = Mobile.onOrOff();
		System.out.println("is Mobile on : "+working);
		
		Mobile.increaseVolume();
		Mobile.increaseVolume();
		Mobile.increaseVolume();
		Mobile.increaseVolume();
		Mobile.increaseVolume();
		Mobile.increaseVolume();
		Mobile.increaseVolume();
		Mobile.increaseVolume();
		
		Mobile.decreaseVolume();
		Mobile.decreaseVolume();
		Mobile.decreaseVolume();
		Mobile.decreaseVolume();
		Mobile.decreaseVolume();
		Mobile.decreaseVolume();
		Mobile.decreaseVolume();
		Mobile.decreaseVolume();
		
		
		working =Mobile.onOrOff();
		System.out.println("is Mobile on : "+working);
		
		Mobile.increaseVolume();
		
		Mobile.decreaseVolume();
		
		System.out.println("End of main method");
	}
}