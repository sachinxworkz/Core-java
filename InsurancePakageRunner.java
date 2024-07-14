class InsurancePakageRunner{

public static void main (String []Insurance){

    System.out.println(" Main Started");
    String src = "HDFC Life Insurance";
    double price = InsurancePakage.getInsurancePriceByName(src);
    System.out.println("The Insurance Price is " + price);


System.out.println("Main Ended");
}



}