class AmazonProducts {

    static String productNames[] = {null, null, null, null, null, null, null, null, null, null};
    static int start;

    public static boolean addProductName(String productName) {
        boolean isProductNameAdded = false;

        if (productName != null) {
        
            productNames[start++] = productName;
            isProductNameAdded = true;
        } else {
            System.out.println("Product name is invalid");
        }

        return isProductNameAdded;
    }

    public static void readProductNames(){
		
		System.out.println("Available product names are");
		for(String product : productNames){
			System.out.println(product);
        }
	return;
	}
    }
