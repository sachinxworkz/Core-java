class AadhaarGeneration{
	
	static String name;
	static String dob;
	static String gender;
	static long contactNumber;
	static String location;
	static String email;
	static String panNumber;
	static String loginId;
	static String pswd;
	static String conformPswd;
	
	public static boolean createAadhaar(String userName, String userDOB, String userGender,long mobileNumber,String userLocation,String userEmail,String userPanNumber,String loginID,String pwd,String conformPwd){
		boolean isAadhaarCreated = false;
		System.out.println("createAadhaar method started");
		name = userName;
		dob = userDOB;
		gender = userGender;
		contactNumber = mobileNumber;
		location = userLocation;
		email = userEmail;
		panNumber = userPanNumber;
		loginId = loginID;
		pswd = pwd;
		conformPswd = conformPwd;
		System.out.println("createAadhaar method ended");
		
	return isAadhaarCreated;	
	}
	
	public static void readAadhaarDetails(){
		System.out.println("readAadhaarDetails method started");
		
		System.out.println("Fetching details");
		
		System.out.println("The Name of the user is "+ name);
		System.out.println("The user Date of birth is "+ dob);
		System.out.println("The gender is "+ gender);
		System.out.println("The user mobile number is "+ contactNumber);
		System.out.println("The user location is "+location);
		System.out.println("The user Email is "+email);
		System.out.println("The user PAN card number is "+panNumber);
		System.out.println("The user login id is "+ loginId);
		System.out.println("The user Password is "+ pswd);
		System.out.println("The user Conform Password is "+conformPswd);
		System.out.println("readAadhaarDetails method ended");
	
	return;
	}
}