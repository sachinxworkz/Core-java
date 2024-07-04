class SunglassesRayBan {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printSunglassesFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printSunglassesFeatures() {
        System.out.println("Sunglasses Features:");
        String brand = "Ray-Ban";
        String model = "Aviator Classic";
        String type = "Sunglasses";
        boolean polarized = true;
        int price = 159;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Polarized: " + (polarized ? "Yes" : "No"));
        System.out.println("Price: $" + price);
    }
}