class SangeethaMobiles {

    public static int mobilePrice(String brandName) {
        if (brandName == "Samsung Galaxy S21") {
            return 69999;
        }
        if (brandName == "Apple iPhone 13") {
            return 79999;
        }
        if (brandName == "OnePlus 9 Pro") {
            return 64999;
        }
        if (brandName == "Xiaomi Mi 11 Ultra") {
            return 69999;
        }
        if (brandName == "Vivo X60 Pro") {
            return 49990;
        }
        if (brandName == "Oppo Find X3 Pro") {
            return 59999;
        }
        if (brandName == "Realme GT") {
            return 37999;
        }
        if (brandName == "Asus ROG Phone 5") {
            return 49999;
        }
        if (brandName == "Google Pixel 6") {
            return 62999;
        }
        if (brandName == "Sony Xperia 1 III") {
            return 79999;
        }
        if (brandName == "Nokia 8.3 5G") {
            return 29999;
        }
        if (brandName == "Motorola Edge 20 Pro") {
            return 35999;
        }
        if (brandName == "Huawei P40 Pro") {
            return 69999;
        }
        if (brandName == "LG Wing") {
            return 69990;
        }
        if (brandName == "Micromax IN Note 1") {
            return 10999;
        } else {
            System.out.println(brandName + " not found");
            return 0;
        }
    }
}