class EarbudsApple {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printEarbudsFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printEarbudsFeatures() {
        System.out.println("Earbuds Features:");
        String brand = "Apple";
        String model = "AirPods Pro";
        String type = "Wireless Earbuds";
        boolean noiseCancellation = true;
        int price = 249;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Noise Cancellation: " + (noiseCancellation ? "Yes" : "No"));
        System.out.println("Price: $" + price);
    }
}