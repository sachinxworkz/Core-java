class Linkedln{
	
static String first;
static String last;
static String email;
static String pword;
static String confirm;
static String nation;
static int pin;
static String comp;
static String role;
static String ind;
static String edu;

public static boolean createLinkedlnAccount(String firstName, String lastName,String emailId, String pwd,String confirmPwd,String country,int pinCode, String company, String title, String industry,String education){
	boolean isLinkedlnCreated = true;
	
	boolean isFirstName = false;
	boolean isLastName = false;
	boolean isEmail = false;
	boolean isPwd = false;
	boolean isCnfmPwd = false;
	boolean isNation = false;
	boolean isPinCode = false;
	boolean isCompany = false;
	boolean isRole = false;
	boolean isIndustry = false;
	boolean isEducation = false;
	
	if(firstName != null){
			first = firstName;
			isFirstName = true;
		}else
			System.out.println("Invalid first name");
	
	if(lastName != null){
			last = lastName;
			isLastName = true;
		}else
			System.out.println("Invalid last name");
	
	if(emailId != null){
			email = emailId;
			isEmail = true;
		}else
			System.out.println("Invalid email");
	
	if(pwd != null){
			pword = pwd;
			isPwd = true;
		}else
			System.out.println("Invalid password");
	
	if(confirmPwd != null){
			confirm = confirmPwd;
			isCnfmPwd = true;
		}else
			System.out.println("Invalid conform password");
	
	if(country != null){
			nation = country;
			isNation = true;
		}else
			System.out.println("Invalid country name");
	
	if(pinCode != 0){
			pin = pinCode;
			isPinCode = true;
		}else
			System.out.println("Invalid pinCode");
	
	if(company != null){
			comp = company;
			isCompany = true;
		}else
			System.out.println("Invalid company");
	
	if(title != null){
			role = title;
			isRole = true;
		}else
			System.out.println("Invalid title");
	
		if(industry != null){
			ind = industry;
			isIndustry = true;
		}else
			System.out.println("Invalid industry");
	
	if(education != null){
			edu = education;
			isEducation = true;
		}else
			System.out.println("Invalid education");
	
	if(isFirstName == true && isLastName == true && isEmail == true && isPwd == true && isCnfmPwd == true && isNation == true && isPinCode == true && isIndustry == true && isCompany == true && isRole == true && isEducation == true)
		isLinkedlnCreated = true;
	
	
	return isLinkedlnCreated;
}
    
	public static void readLinkedlnAccount(){
		
		System.out.println("details...");
		System.out.println("First Name:"+first);
		System.out.println("Last Name:"+last);
		System.out.println("email Id:"+email);
		System.out.println("Password:"+pword);
		System.out.println("Confirm Password:"+confirm);
		System.out.println("Country:"+nation);
		System.out.println("Pin Code:"+pin);
		System.out.println("Company:"+comp);
		System.out.println("Title:"+role);
		System.out.println("Industry:"+ind);
		System.out.println("Education:"+edu);
		
	}
}