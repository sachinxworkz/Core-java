class SpotifyAccount{
	
	static String name;
	static String dofb;
	static String eMail;
	static String loginId;
	static String pswd;
	static String conformPswd;
	
	public static boolean createAccount(String givenName,String dob,String email,String loginID,String pwd,String conformPwd){
		boolean isAccountCreated = false;
		
		boolean isGivenNameValid = false;
		boolean isDob = false;
		boolean isEmail = false;
		boolean isLoginID = false;
		boolean isPwd = false;
		boolean isConformPwd = false;
		
		if(givenName != null){
			name = givenName;
			isGivenNameValid = true;
		}else
			System.out.println("Name is invalid");
		
		if(dob != null){
			dofb = dob;
			isDob = true;
		}else
			System.out.println("DOB is invalid");
		
		if(email != null){
			eMail = email;
			isEmail = true;
		}else
			System.out.println("email is invalid");
		
		if(loginID != null){
			loginId = loginID;
			isLoginID = true;
		}else
			System.out.println("loginid is invalid");
		
		if(pwd != null){
			pswd = pwd;
			isPwd = true;
		}else
			System.out.println("password is invalid");
		
		if(conformPwd != null){
			conformPswd = conformPwd;
			isConformPwd = true;
		}else
			System.out.println("conform password is invalid");
	
	if(isGivenNameValid == true && isDob == true && isEmail == true && isLoginID == true && isPwd == true && isConformPwd == true)
		isAccountCreated = true;
	
	return isAccountCreated;
	}
	
	public static void readUserAccountDetails(){
		
		System.out.println("Fetching user details");
		
		System.out.println("The user First Name is "+ name);
		System.out.println("The user date of Birth is "+dofb);
		System.out.println("The user Email is "+eMail);
		System.out.println("The user login id is "+ loginId);
		System.out.println("The user Password is "+ pswd);
		System.out.println("The user Conform Password is "+conformPswd);
	return;
	}
}