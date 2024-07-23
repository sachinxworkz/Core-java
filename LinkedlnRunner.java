class LinkedlnRunner{

public static void main(String[]job){
	
	System.out.println("Main started");
	boolean account = Linkedln.createLinkedlnAccount("Sachin","Harijan","Sachin@gmail.com","Sachin2020","Sachin2020","India",581104,"Microsoft","SDE","IT","BE in CIVIL");
	
	if(account == true)
	Linkedln.readLinkedlnAccount();
	
	
	System.out.println("Main ended");
}
}