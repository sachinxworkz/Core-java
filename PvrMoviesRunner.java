class PvrMoviesRunner{
 
   public static void main(String [] pvrMovieName){
   
     System.out.println("main Started");
	 
	 String PvrMovieName = "Avatar" ;
   
  int price = PvrMovies.getMoviePriceByName(PvrMovieName);
  
	 System.out.println("The PvrMovie Price is :" +price);

   System.out.println("main Ended");	 
   
   }

}