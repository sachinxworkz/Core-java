class Heater {

	static boolean isHeaterOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isHeaterOn == false) {
			isHeaterOn = true;
			System.out.println("Heater is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isHeaterOn == true) {
			isHeaterOn = false;
			System.out.println("Heater is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}