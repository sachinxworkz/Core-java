class SmartSpeakerAmazonEcho {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Amazon";
        String model = "Echo";
        String type = "Smart Speaker";
        String connectivity = "Wi-Fi, Bluetooth";
        int price = 99;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Type is : " + type);
        System.out.println("The Connectivity is : " + connectivity);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}