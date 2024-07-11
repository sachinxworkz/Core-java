class TVRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		boolean connect = TV.onOrOff();
		System.out.println("is tv on : "+connect);
		
		TV.increaseVolume();
		TV.increaseVolume();
		TV.increaseVolume();
		TV.increaseVolume();
		TV.increaseVolume();
		TV.increaseVolume();
		TV.increaseVolume();
		TV.increaseVolume();
		
		TV.decreaseVolume();
		TV.decreaseVolume();
		TV.decreaseVolume();
		TV.decreaseVolume();
		TV.decreaseVolume();
		TV.decreaseVolume();
		TV.decreaseVolume();
		TV.decreaseVolume();
	
		connect =TV.onOrOff();
		System.out.println("is tv on : "+connect);
		
		TV.increaseVolume();
		TV.decreaseVolume();
		
		System.out.println("End of main method");
	}
}