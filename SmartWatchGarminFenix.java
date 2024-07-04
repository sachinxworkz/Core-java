class SmartWatchGarminFenix {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Garmin";
        String model = "Fenix 6";
        String displaySize = "1.3 inches";
        String connectivity = "GPS";
        int price = 599;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Display Size is : " + displaySize);
        System.out.println("The Connectivity is : " + connectivity);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}