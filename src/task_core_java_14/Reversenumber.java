package task_core_java_14;

public class Reversenumber {
	int number;

	void findReverseNumber(int number) {

		int reverseNumber = 0;
		System.out.println("\nNumber :" + number);
		while (number > 0) {
			reverseNumber = (reverseNumber * 10) + (number % 10);
			number = number / 10;
		}
		System.out.println("Reversed Number :" + reverseNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reversenumber reverseNumber = new Reversenumber();
		reverseNumber.findReverseNumber(4599);
	}
}
