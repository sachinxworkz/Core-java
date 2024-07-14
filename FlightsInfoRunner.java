class FlightsInfoRunner{
 
   public static void main(String [] flightPrice){
   
     System.out.println("main Started");
	 
	 String flightName = "New York" ;
   
  int price = FlightsInfo.getFlightPriceByDestinationName(flightName);
  
	 System.out.println("The Flight Price is :" +price);

   System.out.println("main Ended");	 
   
   }

}