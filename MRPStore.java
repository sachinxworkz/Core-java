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
}