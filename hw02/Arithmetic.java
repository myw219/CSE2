//Matthew Wong
//HW02
//Arithmetic Calculator
//
//create the class
public class Arithmetic
{
    //shows the price
    public static void main(String[] args)
    {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair os socks
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes 
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopesCost$=3.25;
        double taxPercent=0.06;
        
        //total cost of socks
        double totalSockCost$=(nSocks*sockCost$);
        double sockTax$=totalSockCost$*taxPercent;
        
        //converts to 2 digits to the right of decimal
        double sockTax$2= (int)(sockTax$*100)/100.0;
    
        //converts totalSockCost$ to 2 digits to the right of decimal
        double totalSockCost$2 = (int)(totalSockCost$*100)/100.0;
        
        System.out.println("Socks");
        System.out.println(nSocks+" socks");
        System.out.println("$ " + sockTax$2 + " tax");
        System.out.println("The total cost of the socks is $ " + totalSockCost$2);
        
        //total cost of glasses
        double totalGlassesCost$ = nGlasses * glassCost$;
        double glassesTax$ = totalGlassesCost$ * taxPercent;
        
        //converts glassTax to 2 digits to the right of decimal
        double glassTax$2 = (int)(glassesTax$*100)/100.0;
        
        //converts totalGlassesCost$ to 2 digits to the right of decimal
        double totalGlassesCost$2 = (int)(totalGlassesCost$*100)/100.0;
        
        System.out.println("Glasses");
        System.out.println(nGlasses + " glasses");
        System.out.println("$" + glassTax$2 + " tax");
        System.out.println("The total cost of the glasses (without tax) is $ " + totalGlassesCost$2);
      
        
        //total cost of envelopes
        double totalEnvelopeCost$ = nEnvelopes * envelopesCost$;
        double envelopeTax$ = totalEnvelopeCost$*taxPercent;
        
        //converts envelopetax to 2 digits to the right of decimal
        double envelopeTax$2 = (int)(envelopeTax$*100)/100.0;
        
        //converts totalEnvelopeCost$ to 2 digits to the right of decimal
        double totalEnvelopeCost$2 = (int)(totalEnvelopeCost$*100)/100.0;
        
        System.out.println("Envelopes");
        System.out.println(nEnvelopes + " envelopes");
        System.out.println("$" + envelopeTax$2 + " tax");
        System.out.println("The total cost of the envelopes is $" + totalEnvelopeCost$2);
        
        //total cost of items
        double totalItemCost = totalSockCost$2+totalGlassesCost$2+totalEnvelopeCost$2;
        System.out.println("The total cost without tax $ " + totalItemCost);
        
        //total tax
        double totalTax= sockTax$2+glassTax$2+envelopeTax$2;
        System.out.println("The total tax $ " + totalTax);
        
        //The final total
        double finaltotal = totalTax+totalItemCost;
        System.out.println("The final cost is $ " + finaltotal);
        
        
    }
    
    
}