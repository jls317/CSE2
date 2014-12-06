/*  Jeffrey Stewart
    CSE 02
    12/05/14
    hw11
    
    Purpose:
    
*/
import java.util.Scanner;

public class PokerHands{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean anotherhand = true;
        while (true){ 
            System.out.print("Enter 'y' or 'Y' to Pick a Hand- ");
            String again = input.nextLine();
            System.out.println("");
            switch (again){
                case "y":
                case "Y":
                    anotherhand=true;
                    break;
                default:
                    anotherhand=false;
                    return;
            }
        while (anotherhand){
        int[] hand = new int [5];
        int[] freq= new int [13];
        int[] ffreq= new int [5];
        hand = getHand();
        showOneHand(hand);
        freq=frequency(hand);
        ffreq=ffrequency(freq);
        
        
        
        
        analyze(ffreq , freq , hand);
        
        anotherhand=false;
        }
        }
    }
    
    public static void analyze(int[] ffreq ,int[] freq,int[] hand){
        int[] highHand= new int[10];
        
        String highHandCategory[]={"High Card: ", "One Pair", "Two Pairs", "Straight",
        "Flush","3 of a Kind", "Full House", "4 of a Kind","Straight Flush", "Royal Flush"};
        /*
        x9. Royal flush
        x8. straight flush
        x7. 4 of a kind
        x6. full house
        x5. 3 of a kind
        x4. flush
        x3. straight
        x2. two pair
        x1. one pair
        x0. high card
        */
        
        
        
        //straight
        if(ffreq[1]==5){
            for(int i=0 ; i <13 ; i++){
                if(i<=8){
                    if(freq[i]==1 && freq[i+ 1]==1 && freq[i+ 2]==1 && freq[i+ 3]==1 && freq[i+ 4]==1){
                        highHand[3]=1;
                    }
                }
            }
        }
        
        
        //flush
        int suit= hand[0]/13;
        int c= 0;
        for(int i = 0 ; i<5 ; i++){
            if(suit == hand[i]/13){
                c++;
            }
        }
        if(c==5){
            highHand[4]=1;
        }
        
        
        //high card
        int min = hand[0]%13;
        for(int i = 0 ; i < 5 ; i++){
            int rank = hand[i]%13;
            if(rank < min){
                min=rank;
            }
        }
        highHand[0]=min + 1;
        
        
        
        //one pair
        if(ffreq[2]==1){            //if one pair
            highHand[1]=1;          //set one pair
        }
        
        
        //2 pair
        if(ffreq[2]==2){
            highHand[2]=1;          //set 2 pair to 1
        }
        
        //3 of a kind
        if(ffreq[3]==1){
            highHand[5]=1;          //3 of a kind to 1
        }
        
        //4 of a kind
        if(ffreq[4]==1){
            highHand[7]=1;          //4 of a kind to 1
        }
        
        //fullhouse
        if(highHand[1] == 1 && highHand[5]==1){
            highHand[6]=1;          //full house 1
        }
        
        //straight flush
        if(highHand[3] == 1 && highHand[4]==1){
            highHand[8]=1;
        }
        //royal flush
        if (highHand[8]==1 && highHand[0]==1){
            highHand[9]=1;
        }
        
        //Print highest hand combination
        for(int i = 9 ; i>=0 ; i--){
            if(highHand[i]!=0){
                if(i==0){
                    if(highHand[i]==1){
                        System.out.println("High Card: A");
                        return;
                    }
                    if(highHand[i]==2){
                        System.out.println("High Card: K");
                        return;
                    }
                    if(highHand[i]==3){
                        System.out.println("High Card: Q");
                        return;
                    }
                    if(highHand[i]==4){
                        System.out.println("High Card: J");
                        return;
                    }
                    else{
                    System.out.println(highHandCategory[i]+highHand[i]);
                    }
                }
            
                    System.out.println(highHandCategory[i]);
                return;
            }
        }
        
    }
    
    
    
    
    public static int[] ffrequency(int freq[]){
        int[] ffreq = new int [5];
        for (int i = 0 ; i<13 ; i++){
            ffreq[freq[i]]++;
        }  
        return ffreq;
    }
    
    
    
    public static int[] frequency(int hand[]){
        int rank = -1;
        int[] freq = new int [13];
        for (int i = 0 ; i < 5 ; i++){
            rank = hand[i] % 13;
            freq[rank]++;
        }
        return freq;
    }
    
    
    
    public static void showOneHand(int hand[]){
	    String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	    String face[]={
            "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	        "4 ","3 ","2 "};
	    String out="";
	    for(int s=0;s<4;s++){
  	        out+=suit[s];
  	        for(int rank=0;rank<13;rank++)
    	        for(int card=0;card<5;card++)
     	            if(hand[card]/13==s && hand[card]%13==rank)
      	            out+=face[rank];
  	                out+='\n';
	    }
	    System.out.println(out);
    }
    
    
    
    public static int[] getHand(){
                Scanner input = new Scanner(System.in);
    int i = 0;
            int[] hand = new int [5];
            int rank=0;
            boolean suitboo=true;
            boolean rankboo=true;
            String suit="0";
            while (i < 5){
                while (suitboo){
                System.out.print("Enter clubs 'c', diamonds 'd', hearts 'h',or spades 's'- ");
                suit= input.nextLine();
                switch (suit){
                    case "c":
                    case "d":
                    case "h":
                    case "s":
                        suitboo=false;
                        break;
                    default:
                        System.out.println("Not a valid response!");
                        suitboo=true;
                }
                }
                while(rankboo){
                System.out.print("Enter 'a', 'k', 'q', 'j', 10, 9,...3, 2- ");
                String rankin= input.nextLine();
                switch (rankin){
                    case "a":
                        rank=0;
                        rankboo=false;
                        break;
                    case "k":
                        rank=1;
                        rankboo=false;
                        break;
                    case "q":
                        rank=2;
                        rankboo=false;
                        break;
                    case "j":
                        rank=3;
                        rankboo=false;
                        break;
                    case "10":
                        rank=4;
                        rankboo=false;
                        break;
                    case "9":
                        rank=5;
                        rankboo=false;
                        break;
                    case "8":
                        rank=6;
                        rankboo=false;
                        break;
                    case "7":
                        rank=7;
                        rankboo=false;
                        break;
                    case "6":
                        rank=8;
                        rankboo=false;
                        break;
                    case "5":
                        rank=9;
                        rankboo=false;
                        break;
                    case "4":
                        rank=10;
                        rankboo=false;
                        break;
                    case "3":
                        rank=11;
                        rankboo=false;
                        break;
                    case "2":
                        rank=12;
                        rankboo=false;
                        break;
                    default: 
                        System.out.println("You did not enter a valid response!rank");
                        rankboo=true;
                }
                }
                
                System.out.println("");
                
                switch (suit){
                    case "c":
                        hand[i]=rank;
                        i++;
                        suitboo=true;
                        break;
                    case "d":
                        hand[i]=rank + 13;                    
                        i++;
                        suitboo=true;
                        break;
                    case "h":
                        hand[i]=rank + 26;                        
                        i++;
                        suitboo=true;
                        break;
                    case "s":
                        hand[i]=rank + 39; 
                        i++;
                        suitboo=true;
                        break;
                    default:
                        System.out.println("You did not enter a valid response!");
                }
                rankboo=true;
                for(int j= 0 ; j < i ; j++){
                    for(int k=0 ; k < j; k++){
                    if(hand[j] == hand[k] ){
                        System.out.println("Cannot have duplicate card!");
                        i--;
                    }
                }
                }
            }
            return hand;
    }
    
}