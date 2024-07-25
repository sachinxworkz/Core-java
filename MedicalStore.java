import java.util.Arrays;

class MedicalStore{
static String productNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;
	public static boolean addProductName(String productName){
		boolean isProductNameAdded = false;
		if(start<productNames.length){
			if(productName != null){
				productNames[start++] = productName;
				isProductNameAdded = true;
  				System.out.println("alcohol name added");
			}
			else
			System.out.println("Product Name is Invalid");

		}
		else
		System.out.println("Product Names is full");

	return isProductNameAdded;
	}
	public static void showProductNames(){

		for(String productName:productNames){
			System.out.println(productName);
		}
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