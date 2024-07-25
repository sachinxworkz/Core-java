import java.util.Arrays;

class AmazonProduct{

	static String productNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addProductName(String name){
		
		System.out.println("addProductName method started");
		
		boolean isNameAdded = false;
		
		if(start<productNames.length){
		
			if(name != null){
				productNames[start++]=name;
				isNameAdded = true;
				System.out.println("product name added");
			}else
				System.out.println("product name is invalid");
		}else
			System.out.println("product names are full");
		
		System.out.println("addProductName method ended");
			
	return isNameAdded;
	}
	
	public static void readProductNames(){
		
		System.out.println("readProductNames method started");
		
		System.out.println("Available product names are");
		for(String product : productNames)
			System.out.println(product);
		
		System.out.println("readProductNames method ended");
	
	return;
	}
	
	public static boolean updateProductName(String newProductName, String oldProductName){
		
		System.out.println("updateProductName method started");
		
		boolean isProductNameUpdated = false;
		
		for(int index=0; index < productNames.length; index++){
			if(productNames[index] == oldProductName){
				productNames[index] = newProductName;
				isProductNameUpdated = true;
				System.out.println(newProductName +" updated");
			}
		}
		
			if(isProductNameUpdated == false)
			System.out.println(oldProductName +" not found");
		
		
		System.out.println("updateProductName method ended");
	return 	isProductNameUpdated;
	}
	
	public static boolean deleteProductName(String productName){
		System.out.println("deleteProductName method started");
		boolean isproductNameDeleted = false;
		
		int index, newIndex;
		for(index = 0, newIndex = 0; index < productNames.length; index++){
			if(productNames[index] != productName){
				productNames[newIndex] = productNames[index];
				newIndex++;
				
			}else
				isproductNameDeleted = true;
		}
		int newLength = newIndex;
		productNames = Arrays.copyOf(productNames , newLength);
		
		if(isproductNameDeleted == false)
			System.out.println(productName + " not found");
		
		System.out.println("deleteProductName method ended");
	return 	isproductNameDeleted;
	}
}