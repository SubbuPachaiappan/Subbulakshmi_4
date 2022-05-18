package task_core_java_18_inheritance;

class Benz extends Maruti {

	Benz() {
		System.out.println("Class Benz");
	}

	void speed() {
		Maruti specify = new Maruti(); // to print parents class we can use this creating object methods
		specify.speed();
		System.out.println("Maximum speed: 100Kmph");
		// super.speed(); // this is the another way to access the parent class methods.

	}

}
