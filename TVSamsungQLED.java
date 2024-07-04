class TVSamsungQLED {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Samsung";
        String model = "QLED Q60T";
        String displaySize = "55 inches";
        String resolution = "4K";
        int price = 899;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Display Size is : " + displaySize);
        System.out.println("The Resolution is : " + resolution);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}