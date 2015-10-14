//Matt Wong
//hw07
//Twisty
//
//  first compile the program 
//      Twisty.java
//  run the program
//      Twisty//

//imports the scanner
import java.util.Scanner;

//creates the class
public class Twisty
{
    //main method
    public static void main(String [] args)
    {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Input your desired length: ");
        int length = 0;
        int width = 0; 
        boolean check = false;
        boolean check2 = false;
        
        //checks for integers, if it isn't, return an error
        while(!check)
        {
            if(myScanner.hasNextInt())
            {
                length = myScanner.nextInt();
                if(length<=80)
                {
                    check = true;
                }
                else
                {
                    System.out.print("Error: Integer is not less than 80, please try again: ");    
                    continue;
                }
            }
            else
            {
                System.out.print("Error: Please input an integer: ");
                myScanner.next(); 
            }
        }
        System.out.print("Input your desired width: ");
        while(!check2)
        {
            if(myScanner.hasNextInt())
            {
                width = myScanner.nextInt();
                if(width<length)
                {
                    check2 = true;
                }
                else
                {
                    System.out.print("Error: Please input a number that is less than the length: ");
                    continue;
                }
            }
            else
            {
                System.out.print("Error: Please input an integer: ");
                myScanner.next();
                continue;
            }
        }
        
        //loops through each line
        for(int i=0; i<width; i++)
        {
            //loops through and depending on j, determines wheither to put #, /, or \
            for(int j=0; j<length; j++)
            {
                if( i == j%width)
                {
                    if ((int)(j/width)%2==0)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print("\\");
                    }
                }
                else if((j%width)==width - i -1)
                {
                    if((int)(j/width)%2==0)
                    {
                        System.out.print("/");
                    }
                    else
                    {
                        System.out.print("#");
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //System.out.println();
        }
    }
}