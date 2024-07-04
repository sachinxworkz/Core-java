class VacuumDysonV11 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Dyson";
        String model = "V11";
        String type = "Cordless";
        String runTime = "60 minutes";
        int price = 599;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Type is : " + type);
        System.out.println("The Run Time is : " + runTime);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}