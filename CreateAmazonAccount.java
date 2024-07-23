class CreateAmazonAccount{
        
	    static String givenName ;
		static String surName ;
		static long phoneNumber ;
		static String emailId ;
		static String pswd ;
		static String conformPswd ;
		
    public static boolean createUserAccount(String firstName, String lastName, long mobileNumber, String email, String pwd, String conformPwd){
	
	    boolean isAccountCreated = false ;
		
		boolean isFirstName = false;
		boolean isLastName = false;
		boolean isMobileNumber = false;
		boolean isEmail = false;
		boolean isPwd = false;
		boolean isConformPwd = false;
		
		if(firstName != null){
			givenName = firstName ;
			isFirstName = true;
		}else 
			System.out.println("firstName is invalid");
		
		if(lastName != null){
			surName = lastName;
			isLastName = true;
		}else 
			System.out.println("lastName is invalid");
		
		if(mobileNumber != 0){
			phoneNumber = mobileNumber ;
			isMobileNumber = true;
		}else 
			System.out.println("mobile number is invalid");
		
		if(email != null){
			emailId = email ;
			isEmail = true;
		}else 
			System.out.println("email is invalid");
		
		if(pwd != null){
			pswd = pwd ;
			isPwd = true;
		}else 
			System.out.println("password is invalid");
		
		if(conformPwd != null){
			conformPswd = conformPwd ;
			isConformPwd = true;
		}else 
			System.out.println("conform password is invalid");
		
		/*givenName = firstName ;
		surName = lastName;
		phoneNumber = mobileNumber ;
		emailId = email ;
		pswd = pwd ;
		conformPswd = conformPwd ;
		isAccountCreated = true ;*/
		
		if(isFirstName == true && isLastName == true && isMobileNumber == true && isEmail == true && isPwd == true && isConformPwd == true)
			isAccountCreated = true;
		 
	return isAccountCreated ;
	}
    
	public static void readAccountDetails(){
	
	    System.out.println("fetching user details");
		System.out.println("The User First Name is :" + givenName);
		System.out.println("The User Last Name is :" + surName);
		System.out.println("The User Phone Number is :" + phoneNumber);
		System.out.println("The User email Id is :" + emailId);
		System.out.println("The User Password is :" + pswd);
		System.out.println("The User Confirm Password is :" + conformPswd);
	
	}
}