class NandiniParlourRunner{
 
   public static void main(String [] NandiniParlourName){
   
     System.out.println("main Started");
	 
	 String nandiniParlourName = "Toned Milk" ;
   
  int price = NandiniParlour.getProductPriceByName(nandiniParlourName);
  
	 System.out.println("The NandiniParlourName Price is :" +price);

   System.out.println("main Ended");	 
   
   }

}