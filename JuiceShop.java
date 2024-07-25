import java.util.Arrays;

class JuiceShop{
static String juiceNames[] = {null,null,null,null,null,null};
static int start;
	public static boolean addJuiceName(String juiceName){
		boolean isJuiceNameAdded = false;
		if(start<juiceNames.length){
			if(juiceName != null){
				juiceNames[start++] = juiceName;
				isJuiceNameAdded = true;
				System.out.println("juice name added");
			}
			else
			System.out.println("JuiceName is Invalid");

		}
		else
			System.out.println("Juice Names is full");
		return isJuiceNameAdded;
	}
	public static void showJuiceNames(){

		for(String juiceName:juiceNames)
		System.out.println(juiceName);
	}
	
	public static boolean updateJuiceName(String newJuiceNames, String oldJuiceNames){
		
		System.out.println("updateJuiceName method started");
		
		boolean isJuiceNameUpdated = false;
		
		for(int index=0; index < juiceNames.length; index++){
			if(juiceNames[index] == oldJuiceNames){
				juiceNames[index] = newJuiceNames;
				isJuiceNameUpdated = true;
				System.out.println(newJuiceNames +" updated");
			}
		}
		
			if(isJuiceNameUpdated == false)
			System.out.println(oldJuiceNames +" not found");
		
		
		System.out.println("updateJuiceName method ended");
	return 	isJuiceNameUpdated;
	}
	
	public static boolean deleteJuiceName(String juiceName){
		System.out.println("deleteJuiceName method started");
		boolean isjuiceNameDeleted = false;
		
		int index, newIndex;
		for(index = 0, newIndex = 0; index < juiceNames.length; index++){
			if(juiceNames[index] != juiceName){
				juiceNames[newIndex] = juiceNames[index];
				newIndex++;
				
			}else
				isjuiceNameDeleted = true;
		}
		int newLength = newIndex;
		juiceNames = Arrays.copyOf(juiceNames , newLength);
		
		if(isjuiceNameDeleted == false)
			System.out.println(juiceName + " not found");
		
		System.out.println("deleteJuiceName method ended");
	return 	isjuiceNameDeleted;
	}
}