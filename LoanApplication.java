class LoanApplication{

	static int creditScore;
	static String fullName;
	static String loanType;
	static String bankName;
	static float rateOfInterest;
	static int yearsOfLoan;
	
	public static boolean createLoanApplication(int crdtScr, String applicantName, String loanApplicationType, String nameOfBank,float interest,int noOfYears){
		
		boolean isApplicationCreated = false;
		
		boolean isCreditScore = false;
		boolean isApplicantName = false;
		boolean isLoanType = false;
		boolean isBankName = false;
		boolean isRateOfInterest = false;
		boolean isNoOfYears = false;
	
		if(crdtScr != 0){
			creditScore = crdtScr;
			isCreditScore = true;
		}else
			System.out.println("Invalid credit score");
		
		if(applicantName != null){
			fullName = applicantName;
			isApplicantName = true;
		}else
			System.out.println("Invalid applicant name");
		
		if(loanApplicationType != null){
			loanType = loanApplicationType;
			isLoanType = true;
		}else
			System.out.println("Invalid application");
		
		if(nameOfBank != null){
			bankName = nameOfBank;
			isBankName = true;
		}else
			System.out.println("Invalid bank name");
		
		if(interest != 0){
			rateOfInterest = interest;
			isRateOfInterest = true;
		}else
			System.out.println("Invalid rate of interest");
		
		if(noOfYears != 0){
			yearsOfLoan = noOfYears;
			isNoOfYears = true;
		}else
			System.out.println("Invalid Number of years");
		
		if(isCreditScore == true && isApplicantName == true && isBankName == true && isLoanType == true && isRateOfInterest == true && isNoOfYears == true)
			isApplicationCreated = true;
	
	return isApplicationCreated;
	}
	
	public static void readApplicantDetails(){
		
		System.out.println("Applicant's credit score is " +creditScore);
		System.out.println("Applicant's applicant name is " +fullName);
		System.out.println("Applicant's bank name is "+ loanType);
		System.out.println("Applicant's loan type is "+ bankName);
		System.out.println("Applicant's loan interest is "+ rateOfInterest);
		System.out.println("Applicant's loan number of years is "+ yearsOfLoan);
		
	return;
	}
}