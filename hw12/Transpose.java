//Matt Wong
//hw12
//Transpose
//
//  first compile the program 
//      javac Transpose.java
//  run the program
//      java Transpose
import java.util.Scanner;
public class Transpose
{
    public static void main(String[] args)
    {
        boolean check=false;
        boolean check2=false;
        System.out.print("Enter the width: ");
        Scanner myScanner = new Scanner(System.in);
        int width = 0;
        int height =0;
        while(!check)
        {
            if(myScanner.hasNextInt())
            {
                width = myScanner.nextInt();
                if(width<0)
                {
                    check = true;
                }
                else
                {
                    System.out.print("Error: width must be positive. Enter another width: ");
                    myScanner.next();
                }
            }
            else
            {
                System.out.print("Error: width must be a number. Enter another width: ");
                myScanner.next();
            }
        }
        
        System.out.print("Enter the height: ");
        while(!check2)
        {
            if(myScanner.hasNextInt())
            {
                height = myScanner.nextInt();
                if(height<0)
                {
                    check = true;
                }
                else
                {
                    System.out.print("Error: height must be positive. Enter another width: ");
                    myScanner.next();
                }
            }
            else
            {
                System.out.print("Error: height must be a number. Enter another width: ");
                myScanner.next();
            }
        }
        
        int[][] matrix = new int[height][width];
        randomMatrix(width, height, matrix);
        printMatrix(width, height, matrix);
        transposeMartix(matrix);
        printMatrix(width, height, matrix);
        
    }
    
    public static int[][] randomMatrix(int width, int height, int[][] matrix)
    {
        for(int i=0; i<height; i++)
        {
            //System.out.println("i: " + i + "/" + height);
            for(int j=0; j<width; j++)
            {
                //System.out.println("j: " + j + "/" + width);
                matrix[i][j] = (int)((Math.random()*11)+1);
            }
        }
        return matrix;
    }
    
    
    public static void printMatrix(int width, int height, int[][] matrix)
    {
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0; j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
        System.out.println("");
        }
    }
    public static int[][] transposeMartix(int[][] matrix)
    {
        int [][] temp = new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length;i++)
        {
            for (int j = 0; j<matrix[0].length; j++)
            {
                temp[j][i] = matrix[i][j];
            }
        }
        System.out.println("");
        System.out.println("Transposed");
        return temp;
    }
}