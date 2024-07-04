class MicrowavePanasonicNN {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Panasonic";
        String model = "NN-SN966S";
        String type = "Countertop";
        String capacity = "2.2 cu. ft.";
        int price = 299;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Type is : " + type);
        System.out.println("The Capacity is : " + capacity);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}