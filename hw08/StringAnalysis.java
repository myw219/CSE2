//Matt Wong
//hw08
//String Analysis
//
//  first compile the program 
//      StringAnalysis.java
//  run the program
//      StringAnalysis//

//import the scanner
import java.util.Scanner;

public class StringAnalysis
{
    public static void main (String [] args)
    {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = myScanner.next();
        System.out.print("Do you want to check all characters? ");
        String yn = myScanner.next();
        if(yn.equals("y"))
        {
            boolean check = analysis(input);
            if(check == true)
            {
                System.out.println("The string is all letters");
            }
            else
            {
                System.out.println("The string is NOT all letters");
            }
        }
        else if(yn.equals("n"))
        {
            System.out.print("Enter the number of characters you want to check ");
            int check = myScanner.nextInt();
            boolean validate = analysis(input);
            if(validate == true)
            {
                System.out.println("The choosen range is all letters");
            }
            else
            {
                System.out.println("The chosen range is NOT all letters");
            }
        }
        
    }
    public static boolean analysis(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            if(!Character.isLetter(str.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean analysis(String str, int number)
    {
        int whatever=0; 
        if(number > whatever)
        {
            whatever = str.length();
        }
        else
        {
            whatever = number;
        }
        for(int i=0; i<whatever; i++)
        {
            if(!Character.isLetter(str.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}