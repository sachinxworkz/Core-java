import java.util.Arrays;

class MRPStore{
	
static String alcoholNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;

	public static boolean addAlcoholName(String alchoholName){
		boolean isAlcoholNameAdded = false;
		if(start<alcoholNames.length){
			if(alchoholName != null){
				alcoholNames[start++] = alchoholName;
				isAlcoholNameAdded = true;
				System.out.println("alcohol name added");
			}
			else
			System.out.println("Alcohol Name is Invalid");

		}
		else
			System.out.println("Alcohol Names is full");
			
	return isAlcoholNameAdded;
	}
	public static void getAlcoholNames(){

		for(String name:alcoholNames){
			System.out.println(name);
		}

	}
	
	public static boolean updateAlcoholName(String newAlcoholName, String oldAlcoholName){
		
		System.out.println("updateAlcoholName method started");
		
		boolean isAlcoholNameUpdated = false;
		
		for(int index=0; index < alcoholNames.length; index++){
			if(alcoholNames[index] == oldAlcoholName){
				alcoholNames[index] = newAlcoholName;
				isAlcoholNameUpdated = true;
				System.out.println(newAlcoholName +" updated");
			}
		}
		
			if(isAlcoholNameUpdated == false)
			System.out.println(oldAlcoholName +" not found");
		
		
		System.out.println("updateAlcoholName method ended");
	return 	isAlcoholNameUpdated;
	}
	
	public static boolean deleteAlcoholName(String AlcoholName){
		System.out.println("deleteAlcoholName method started");
		boolean isAlcoholNameDeleted = false;
		
		int index, newIndex;
		for(index = 0, newIndex = 0; index < alcoholNames.length; index++){
			if(alcoholNames[index] != AlcoholName){
				alcoholNames[newIndex] = alcoholNames[index];
				newIndex++;
				
			}else
				isAlcoholNameDeleted = true;
		}
		int newLength = newIndex;
		alcoholNames = Arrays.copyOf(alcoholNames , newLength);
		
		if(isAlcoholNameDeleted == false)
			System.out.println(AlcoholName + " not found");
		
		System.out.println("deleteAlcoholName method ended");
	return 	isAlcoholNameDeleted;
	}
}