/*  Jeffrey Stewart
    CSE 2
    HW02-Arithmetic
    09/05/2014
    
    Purpose of the program is to calculate:
    1. The tax on each item
    2. The tax on all items
    3. The cost for each item w/o tax
    4. The cost of all items w/o tax
    5. The total cost of all items with tax
*/

//Starting class for program
public class Arithmetic {
    
    //main method for class
    public static void main (String[] args) {
        
        
        //input variables
        int nSocks=4;   //number of pairs of socks
        
        double cSocks=2.33;      //cost of 1 pair of socks
        
        int nGlasses=7;        //number of drinking glasses
        
        double cGlass=2.29;      //cost of 1 glass
        
        int nEnvelope=2;       //number of boxes of envelopes
        
        double cEnvelope=3.25;       //cost of 1 box of envelopes
        
        double PATax=0.06;    //percent tax in PA
        
        double cSocksTotal ,cSocksTotalT,cGlassTotal,cGlassTotalT,cEnvelopeTotal,cEnvelopeTotalT; //defines variables for future use
        double Total, sTotal, tax; //defines variables for future use 
        
        
        //cost calculations
        cSocksTotal=(cSocks*nSocks);                //Calculate total w/o tax
        cSocksTotalT=cSocksTotal+(cSocksTotal*PATax); //uses total to add tax
        
        cGlassTotal=(cGlass*nGlasses);      //calculate total w/o tax
        cGlassTotalT=cGlassTotal+(cGlassTotal*PATax); //uses total to add tax
        
        cEnvelopeTotal=(cEnvelope*nEnvelope);       //Calculate total w/o tax
        cEnvelopeTotalT=cEnvelopeTotal+(cEnvelopeTotal*PATax); //uses total to add tax
        
        tax=(cSocksTotal*PATax)+(cGlassTotal*PATax)+(cEnvelopeTotal*PATax); //total tax
        Total= cEnvelopeTotalT+cGlassTotalT+cSocksTotalT;  //total cost with tax
        sTotal=cSocksTotal+cGlassTotal+cEnvelopeTotal; //subtotal (total without tax)


        //truncating answers to 2 decimal places
        cSocksTotal*=100;           //truncating to two decimal places cost of socks
        int cSocksTotali=(int)cSocksTotal;      //convert to integer
        float cSocksTotalf=(float)cSocksTotali; //float to add decimal back
        cSocksTotalf/=100;                      //divide by 100 since multiplied earlier (gives two decimal places)
        
        cGlassTotal*=100;           //truncating to two decimal places cost of glasses
        int cGlassTotali=(int)cGlassTotal;
        float cGlassTotalf=(float)cGlassTotali;
        cGlassTotalf/=100;
        
        cEnvelopeTotal*=100;        //truncating to two decimal places cost of envelopes
        int cEnvelopeTotali= (int)cEnvelopeTotal;
        float cEnvelopeTotalf= (float)cEnvelopeTotali;
        cEnvelopeTotalf/=100;
        
        Total*=100;                 //truncating to two decimal places Total cost
        int Totali=(int)Total;
        float Totalf=(float)Totali;
        Totalf/=100;
        
        sTotal*=100;                //truncating to two decimal places subtotal cost
        int sTotali=(int)sTotal;
        float sTotalf=(float)sTotali;
        sTotalf/=100;
        
        tax*=100;                   //truncating to two decimal places tax cost
        int taxi= (int)tax;
        float taxf=(float)taxi;
        taxf/=100;
        
        double taxS=cSocksTotalf*PATax;     //truncating to two decimal places tax on socks
        taxS*=100;
        int taxSi=(int)taxS;
        float taxSf=(float) taxSi;
        taxSf/=100;
        
        double taxG=cGlassTotalf*PATax;     //truncating to two decimal places tax on glasses
        taxG*=100;
        int taxGi=(int)taxG;
        float taxGf=(float) taxGi;
        taxGf/=100;
        
        double taxE=cEnvelopeTotalf*PATax;  //truncating to two decimal places tax on envelopes
        taxE*=100;
        int taxEi=(int)taxE;
        float taxEf= (float)taxEi;
        taxEf/=100;
        
        
        //System Print
        System.out.println("Cost for socks: $"+cSocksTotalf+" ");           //cost for socks
        System.out.println("      Tax: $"+taxSf+" ");                       //tax for socks
        System.out.println("Cost for glasses: $"+cGlassTotalf+" ");         //cost of glasses
        System.out.println("      Tax: $"+taxGf+" ");                       //tax for glasses
        System.out.println("Cost for envelopes: $"+cEnvelopeTotalf+" ");    //cost of envelopes
        System.out.println("      Tax: $"+taxEf+" ");                       //tax for envelopes
        System.out.println(" ");                                            //space for clarity
        System.out.println("Subtotal: $"+sTotalf+" ");                      //total w/o tax
        System.out.println("Tax: $"+taxf+" ");                              //Total tax
        System.out.println("Total Cost: $"+Totalf+" ");  //Print total cost
    
        /*
        It's important to note that the costs for each item and their
        are approximate values. Due to truncating we lost information past
        2 decimal points. The costs for the individual items and their tax 
        may not always add up to the subtotal and tax amounts because the 
        calculations for these amounts used the more accurate numbers (not 
        their truncated counterparts)
        */
        
    }
}


