//Matt Wong
//

import java.util.Scanner;

public class BarGraph
{
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner (System.in);
        
        //Expenses for Monday
        System.out.print ("Enter the expenses for Monday: $");
        //checks if the input is an double
        boolean error = true;
        double mon = 0;
        while(error)
        {
            if(myScanner.hasNextDouble())
                {
                    mon =myScanner.nextDouble();
                    if(mon >= 0)
                    {
                        error = false;
                    }
                    else
                    {
                        System.out.print("Sorry you did not enter an integer. Try again: ");
                        myScanner.next();
                    }
        
        
                }
            else
                {
                    System.out.print("Sorry you did not enter an integer. Try again: ");   
                    myScanner.next();
                }
        }
        
        //expenses for Tuesday
        System.out.print ("Enter the expenses for Tuesday: $");
         //checks if the input is an double
         error=true;
        double tues = 0;
        while(error)
        {
            if(myScanner.hasNextDouble())
                {
                    tues =myScanner.nextDouble();
                    if(tues >= 0)
                    {
                        error = false;
                    }
                    else
                    {
                        System.out.print("Sorry you did not enter an integer. Try again: ");
                        myScanner.next();
                    }
        
        
                }
            else
                {
                    System.out.print("Sorry you did not enter an integer. Try again: ");   
                    myScanner.next();
                }
        }
        
        
        //expenses for Wednesday
        System.out.print ("Enter the expenses for Wednesday: $");
         //checks if the input is an double
        error=true;
        double wed = 0;
        while(error)
        {
            if(myScanner.hasNextDouble())
                {
                    wed =myScanner.nextDouble();
                    if(wed >= 0)
                    {
                        error = false;
                    }
                    else
                    {
                        System.out.print("Sorry you did not enter an integer. Try again: ");
                        myScanner.next();
                    }
        
        
                }
            else
                {
                    System.out.print("Sorry you did not enter an integer. Try again: ");   
                    myScanner.next();
                }
        }
        
        //expenses for Thursday
        System.out.print ("Enter the expenses for Thursday: $");
         //checks if the input is an double
        error=true;
        double thur = 0;
        while(error)
        {
            if(myScanner.hasNextDouble())
                {
                    thur =myScanner.nextDouble();
                    if(thur >= 0)
                    {
                        error = false;
                    }
                    else
                    {
                        System.out.print("Sorry you did not enter an integer. Try again: ");
                        myScanner.next();
                    }
        
        
                }
            else
                {
                    System.out.print("Sorry you did not enter an integer. Try again: ");   
                    myScanner.next();
                }
        }
        
        //expenses for Friday
        System.out.print ("Enter the expenses for Friday: $");
         //checks if the input is an double
        error=true;
        double fri = 0;
        while(error)
        {
            if(myScanner.hasNextDouble())
                {
                    fri =myScanner.nextDouble();
                    if(fri >= 0)
                    {
                        error = false;
                    }
                    else
                    {
                        System.out.print("Sorry you did not enter an integer. Try again: ");
                        myScanner.next();
                    }
        
        
                }
            else
                {
                    System.out.print("Sorry you did not enter an integer. Try again: ");   
                    myScanner.next();
                }
        }
        
        //expenses for Saturday
        System.out.print ("Enter the expenses for Saturday: $");
         //checks if the input is an double
        error=true;
        double sat = 0;
        while(error)
        {
            if(myScanner.hasNextDouble())
                {
                    sat =myScanner.nextDouble();
                    if(sat >= 0)
                    {
                        error = false;
                    }
                    else
                    {
                        System.out.print("Sorry you did not enter an integer. Try again: ");
                        myScanner.next();
                    }
        
        
                }
            else
                {
                    System.out.print("Sorry you did not enter an integer. Try again: ");   
                    myScanner.next();
                }
        }
        
        //expenses for Sunday
        System.out.print ("Enter the expenses for Sunday: $");
         //checks if the input is an double
        error=true;
        double sun = 0;
        while(error)
        {
            if(myScanner.hasNextDouble())
                {
                    sun =myScanner.nextDouble();
                    if(sun >= 0)
                    {
                        error = false;
                    }
                    else
                    {
                        System.out.print("Sorry you did not enter an integer. Try again: ");
                        myScanner.next();
                    }
        
        
                }
            else
                {
                    System.out.print("Sorry you did not enter an integer. Try again: ");   
                    myScanner.next();
                }
        }
        
        System.out.println("");
        
        //Prints out expenses
        System.out.println ("Expenses for Monday: $" + mon);
        System.out.println ("Expenses for Tuesday: $" + tues);
        System.out.println("Expenses for Wednesday: $" + wed);
        System.out.println("Expenses for Thursday: $" + thur);
        System.out.println ("Expenses for Friday: $" + fri);
        System.out.println ("Expenses for Saturday: $" + sat);
        System.out.println("Expenses for Sunday: $" + sun);
        
        
        System.out.println("");
        
        //Bar graph for monday
        System.out.print ("Mon: ");
        for(int i=0; i<mon; i++)
        {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //Bar graph for Tuesday
        System.out.print("Tues: ");
        for(int i=0; i<tues; i++)
        {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //Bar graph for Wednesday
        System.out.print("Wed: ");
        for(int i=0; i<wed; i++)
        {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //Bar graph for thursday
        System.out.print("Thurs: ");
         for(int i=0; i<thur; i++)
        {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //Bar graph for Friday
        System.out.print("Fri: ");
        for(int i=0; i<fri; i++)
        {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //Bar graph for Saturday
        System.out.print("Sat: ");
        for(int i=0; i<sat; i++)
        {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //Bar graph for sunday
        System.out.print("Sun: ");
        for(int i=0; i<sun; i++)
        {
            System.out.print("*");
        }
        
        System.out.println("");
        
        //average daily expeneses
        double average = (mon + tues+wed+thur+fri+sat+sun)/7;
        average = (int)(average*100)/100.00;
        System.out.println("Your average daily expenses is $" + average);
        
        
        //expenditure for next week
        int j;
        double total=0;
        for(j=0; j<208; j++)
        {
            int expenditure = (int)Math.random()*40;
            if(expenditure<21)
            {
                total = (1+(expenditure/100))*(int)(average);
            }
            else if (expenditure>22 && expenditure<40) 
            {
                total = (1-(expenditure/100))*(int)(average);
            }
        }
        System.out.println("Your 4 year expenditure is: " + total);
    }
}