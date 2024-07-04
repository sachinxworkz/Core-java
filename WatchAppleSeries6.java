class WatchAppleSeries6 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Apple";
        String model = "Watch Series 6";
        String displaySize = "1.78 inches";
        String connectivity = "GPS + Cellular";
        int price = 399;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Display Size is : " + displaySize);
        System.out.println("The Connectivity is : " + connectivity);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}