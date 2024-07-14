class SwiggyProductsRunner{
 
   public static void main(String [] swiggyProductsPrice){
   
     System.out.println("main Started");
	 
	 String swiggyProductsName = "Chicken Biryani" ;
   
  int price = SwiggyProducts.getProductPriceByName(swiggyProductsName);
  
	 System.out.println("The swiggyProducts Price  is :" +price);

   System.out.println("main Ended");	 
   
   }

}