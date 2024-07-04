class SmartphoneiPhone {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printSmartphoneFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printSmartphoneFeatures() {
        System.out.println("Smartphone Features:");
        String brand = "Apple";
        String model = "iPhone 13 Pro";
        String operatingSystem = "iOS 15";
        double screenSize = 6.1;
        int price = 999;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Price: $" + price);
    }
}