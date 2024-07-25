import java.util.Arrays;

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
	
	public static boolean updatePlaceName(String newPlaceName, String oldPlaceName){
		
		System.out.println("updatePlaceName method started");
		
		boolean isPlaceNameUpdated = false;
		
		for(int index=0; index < touristPlaceNames.length; index++){
			if(touristPlaceNames[index] == oldPlaceName){
				touristPlaceNames[index] = newPlaceName;
				isPlaceNameUpdated = true;
				System.out.println(newPlaceName +" updated");
			}
		}
		
			if(isPlaceNameUpdated == false)
			System.out.println(oldPlaceName +" not found");
		
		
		System.out.println("updatePlaceName method ended");
	return 	isPlaceNameUpdated;
	}
	
	public static boolean deletePlaceName(String placeName){
		System.out.println("deletePlaceName method started");
		boolean isplaceNameDeleted = false;
		
		int index, newIndex;
		for(index = 0, newIndex = 0; index < touristPlaceNames.length; index++){
			if(touristPlaceNames[index] != placeName){
				touristPlaceNames[newIndex] = touristPlaceNames[index];
				newIndex++;
				
			}else
				isplaceNameDeleted = true;
		}
		int newLength = newIndex;
		touristPlaceNames = Arrays.copyOf(touristPlaceNames , newLength);
		
		if(isplaceNameDeleted == false)
			System.out.println(placeName + " not found");
		
		System.out.println("deletePlaceName method ended");
	return 	isplaceNameDeleted;
	}
}