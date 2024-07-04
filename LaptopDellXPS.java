class LaptopDellXPS {
    public static void main(String[] args) {
        System.out.println("Main Started");
        getFeatures();
        System.out.println("Main Ended");
    }
    
    public static void getFeatures() {
        System.out.println("getFeatures Method started");
        String brand = "Dell";
        String model = "XPS 13";
        String processor = "Intel Core i7";
        String ram = "16GB";
        String storage = "512GB SSD";
        int price = 1499;
        
        System.out.println("The Brand Name is " + brand);
        System.out.println("The Model is : " + model);
        System.out.println("The Processor is : " + processor);
        System.out.println("The RAM is : " + ram);
        System.out.println("The Storage is : " + storage);
        System.out.println("The Price is : " + price);
        System.out.println("The getFeatures Method is Ended");
    }
}