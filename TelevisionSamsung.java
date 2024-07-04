class TelevisionSamsung {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printTelevisionFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printTelevisionFeatures() {
        System.out.println("Television Features:");
        String brand = "Samsung";
        String model = "QLED Q90T";
        String resolution = "4K Ultra HD";
        double screenSize = 65;
        int price = 1999;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Resolution: " + resolution);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Price: $" + price);
    }
}