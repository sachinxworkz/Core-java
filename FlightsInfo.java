 class FlightsInfo {

    public static int getFlightPriceByDestinationName(String destinationName) {
        if (destinationName == "New York") {
            return 5000;
        }
        if (destinationName == "Los Angeles") {
            return 4500;
        }
        if (destinationName == "Chicago") {
            return 4000;
        }
        if (destinationName == "Houston") {
            return 4200;
        }
        if (destinationName == "Phoenix") {
            return 3900;
        }
        if (destinationName == "Philadelphia") {
            return 4100;
        }
        if (destinationName == "San Antonio") {
            return 4300;
        }
        if (destinationName == "San Diego") {
            return 4400;
        }
        if (destinationName == "Dallas") {
            return 4000;
        }
        if (destinationName == "San Jose") {
            return 4700;
        }
        if (destinationName == "Austin") {
            return 4600;
        }
        if (destinationName == "Jacksonville") {
            return 3500;
        }
        if (destinationName == "Fort Worth") {
            return 3700;
        }
        if (destinationName == "Columbus") {
            return 3800;
        }
        if (destinationName == "Charlotte") {
            return 3600;
        }
        if (destinationName == "San Francisco") {
            return 4800;
        }
        if (destinationName == "Indianapolis") {
            return 3900;
        }
        if (destinationName == "Seattle") {
            return 4900;
        }
        if (destinationName == "Denver") {
            return 4100;
        }
        if (destinationName == "Washington") {
            return 4200;
        } else {
            System.out.println(destinationName + " not found");
            return 0;
        }
    }
 }