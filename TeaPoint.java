class TeaPoint{

	static String teaNames[] = {null, null, null, null, null, null};
	static int start;
	
	public static boolean addTeaNames(String teaName){
		boolean isTeaNameAdded = false;

		/*if(start < teaNames.length);*/

		if(teaName != null){
			teaNames[start++]=teaName;
			isTeaNameAdded = true;
		}else
			System.out.println("Tea name is invalid");
			
	return isTeaNameAdded;
	}
	
	public static void readTeaNames(){
		
		System.out.println("Available tea names are");
		for(String tea : teaNames)
			System.out.println(tea);
	
	return;
	}
}