class BlenderVitamix5200 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Vitamix";
        String model = "5200";
        String type = "Professional-Grade";
        String capacity = "64 oz.";
        int price = 449;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Type is : " + type);
        System.out.println("The Capacity is : " + capacity);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}