class FCMTravelRunner{
	
	public static void main(String[] place){
		System.out.println("Main started");
	
		FCMTravel.addPlaceName("coorg");
		 
		FCMTravel.addPlaceName("chikmagaluru");
		 
		FCMTravel.addPlaceName("mysore");
		 
		FCMTravel.addPlaceName("nandi hills");
		 
		FCMTravel.addPlaceName("mangalore");
		 
		FCMTravel.addPlaceName("hampi");
		 
		FCMTravel.addPlaceName("murudeshwar");
		 
		FCMTravel.addPlaceName("sakleshpur");
		 
		FCMTravel.addPlaceName("bidar");
		 
		FCMTravel.addPlaceName("hoskote");
		 
		FCMTravel.addPlaceName("belgaum");
		 
		FCMTravel.readtouristPlaceNames();
		
		FCMTravel.updatePlaceName("joga" , "bidar");
		
		FCMTravel.readtouristPlaceNames();
		
		FCMTravel.deletePlaceName("belgaum");
		
		FCMTravel.readtouristPlaceNames();
		
		System.out.println("Main ended");
	}
}