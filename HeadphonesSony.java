class HeadphonesSony {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printHeadphonesFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printHeadphonesFeatures() {
        System.out.println("Headphones Features:");
        String brand = "Sony";
        String model = "WH-1000XM4";
        String type = "Over-Ear";
        boolean noiseCancellation = true;
        int price = 349;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Noise Cancellation: " + (noiseCancellation ? "Yes" : "No"));
        System.out.println("Price: $" + price);
    }
}