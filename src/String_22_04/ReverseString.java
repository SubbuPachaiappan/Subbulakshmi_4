package String_22_04;
/*Java Program to reverse a string using Recursive Function*/
import java.util.Scanner;
public class ReverseString{
//Recursive Function to Reverse the String
public static String reverseString(String str)
{
    //If entered string is empty
    //Return the empty string
    if (str.isEmpty())
    { return str;}
    //If string consists of multiple character    
    //Call the Function Recursively
    else {
    	return reverseString(str.substring(1)) + str.charAt(0);
  
    }
}
    //Driver Code
    public static void main(String[] args) 
    {
        //Take input from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();   //Input the string
        //Call a recursive function to reverse the string
        scan.close();
        String rev=reverseString(str);
        System.out.println("The reverse of the entered the String :"+rev);
 
    }
   
}