class BankAccountGeneration{
        
	    static String name ;
		static long aadhaarNo ;
		static String dob;
		static String location;
		static long phoneNumber ;

		
    public static boolean createCustomerBankAccount(String firstName, long aadhaarNumber,String dOB, String address,long mobileNumber){
	
	     boolean isBankAccountCreated = false ;
		 
		 boolean isFirstName = false;
		 boolean isAadhaarNumber = false;
		 boolean isDOB = false;
		 boolean isAddress = false;
		 boolean isMobileNumber = false;
		 
		 if(firstName != null){
			name = firstName ;
			isFirstName = true;
		}else 
			System.out.println("firstName is invalid");
		
		if(aadhaarNumber != 0){
			aadhaarNo = aadhaarNumber ;
			isAadhaarNumber = true;
		}else 
			System.out.println("aadhaar number is invalid");
		 
		 if(dOB != null){
			dob = dOB ;
			isDOB = true;
		}else 
			System.out.println("dob is invalid");
		
		if(address != null){
			location = address ;
			isAddress = true;
		}else 
			System.out.println("address is invalid");
		 
		 if(mobileNumber != 0){
			phoneNumber = mobileNumber ;
			isMobileNumber = true;
		}else 
			System.out.println("mobile number is invalid");
		 
		 if(isFirstName == true && isAadhaarNumber == true && isDOB == true && isAddress == true && isMobileNumber == true)
			 isBankAccountCreated = true; 
		/* name = firstName ;
		 aadhaarNo = aadhaarNumber ;
		 dob = dOB ;
		 location = address ;
		 phoneNumber = mobileNumber ;
		 
		 isBankAccountCreated = true;*/
		 
		 
		 return isBankAccountCreated ;
	
	}
    
	public static void readCustomerBankAccountDetails(){
	
	    System.out.println("fetching Customer Details");
		System.out.println("The Customer First Name is :" + name);
		System.out.println("The Customer Aadhaar Number is :" + aadhaarNo);
		System.out.println("The Customer Date of Birth is :" + dob);
		System.out.println("The Customer address is :" + location);
		System.out.println("The Customer Mobile Number is :" + phoneNumber);
		
		
	
	}
}