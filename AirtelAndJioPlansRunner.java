class AirtelAndJioPlansRunner{
 
   public static void main(String [] pln){
   
     System.out.println("main Started");
	 
	 String planPacks = "Jio  1GB/day 28 Days" ;
   
  int price = AirtelAndJioPlans.prepaidPlans(planPacks);
  
	 System.out.println("The Plan Price is :" +price);

   System.out.println("main Ended");	 
   
   }

}