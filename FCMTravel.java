class FCMTravel{

	static String touristPlaceNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addPlaceName(String name){
		
		System.out.println("addPlaceName method started");
		
		boolean isNameAdded = false;
		
		if(start<touristPlaceNames.length){
		
			if(name != null){
				touristPlaceNames[start++]=name;
				isNameAdded = true;
				System.out.println("place name added");
			}else
				System.out.println("place name is invalid");
		}else
			System.out.println("place names are full");
		
		System.out.println("addPlaceName method ended");
			
	return isNameAdded;
	}
	
	public static void readtouristPlaceNames(){
		
		System.out.println("readtouristPlaceNames method started");
		
		System.out.println("Available place names are");
		for(String place : touristPlaceNames)
			System.out.println(place);
		
		System.out.println("readtouristPlaceNames method ended");
	
	return;
	}
}