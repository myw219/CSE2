//Matt Wong
//Lab07
//_x
//
//  first compile the program 
//      javac _x.java
//  run the program
//      java _x//

//import the scanner
import java.util.Scanner;

//declare the main class
public class _x
{
    //declare the main method
    public static void main (String [] args)
    {
        //declare scanner
        Scanner myScanner = new Scanner(System.in);
        boolean check = false;
        
        int num = 0;
        
        System.out.print("Enter a integer between 1 and 100: ");
        
        while(!check)
        {
            if(myScanner.hasNextInt())
            {
                num = myScanner.nextInt();
                if(num<100 && num>0)
                {
                    check = true;
                }
                else 
                {
                    System.out.print("Error: this is not between 1 and 100: ");
                    myScanner.next();
                    continue;
                }
            }
            else
            {
                System.out.print("Error: this is not an integer, please enter an integer: ");
                myScanner.next();
                continue;
            }
        }
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<num; j++)
            {
                if(i==j || j== num - i-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}