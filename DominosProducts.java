 class DominosProducts {

    public static int getProductPriceByName(String productName) {
        if (productName == "Margherita Pizza") {
            return 299;
        }
        if (productName == "Farmhouse Pizza") {
            return 399;
        }
        if (productName == "Pepper Barbecue Chicken Pizza") {
            return 449;
        }
        if (productName == "Veggie Paradise Pizza") {
            return 379;
        }
        if (productName == "Chicken Dominator Pizza") {
            return 499;
        }
        if (productName == "Indi Tandoori Paneer Pizza") {
            return 429;
        }
        if (productName == "Mexican Green Wave Pizza") {
            return 359;
        }
        if (productName == "Deluxe Veggie Pizza") {
            return 389;
        }
        if (productName == "Chicken Fiesta Pizza") {
            return 459;
        }
        if (productName == "Paneer Makhani Pizza") {
            return 399;
        }
        if (productName == "Pepper Paneer Pizza") {
            return 379;
        }
        if (productName == "Cheese N Corn Pizza") {
            return 299;
        }
        if (productName == "Chicken Sausage Pizza") {
            return 429;
        }
        if (productName == "Non Veg Supreme Pizza") {
            return 499;
        }
        if (productName == "Veg Extravaganza Pizza") {
            return 429;
        }
        if (productName == "Chicken Golden Delight Pizza") {
            return 469;
        }
        if (productName == "Pepperoni Pizza") {
            return 499;
        }
        if (productName == "Garlic Breadsticks") {
            return 99;
        }
        if (productName == "Stuffed Garlic Bread") {
            return 129;
        }
        if (productName == "Choco Lava Cake") {
            return 99;
        } else {
            System.out.println(productName + " not found");
            return 0;
        }
    }

}