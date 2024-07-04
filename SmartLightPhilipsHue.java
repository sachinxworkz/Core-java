class SmartLightPhilipsHue {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Philips";
        String model = "Hue White and Color Ambiance";
        String type = "Smart Bulb";
        String connectivity = "Bluetooth, Zigbee";
        int price = 49;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Type is : " + type);
        System.out.println("The Connectivity is : " + connectivity);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}