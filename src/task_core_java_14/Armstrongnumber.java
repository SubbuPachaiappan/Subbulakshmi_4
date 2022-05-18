package task_core_java_14;

public class Armstrongnumber {
	int numberOne;
	int numberTwo;

	void getNumber(int numberOne, int numberTwo) {
		for (int value = numberOne; value < numberTwo; value++) {
			int number, remainder, armstrong = 0;
			number = value;
			while (number != 0) {
				remainder = number % 10;
				armstrong = armstrong + (remainder * remainder * remainder);
				number = number / 10;
			}
			if (armstrong == value) {
				System.out.println("" + value + " is an Armstrong number.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrongnumber number = new Armstrongnumber();
		number.getNumber(1, 500);
	}
}
