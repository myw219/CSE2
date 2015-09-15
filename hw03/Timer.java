//Matthew wong
//timer 

//import the scanner 
import java.util.Scanner;
public class Timer
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner ( System.in ); //assign the scanner
        
        //user inputs the times 
        System.out.print("Enter the current time: ");
        int currentTime = myScanner.nextInt();
        System.out.print("Enter the time that you will be eating dinner: " );
        int dinnerTime = myScanner.nextInt();
        
        //the results
        int timeLeftHours = (dinnerTime - currentTime)/100;
        int timeLeftMin = (dinnerTime-currentTime)%100;
        System.out.println("You have " + timeLeftHours + " hours and " + timeLeftMin + " mintues until dinner");
        
        
    }

}