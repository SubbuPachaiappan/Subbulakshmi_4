package task_core_java_14;

import java.util.Scanner;

public class Randomnumber 
{
    int number = 15,input;
    
    Scanner scan = new Scanner(System.in);
    
    public void guessCorrectNumber()
    {
        System.out.println("Get Number :");

        while(number > 0)
        {
            input = scan.nextInt();
            if (input < number)
                System.out.println("Too low, try again");
            else if (input == number)
            {
                System.out.println("Correct Number ");
                break;
            }
                
            else
                System.out.println("Too high, try again");            
        }
        System.out.println("Your guess is correct");
    }
    public static void main(String[] args) 
	{

	    Randomnumber GuessNumber = new Randomnumber();
	    GuessNumber.guessCorrectNumber();
	}
}
