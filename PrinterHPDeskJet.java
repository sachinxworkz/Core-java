class PrinterHPDeskJet {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printPrinterFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printPrinterFeatures() {
        System.out.println("Printer Features:");
        String brand = "HP";
        String model = "DeskJet 3755";
        String type = "All-in-One";
        String connectivity = "Wi-Fi, USB";
        int price = 89;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Price: $" + price);
    }
}