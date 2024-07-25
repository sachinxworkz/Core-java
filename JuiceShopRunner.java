class JuiceShopRunner{
 public static void main(String[] juices){
 
   JuiceShop.addJuiceName("Mango");
    
   JuiceShop.addJuiceName("Apple");
    
   JuiceShop.addJuiceName("Mosambi");
    
   JuiceShop.addJuiceName("Watermelon");
    
   JuiceShop.addJuiceName("chikku");
    
   JuiceShop.addJuiceName("Cold Coffee");
    
   JuiceShop.addJuiceName("Milkshake");
    
   JuiceShop.showJuiceNames();
   
   JuiceShop.updateJuiceName("Orange", "Mosambi");
   
   JuiceShop.showJuiceNames();
   
   JuiceShop.deleteJuiceName("chikku");
   
   JuiceShop.showJuiceNames();
 
 }




}