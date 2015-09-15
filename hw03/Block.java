//Matthew Wong
//Blocks program

import java.util.Scanner;
public class Block
{
    public static void main (String [] args)
    {
        //set teh scanner
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter the length of the block: ");
        double blockLength = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double blockWidth = myScanner.nextDouble();
        System .out.print("Enter the height of the block: ");
        double blockHeight = myScanner. nextDouble();
        double volume = blockLength*blockWidth*blockHeight;
        double surfaceArea = (2*(blockLength*blockWidth))+(2*(blockLength*blockHeight))+(2*(blockWidth*blockHeight));
        
        //volume area
        System.out.println("The volume of the block of dimensions " + blockLength + " x "+ blockWidth + " x " + blockHeight + " is " + volume);
        
        //surface area
        System.out.println("The surface area is " + surfaceArea);
        
    }
}