class LoanApplicationRunner{

	public static void main(String[] loan){
	
		boolean loanApli = LoanApplication.createLoanApplication(800,"Sachin" ,"Home Loan", "HDFC", 10, 5);
	
		if(loanApli == true)
		LoanApplication.readApplicantDetails();
	}
}