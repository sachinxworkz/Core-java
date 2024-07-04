class GamingConsoleSonyPS5 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Sony";
        String model = "PlayStation 5";
        String type = "Console";
        String storage = "825GB";
        int price = 499;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Type is : " + type);
        System.out.println("The Storage is : " + storage);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}