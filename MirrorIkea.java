class MirrorIkea {
    public static void main(String[] args) {
        System.out.println("Main Started");
        printMirrorFeatures();
        System.out.println("Main Ended");
    }
    
    public static void printMirrorFeatures() {
        System.out.println("Mirror Features:");
        String brand = "Ikea";
        String model = "Hovet";
        String type = "Wall Mirror";
        boolean LEDLights = false;
        int price = 99;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("LED Lights: " + (LEDLights ? "Yes" : "No"));
        System.out.println("Price: $" + price);
    }
}