class AC {

	static boolean isACOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isACOn == false) {
			isACOn = true;
			System.out.println("AC is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isACOn == true) {
			isACOn = false;
			System.out.println("AC is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}