import java.util.Arrays;

class TeaPoint{

	static String teaNames[] = {null, null, null, null, null, null};
	static int start;
	
	public static boolean addTeaNames(String teaName){
		boolean isTeaNameAdded = false;
		
		if(start<teaNames.length){
		
		if(teaName != null){
			teaNames[start++]=teaName;
			isTeaNameAdded = true;
			System.out.println("Tea name added");
		}else
			System.out.println("Tea name is invalid");
		}else
			System.out.println("Tea names are full");
			
	return isTeaNameAdded;
	}
	
	public static void readTeaNames(){
		
		System.out.println("Available tea names are");
		for(String tea : teaNames)
			System.out.println(tea);
	
	return;
	}
	
	public static boolean updateTeaName(String newTeaName, String oldTeaName){
		
		System.out.println("updateTeaName method started");
		
		boolean isTeaNameUpdated = false;
		
		for(int index=0; index < teaNames.length; index++){
			if(teaNames[index] == oldTeaName){
				teaNames[index] = newTeaName;
				isTeaNameUpdated = true;
				System.out.println(newTeaName +" updated");
			}
		}
		
			if(isTeaNameUpdated == false)
			System.out.println(oldTeaName +" not found");
		
		
		System.out.println("updateTeaName method ended");
	return 	isTeaNameUpdated;
	}
	
	public static boolean deleteTeaName(String teaName){
		System.out.println("deleteTeaName method started");
		boolean isTeaNameDeleted = false;
		
		int index, newIndex;
		for(index = 0, newIndex = 0; index < teaNames.length; index++){
			if(teaNames[index] != teaName){
				teaNames[newIndex] = teaNames[index];
				newIndex++;
				
			}else
				isTeaNameDeleted = true;
		}
		int newLength = newIndex;
		teaNames = Arrays.copyOf(teaNames , newLength);
		
		if(isTeaNameDeleted == false)
			System.out.println(teaName + " not found");
		
		System.out.println("deleteTeaName method ended");
	return 	isTeaNameDeleted;
	}
}