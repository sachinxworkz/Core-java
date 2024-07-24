class AmazonProductsRunner{
	
	public static void main(String[] product){
		System.out.println("Main started");
	
		boolean productAdded = AmazonProducts.addProductName("Iphone 13");
		System.out.println("Product name added");

         productAdded = AmazonProducts.addProductName("Airpodes");
		System.out.println("Product name added");

        productAdded = AmazonProducts.addProductName("Macbook Air");
		System.out.println("Product name added");

        productAdded =AmazonProducts.addProductName("Nothing 2a");
		System.out.println("Product name added");

        productAdded = AmazonProducts.addProductName("SmartWatch");
		System.out.println("JProduct name added");

        productAdded = AmazonProducts.addProductName("Charger");
		System.out.println("Product name added");

        productAdded = AmazonProducts.addProductName("Clothes");
		System.out.println("Product name added");

        productAdded = AmazonProducts.addProductName("Camera");
		System.out.println("Product name added");

        productAdded = AmazonProducts.addProductName("Speaker");
		System.out.println("Product name added");

        productAdded = AmazonProducts.addProductName("Books");
		System.out.println("Product name added");

        
		
		AmazonProducts.readProductNames();
		
		System.out.println("Main ended");
	}
}