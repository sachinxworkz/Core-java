class SmartwatchFirebolts {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printSmartwatchFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printSmartwatchFeatures() {
        System.out.println("Smartwatch Features:");
        String brand = "Firebolts";
        String model = "Firebolt S12";
        String type = "Smartwatch";
        boolean heartRateMonitor = true;
        int price = 199;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Heart Rate Monitor: " + (heartRateMonitor ? "Yes" : "No"));
        System.out.println("Price: $" + price);
    }
}