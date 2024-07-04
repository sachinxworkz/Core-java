class SmartphoneSamsungGalaxy {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Samsung";
        String model = "Galaxy S21";
        String operatingSystem = "Android";
        String displaySize = "6.2 inches";
        int price = 799;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Operating System is : " + operatingSystem);
        System.out.println("The Display Size is : " + displaySize);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}