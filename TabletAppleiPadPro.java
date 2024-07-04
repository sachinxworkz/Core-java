class TabletAppleiPadPro {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Apple";
        String model = "iPad Pro";
        String displaySize = "12.9 inches";
        String storage = "256GB";
        int price = 1099;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Display Size is : " + displaySize);
        System.out.println("The Storage is : " + storage);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}