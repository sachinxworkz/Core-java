class Fan {

	static boolean isFanOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isFanOn == false) {
			isFanOn = true;
			System.out.println("Fan is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isFanOn == true) {
			isFanOn = false;
			System.out.println("Fan is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}