class CameraCanonEOSR5 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Canon";
        String model = "EOS R5";
        String sensor = "Full Frame";
        String resolution = "45MP";
        int price = 3899;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Sensor is : " + sensor);
        System.out.println("The Resolution is : " + resolution);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}