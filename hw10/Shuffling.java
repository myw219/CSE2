import java.util.Scanner;
public class Shuffling
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    //suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    for (int i=0; i<52; i++)
    {
        cards[i]=rankNames[i%13]+suitNames[i/13];
    }
    printArray(cards);
    shuffle(cards);
    printArray(cards);
    hand = randomizeHand(cards);
    printArray(hand);
  }
  public static void printArray(String[] stuff)
  {
      for(int i =0; i <stuff.length; i++)
      {
          System.out.print(stuff[i] + " ");
      }
  }
  public static void shuffle(String[] cards)
  {
      System.out.println(" ");
      System.out.println(" Shuffle ");
      for (int i=0; i<52; i++)
      {
        //find a random number to swap with
        int change = (int) (Math.random()*52);
        //swap the values
        String temp = cards[i];
        cards[i] = cards[change];
        cards[change]=temp;
      }
  }
  public static String[] randomizeHand(String[] cards)
  {
    System.out.println(" ");
    System.out.println("Hand");
    String[] hand = new String[5];
      int previous = -1;
      int randomnum=0;
      for (int i=0; i<5; i++)
      {
        if(i>0)
        {
          previous = randomnum;
        }
        randomnum = (int)(Math.random()*52);
        while(previous==randomnum)
        {
          randomnum = (int)(Math.random()*52);
        }
        hand[i] = cards[randomnum];
      }
      return hand;
  }
}