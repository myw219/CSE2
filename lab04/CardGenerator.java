//Matthew Wong
//Card Generator
//

public class CardGenerator
{
    public static void main (String[] args)
    {
        int randnumber = (int)(Math.random()*13)+2;
        int suitnum = (int)(Math.random()*4)+1;
        String name = "";
        String suit = "";
        
        //picks the number or name of the card
        switch(randnumber)
        {
            case 11:
                name = "Jack";
                break;
            case 12:
                name = "Queen";
                break;
            case 13:
                name = "King";
                break;
            case 14 :
                name = "Ace";
                break;
            default:
                name = Integer.toString(randnumber);
                break;
        }
        
        //picks the suit
        if(suitnum==1)
        {
            suit = "diamonds";
        }
        else if (suitnum==2)
        {
            suit = "hearts";
        }
        else if (suitnum==3)
        {
            suit = "clubs";
        }
        else if (suitnum==4)
        {
            suit = "spades";
        }
        
        //shows both the name and the suit
        System.out.println("You picked " + name + " of " + suit);
        
    }
}