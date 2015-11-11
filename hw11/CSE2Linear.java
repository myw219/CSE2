//Matt Wong
//hw11
//Linear Search
//
//  first compile the program 
//      javac CSE2Linear.java
//  run the program
//      java CSE2Linear//

import java.util.Scanner;
public class CSE2Linear
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        boolean error = true;
        int[] score = new int[15];
        while(error)
        {
            int previousnum = -1;
            error = false;
            int k = 0;
            score = new int[15];
            String number = "";
            System.out.print("Enter 15 test scores: ");
            String input = myScanner.nextLine();
            input += " ";
            for(int i=0; i<input.length(); i++) 
            {
                if(input.charAt(i) != ' ')
                {
                    if(Character.isLetter(input.charAt(i)))
                    {
                        System.out.print("Error: must be an integer: ");
                        error=true;
                        break;
                    }
                    else
                    {
                        number += input.charAt(i);
                    }
                }
                else
                {
                    int things = Integer.parseInt(number);
                    if(things<100 && things >0)
                    {
                        if(things>=previousnum)
                        {
                            score[k]=things;
                            k++;
                            number = "";
                            previousnum = things;
                        }
                        else
                        {
                            System.out.print("Error: must be greater than the previous score: ");
                            error = true;
                            break;
                        }
                    }
                    else
                    {
                        System.out.print("Error: must be within 0-100: ");
                        error=true;
                        break;
                    }
                }
            }
        }
        for (int m=0; m<score.length; m++)
        {
            System.out.print(score[m] + " ");
        }
        System.out.print("Enter a grade to search for: ");
        int grade = myScanner.nextInt();
        linearSearch(grade, score);
        scramble(score);
        System.out.print("Enter a grade to search for: ");
        grade = myScanner.nextInt();
        linearSearch(grade, score);
        
    }
    public static void linearSearch(int grade, int[] score)
    {
        for(int i=0; i<score.length; i++)
        {
            if(grade == score[i])
            {
                System.out.println("Found " + grade + " with " + i + " iterations");
                return;
            }
            else
            {
                continue;
            }
        }
    }
    public static void scramble(int[] score)
    {
     
      System.out.println(" ");
      System.out.println(" Shuffle ");
      for (int i=0; i<30; i++)
      {
        //find a random number to swap with
        int change = (int) (Math.random()*15);
        //swap the values
        int temp = score[change];
        score[change] = score[0];
        score[0]=temp;
        
      }
    for (int t = 0; t<score.length; t++)
    {
        System.out.print(score[t]+ " ");
    }
    }
}