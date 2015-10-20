//Matt Wong
//hw08
//Area
//
//  first compile the program 
//      Area.java
//  run the program
//      Area//

//import the scanner
import java.util.Scanner;

public class Area
{
    public static void main ( String [] args)
    {
        Scanner myScanner = new Scanner(System.in);
        String shape = "";
        
        System.out.print("Enter the shape: ");
        shape = myScanner.next();
        
        if(shape.equals("rectangle"))
        {
            double rectArea= rect();
            System.out.println("The area is " + rectArea);
        }
        else if (shape.equals("triangle"))
        {
            double triArea = tri();
            System.out.println("The area is " + triArea);
        }
        else if (shape.equals("circle"))
        {
            double circArea = circ();
            System.out.println("The area is " + circArea);
        }
            
    }
    public static double rect()
    {
        System.out.print("Enter the length: ");
        double length = validate();
        System.out.print("Enter the width: ");
        double width = validate();
        
        double area = length*width;
        return area;
    }
    public static double tri()
    {
        System.out.print("Enter the base: ");
        double base = validate();
        System.out.print("Enter the height: ");
        double height = validate();
        
        double area = 0.5*(base*height);
        return area;
    }
    public static double circ()
    {
        System.out.print("Enter the radius: ");
        double radius = validate();
        
        double area = 3.14159*(radius*radius);
        return area;
        
    }
    public static double validate()
    {
        Scanner myScanner= new Scanner(System.in);
        while(!myScanner.hasNextDouble())   
        {
            System.out.print("Error: you have not enter a double, please enter a double: ");
            myScanner.next();
        }
        double input = myScanner.nextDouble();
        return input;
    }
    
    /*
    circleAre = calculator(int radius);
    rectArea = calculatro(int length, int width);
    
    public static double calculatro(int lenght, int width) {
    .....rectangle radius
    }
    public static double calculatro(int radius) {
        ....circle
    }
    */
    
}