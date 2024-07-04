class AirPurifierDysonTP04 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Dyson";
        String model = "TP04";
        String type = "Tower";
        String coverageArea = "400 sq. ft.";
        int price = 549;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Type is : " + type);
        System.out.println("The Coverage Area is : " + coverageArea);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}