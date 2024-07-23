class PassportGeneration{
	
	static String cpvLoc ;
	static String dcdrLoc ;
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static String emailAddress;
	static boolean isemailAddressSimilar;
	static String login ;
	static String password;
	static String confirmPassword;
	static String hintQueation;
	static String hintAnswer;
	static String capthen;
	
	
	
	
	//Create  Method

    public static boolean createUserPassport(String cpvLocation, String dcdrLocation, String givenName, String surname, String dob, String email, boolean isemailLoginSame, String loginId, String pwd, String confirmPwd, String hintques, String hintAns, String capcha){
	
	boolean isPassportCreated = false ;
	
						cpvLoc = cpvLocation ;
                        dcdrLoc = dcdrLocation ;
						firstName = givenName;
						lastName = surname;
						dateOfBirth = dob;
						emailAddress = email;
						isemailAddressSimilar = isemailLoginSame;
						login = loginId;
						password = pwd;
						confirmPassword = confirmPwd;
						hintQueation = hintques;
						hintAnswer = hintAns;
						capthen = capcha;
						
					
	
	
	return isPassportCreated ;
	
	    }
		
		
		public static void readUserPassportDetails(){
			
			
			System.out.println("Fetching...... User Detils.....");
			
						System.out.println("The Cpv Location is "+cpvLoc);
						System.out.println("The Dcdr Location is "+dcdrLoc);
						System.out.println("The User Name is "+firstName);
						System.out.println("The user Surname is "+lastName);
						System.out.println("c Date Of Birth is "+dateOfBirth);
						System.out.println("The  User Email is "+emailAddress);
						System.out.println("The Email is same for Login "+isemailAddressSimilar);
						System.out.println("The User Login ID is "+login);
						System.out.println("The User Password is "+password);
						System.out.println("The User Confirm PassWord is "+confirmPassword);
						System.out.println("The Hint queation is "+hintQueation);
						System.out.println("The Hint Answer  is "+hintAnswer);
						System.out.println("The Capch is "+capthen);



		
			
		}
}