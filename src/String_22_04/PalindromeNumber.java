package String_22_04;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 123;
        int orgnumber = number;
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        if (orgnumber == reverse) {
            System.out.println(orgnumber + " "+" is a palindrome number");

        } else {
            System.out.println(orgnumber + " "+"not a palindrome");
        }

    }

}
