class SpotifyAccountRunner{

	public static void main(String[] spotify){
	
		boolean createAcc = SpotifyAccount.createAccount("Dileep","08/01/2003" ,"dileep@gmail.com", "dil2020", "Dileep", "Dileep");
	
		if(createAcc == true)
		SpotifyAccount.readUserAccountDetails();
	}
}