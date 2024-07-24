class JuiceShopRunner{
	
	public static void main(String[] juice){
		System.out.println("Main started");
	
		boolean juiceAdded = JuiceShop.addJuiceName("Straberry Juice");
		System.out.println("Juice name added");

         juiceAdded = JuiceShop.addJuiceName("Apple Juice");
		System.out.println("Juice name added");

        juiceAdded = JuiceShop.addJuiceName("Lemon Juice");
		System.out.println("Juice name added");

        juiceAdded = JuiceShop.addJuiceName("Orange Juice");
		System.out.println("Juice name added");

        juiceAdded = JuiceShop.addJuiceName("Chikku Juice");
		System.out.println("Juice name added");

        juiceAdded = JuiceShop.addJuiceName("Pappaya Juice");
		System.out.println("Juice name added");

        
		
		JuiceShop.readJuiceNames();
		
		System.out.println("Main ended");
	}
}