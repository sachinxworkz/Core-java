class AmazonProductRunner{
	
	public static void main(String[] item){
		System.out.println("Main started");
	
		Amazon.addProductName("laptop");
		 
		Amazon.addProductName("smartwatches");
		 
		Amazon.addProductName("headphones");
		 
		Amazon.addProductName("cameras");
		 
		Amazon.addProductName("tablets");
		 
		Amazon.addProductName("speakers");
		 
		Amazon.addProductName(" washing machine");
		 
		Amazon.addProductName("projectors");
		 
		Amazon.addProductName("tv");
		 
		Amazon.addProductName("DVD players");
		 
		Amazon.addProductName("chargers");
		 
		Amazon.readProductNames();
		
		Amazon.updateProductName("mobile" , "tablets" );
		
		Amazon.readProductNames();
		
		Amazon.deleteProductName("tv");
		
		Amazon.readProductNames();
		
		System.out.println("Main ended");
	}
}