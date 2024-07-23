class CreateAmazonAccountRunner{

    public static void main(String[] amazon){
	
	    System.out.println("Main Started");
		boolean accountCreate =CreateAmazonAccount.createUserAccount("Sachin", "Harijan", 7022642583L, "Sachin@gmail.com", "Sachin2020", "dileep2020");
		
		if(accountCreate == true)
		CreateAmazonAccount.readAccountDetails();
		
		System.out.println("Main Ended");
	
	}
}