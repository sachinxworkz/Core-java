class TV {

	static boolean isTVOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isTVOn == false) {
			isTVOn = true;
			System.out.println("TV is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isTVOn == true) {
			isTVOn = false;
			System.out.println("TV is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}