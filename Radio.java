class Radio {

	static boolean isRadioOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isRadioOn == false) {
			isRadioOn = true;
			System.out.println("Radio is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isRadioOn == true) {
			isRadioOn = false;
			System.out.println("Radio is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}