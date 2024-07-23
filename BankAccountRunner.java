class BankAccountRunner{

    public static void main(String[] bank){
	
	    System.out.println("Main Started");
	    boolean accountCreated = BankAccountGeneration.createCustomerBankAccount("Dileep", 685145326578L, "08/01/2003", "lingadahalli", 8463706209L);
		
		if(accountCreated == true)
		BankAccountGeneration.readCustomerBankAccountDetails();
		
		System.out.println("Main Ended");
	}
}