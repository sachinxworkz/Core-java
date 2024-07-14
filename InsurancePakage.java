class InsurancePakage{

public static double getInsurancePriceByName(String insuranceName){

if (insuranceName == "HDFC Life Insurance"){
    return      8000.56;
}
if(insuranceName == "Max life"){
    return     7599.99;
}
if (insuranceName == "Aditya Birla General Insurance")
{
    return    6768.76 ;
}if (insuranceName == "Bajaj Allianz General Insurance")
{
    return    7688.76;
}if (insuranceName == "Edelweiss General Insurance")
{
    return    6777.76 ;
}if (insuranceName == "Future Generali General Insurance")
{
    return    6777.76 ;
}if (insuranceName == "IFFCO Tokio General Insurance")
{
    return    6777.76 ;
}if (insuranceName == "Liberty Mutual"){
    return    6777.76 ;}


    
else{
    System.out.println(insuranceName + "not found ");
}

return 0.0 ;
}

}