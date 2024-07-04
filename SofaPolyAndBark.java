class SofaPolyAndBark {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "POLY & BARK";
        String assemblyRequired = "Yes";
        String seatDepth = "24 inches";
        String seatHeight = "19 inches";
        String productDimensions = "30D x 104.5W x 32H";
        int price = 6999;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Assembly Required is : " + assemblyRequired);
        System.out.println("The Sofa Seat Depth is : " + seatDepth);
        System.out.println("The Sofa Seat Height is : " + seatHeight);
        System.out.println("The Sofa Product Dimensions are : " + productDimensions);
        System.out.println("The Sofa Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}