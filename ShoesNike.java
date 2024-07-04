class ShoesNike {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printShoesFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printShoesFeatures() {
        System.out.println("Shoes Features:");
        String brand = "Nike";
        String model = "Air Zoom Pegasus 38";
        String type = "Running Shoes";
        boolean waterproof = false;
        int price = 120;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Waterproof: " + (waterproof ? "Yes" : "No"));
        System.out.println("Price: $" + price);
    }
}