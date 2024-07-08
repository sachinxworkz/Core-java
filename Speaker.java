class Speaker {

	static boolean isSpeakerOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isSpeakerOn == false) {
			isSpeakerOn = true;
			System.out.println("Speaker is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isSpeakerOn == true) {
			isSpeakerOn = false;
			System.out.println("Speaker is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}