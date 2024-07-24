class FCMTravelRunner{
	
	public static void main(String[] place){
		System.out.println("Main started");
	
		boolean addPlace = FCMTravel.addPlaceName("Maldives");
		 
		addPlace = FCMTravel.addPlaceName("Goa");
		 
		addPlace = FCMTravel.addPlaceName("USA");
		 
		addPlace = FCMTravel.addPlaceName("Singapore");
		 
		addPlace = FCMTravel.addPlaceName("Malesia");
		 
		addPlace = FCMTravel.addPlaceName("Baali");
		 
		addPlace = FCMTravel.addPlaceName("Tirkey");
		 
		addPlace = FCMTravel.addPlaceName("Coorge");
		 
		addPlace = FCMTravel.addPlaceName("Netherland");
		 
		addPlace = FCMTravel.addPlaceName("Malesia");
		 
		addPlace = FCMTravel.addPlaceName("Japan");
		 
		FCMTravel.readtouristPlaceNames();
		
		System.out.println("Main ended");
	}
}