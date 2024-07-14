class SwiggyProducts {

    public static int getProductPriceByName(String productName) {
        if (productName == "Pizza Margherita") {
            return 299;
        }
        if (productName == "Chicken Biryani") {
            return 199;
        }
        if (productName == "Veg Biryani") {
            return 179;
        }
        if (productName == "Paneer Butter Masala") {
            return 249;
        }
        if (productName == "Butter Chicken") {
            return 299;
        }
        if (productName == "Mutton Rogan Josh") {
            return 399;
        }
        if (productName == "Dal Makhani") {
            return 199;
        }
        if (productName == "Garlic Naan") {
            return 49;
        }
        if (productName == "Chicken Tikka") {
            return 259;
        }
        if (productName == "Fish Curry") {
            return 279;
        }
        if (productName == "Egg Curry") {
            return 149;
        }
        if (productName == "Pasta Alfredo") {
            return 199;
        }
        if (productName == "Pasta Arrabiata") {
            return 199;
        }
        if (productName == "Caesar Salad") {
            return 159;
        }
        if (productName == "Greek Salad") {
            return 179;
        }
        if (productName == "Chocolate Brownie") {
            return 99;
        }
        if (productName == "Ice Cream Sundae") {
            return 129;
        }
        if (productName == "Fruit Salad") {
            return 119;
        }
        if (productName == "Gulab Jamun") {
            return 89;
        }
        if (productName == "Ras Malai") {
            return 99;
        } else {
            System.out.println(productName + " not found");
            return 0;
        }
    }
}
