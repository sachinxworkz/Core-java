class Projector {

	static boolean isProjectorOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isProjectorOn == false) {
			isProjectorOn = true;
			System.out.println("Projector is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isProjectorOn == true) {
			isProjectorOn = false;
			System.out.println("Projector is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}