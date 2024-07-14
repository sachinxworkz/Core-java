class NandiniParlour {

    public static int getProductPriceByName(String milkProductName) {
        if (milkProductName == "Toned Milk") {
            return 40;
        }
        if (milkProductName  == "Full Cream Milk") {
            return 50;
        }
        if (milkProductName == "Curd") {
            return 30;
        }
        if (milkProductName == "Butter Milk") {
            return 20;
        }
        if (milkProductName== "Ghee"){
            return 450;
        }
        if (milkProductName == "Paneer") {
            return 200;
        }
        if (milkProductName == "Cheese") {
            return 250;
        }
        if (milkProductName == "Flavored Milk") {
            return 25;
        }
        if (milkProductName == "Cream") {
            return 60;
        }
        if (milkProductName == "Butter") {
            return 80;
        } else {
            System.out.println(milkProductName + " not found");
            return 0;
        }
    }
}