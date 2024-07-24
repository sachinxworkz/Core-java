class JuiceShop {

    static String juiceNames[] = {null, null, null, null, null, null};
    static int start;

    public static boolean addJuiceName(String juiceName) {
        boolean isJuiceNameAdded = false;

        if (juiceName != null) {
            juiceNames[start++] = juiceName;
            isJuiceNameAdded = true;
        } else {
            System.out.println("Juice name is invalid");
        }

        return isJuiceNameAdded;
    }

    public static void readJuiceNames() {
        System.out.println("Available juice names are");
        for (String juice : juiceNames) {
            System.out.println(juice);
        }

        return;
    }
}