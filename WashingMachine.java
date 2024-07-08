class WashingMachine {

	static boolean isWashingMachineOn = false;

	public static void turnOn() {
		System.out.println("Start of turnOn method");

		if (isWashingMachineOn == false) {
			isWashingMachineOn = true;
			System.out.println("Washing Machine is turned on");
		}
		System.out.println("End of turnOn method");
		return;
	}

	public static void turnOff() {
		System.out.println("Start of turnOff method");

		if (isWashingMachineOn == true) {
			isWashingMachineOn = false;
			System.out.println("Washing Machine is turned off");
		}
		System.out.println("End of turnOff method");
		return;
	}
}