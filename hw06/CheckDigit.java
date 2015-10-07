//Matthew Wong
//CheckDigit
//CSE2
//Check ISBN if valid

import java.util.Scanner;

public class CheckDigit{
    public static void main(String[] args){
        
        
       Scanner myScanner=new Scanner(System.in);
      
        boolean Isbnvalid=true;
        String Isbn;
        int num;
        String checksum="";
     
     
       do{
       System.out.println("Please enter a ten digit barcode: ");
       Isbn = myScanner.next();
          
           if(Isbn.length()!=10){
               System.out.print("This is a valid NOT a valid ISBN. ");
           }
        Isbnvalid=false;
      
       }while(Isbnvalid==true);
      
       if(Isbn.length()==10){
           int total = 0;
            for ( int i = 0; i < 9; i++ )
            {
            num = Integer.parseInt( Isbn.substring( i, i + 1 ) );
                total += ((10 - i) * num);
            }

            checksum = Integer.toString( (11 - (total % 11)) % 11 );
            if ( "10".equals( checksum ) ){
                checksum = "X";
            }
          }  
       
       boolean checkvalid=(checksum.equals( Isbn.substring( 10 ) ));
        if(checkvalid==false){
                System.out.println("This is NOT a valid ISBN. Check digit should be " + checksum);
            } if(checkvalid==true){
                System.out.println("This is a valid ISBN.");
            }
    }
}