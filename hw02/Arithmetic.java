/*  Jeffrey Stewart
    CSE 2
    HW02-Arithmetic
    09/05/2014
*/

//Starting class for program
public class Arithmetic {
    
    //main method for class
    public static void main (String[] args) {
        //input variables
        int nSocks=10;          //number of pairs of socks
        double cSocks=2.33;      //cost of 1 pair of socks
        
        int nGlasses=5;        //number of drinking glasses
        double cGlass=2.29;      //cost of 1 glass
        
        int nEnvelope=5;       //number of boxes of envelopes
        double cEnvelope=3.25;       //cost of 1 box of envelopes
        
        double PATax=0.06;    //percent tax in PA
        double cSocksTotal,cSocksTotalT,cGlassTotal,cGlassTotalT,cEnvelopeTotal,cEnvelopeTotalT;
        double Total, sTotal, tax;
        
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

        //rounding
        cSocksTotal*=100;           //rounding cost of socks
        int cSocksTotali=(int)cSocksTotal;      //convert to integer
        float cSocksTotalf=(float)cSocksTotali; //float to add decimal back
        cSocksTotalf/=100;                      //divide by 100 since multiplied earlier (gives two decimal places)
        
        cGlassTotal*=100;           //rounding cost of glasses
        int cGlassTotali=(int)cGlassTotal;
        float cGlassTotalf=(float)cGlassTotali;
        cGlassTotalf/=100;
        
        cEnvelopeTotal*=100;        //rounding cost of envelopes
        int cEnvelopeTotali= (int)cEnvelopeTotal;
        float cEnvelopeTotalf= (float)cEnvelopeTotali;
        cEnvelopeTotalf/=100;
        
        Total*=100;                 //rounding Total cost
        int Totali=(int)Total;
        float Totalf=(float)Totali;
        Totalf/=100;
        
        sTotal*=100;                //rounding subtotal cost
        int sTotali=(int)sTotal;
        float sTotalf=(float)sTotali;
        sTotalf/=100;
        
        tax*=100;                   //rounding tax cost
        int taxi= (int)tax;
        float taxf=(float)taxi;
        taxf/=100;
        
        double taxS=cSocksTotalf*PATax;     //rounding tax on socks
        taxS*=100;
        int taxSi=(int)taxS;
        float taxSf=(float) taxSi;
        taxSf/=100;
        
        double taxG=cGlassTotalf*PATax;     //rounding tax on glasses
        taxG*=100;
        int taxGi=(int)taxG;
        float taxGf=(float) taxGi;
        taxGf/=100;
        
        double taxE=cEnvelopeTotalf*PATax;  //rounding tax on envelopes
        taxE*=100;
        int taxEi=(int)taxE;
        float taxEf= (float)taxEi;
        taxEf/=100;
        
        //System Print
        System.out.println("Cost for socks: $"+cSocksTotalf+" ");
        System.out.println("      Tax: $"+taxSf+" "); //tax for socks
        System.out.println("Cost for glasses: $"+cGlassTotalf+" ");
        System.out.println("      Tax: $"+taxGf+" "); //tax for glasses
        System.out.println("Cost for envelopes: $"+cEnvelopeTotalf+" ");
        System.out.println("      Tax: $"+taxEf+" "); //tax for envelopes
        System.out.println(" ");
        System.out.println("Subtotal: $"+sTotalf+" ");
        System.out.println("Tax: $"+taxf+" ");
        System.out.println("Total Cost: $"+Totalf+" ");                      //Print total cost
    }
}


