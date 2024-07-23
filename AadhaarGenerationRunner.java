class AadhaarGenerationRunner{

	public static void main(String[] aadhaar){
	
		AadhaarGeneration.createAadhaar("Dileep", "08/01/2003", "male", 9885294456L, "lingadahalli" , "dileep@gmail.com", "GVP524D", "dil2020", "Dileep1234", "Dileep1234");
	
		AadhaarGeneration.readAadhaarDetails();
	}
}