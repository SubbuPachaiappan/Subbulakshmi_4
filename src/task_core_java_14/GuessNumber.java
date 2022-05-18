package task_core_java_14;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	int randomNumber, guess;
	int maximum = 30;

	Scanner scan = new Scanner(System.in);

	public void displayNumber() {

		Random random = new Random();
		randomNumber = random.nextInt(maximum) + 1;

		for (int value = 1; value <= maximum; value++) {

			System.out.println("Guess a number between 1 to 30");
			guess = scan.nextInt();
			if (guess == randomNumber) {
				System.out.println("You have guessed correct number");
				break;
			} else if (guess < randomNumber && guess > 0) {
				System.out.println("Too low,try again");
			} else if (guess > randomNumber && guess <= 30) {
				System.out.println("Too high, try again");
			} else {
				System.out.println("Invalid Number");
			}
		}
		scan.close();
	}

	public static void main(String args[]) {
		GuessNumber GuessingNumber = new GuessNumber();
		GuessingNumber.displayNumber();
	}

}
