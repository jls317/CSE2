/*      Jeffrey Stewart
        CSE 02
        HW06
        11/18/2014
        
        Purpose: To give random hands to the user (a hand is five cards) as many
            times as the user wants (hits y/Y). Then when the user is done it will 
            10000 hands and show the number of pairs that each rank of card gets.
            It will also display the number of hands that don't have exactly 1 pair.
*/
import java.util.Random;                                                        //import Random function
import java.util.Scanner;                                                       //import Scanner function
public class PokerOdds{                                                         //define Class


  public static void main(String [] arg){                                       //main method
    showHands();                                                                //calls showHands method
    simulateOdds();                                                             //calls simulateOdds method
  }
  



public static void showHands(){                                                 //showHands method
                                                                                //Repeats until user enters something other than y/Y
                                                                                //Calls method to create the hand and the method to print
    Scanner input = new Scanner(System.in);                                     //Declare Scanner
    int[] hand = new int [53];                                                  //declare hand array (0-52)
    while(true){                                                                //repeats while true (until break; in code)
        hand = showOneHand();                                                   //calls showOneHand method
        convert(hand);                                                          //calls convert
        System.out.print("Type Y or y to get new hand. Type anything else to continue: ");  //Prompt user for input
        String again = input.next();                                            //receives input from user
        if(again.equals("y") || again.equals("Y")){                             //if input is y/Y
            continue;                                                           //continues the while loop
        }
        else{break;}                                                            //if its not y/Y breaks from while loop
    }                                                                           //end while
}                                                                               //end showHands method



public static int[] showOneHand(){                                              //showOneHand method
                                                                                //creates a hand of 5 cards (an array with
                                                                                //5 random numbers 1-52)
    int[] deck = new int [53];                                                  //declare deck array
    for(int i=52; i >=1 ; i--){                                                 //define each integer 1-52
        deck[i]= i;                                                             
    }                                                                           //end initialization for loop
    int[] hand = new int [5];                                                   //declare hand array (5 spaces)
    for (int j = 4 ; j >= 0 ; j--){                                             //for each space (0-->4)
        int xCard=(int) (Math.random()*(j + 48)) + 1;                           //xCard is random number 1-52
                                                                                    //depends on j to simulate the deck losing a card on each draw
            hand[j]=deck[xCard];                                                //puts the card drawn from deck(with random number xCard) to hand
            deck[xCard]=deck[j + 48];                                           //replaces empty xCard spot in deck with last card in deck
    }                                                                           //end for loop
    return hand;                                                                //return the hand
}                                                                               //end showOneHand method



public static void convert(int hand[]){                                         //convert method
                                                                                //converts numbers in hand
                                                                                //prints out in user friendly diagram
    String suit[]={"Clubs:    ", "Diamonds: ", "Hearts:   ", "Spades:   "};     //4 suits, define string for each one to print later
        for(int j = 4 ; j>= 1 ; j--){                                           //for loop for each suit
            System.out.print(suit[j - 1]);                                      //prints out each suit
            for (int i = 4 ; i >= 0 ; i --){                                    //for loop for each card in hand
                if ((((4 - j)*13)<(hand[i])) && ((hand[i])<=(13*(5-j)))){       //if statement determines the suit of the card
                                                                                //as j decreases the range will increase corresponding with different suits
                                                                                //starts with 0->13 then 13->26 then 26->39 (does not include lower bound)
                    int Card = (hand[i] % 13);                                  //determines rank of card
                    if ((2<= Card) && (Card <=10)){                             //if rank is between 2 and 10
                        System.out.print(Card+"  ");                            //print that number
                    }
                    else{                                                       //if rank is different print different letters accordingly
                        switch (Card){
                            case 1:                                             //1 --> A
                                System.out.print("A  ");
                                break;
                            case 11:                                            //11 --> J
                                System.out.print("J  ");
                                break;
                            case 12:                                            //12 --> Q
                                System.out.print("Q  ");
                                break;
                            case 0:                                             //0 --> K
                                System.out.print("K  ");
                                break;
                        }                                                       //end switch statement
                    }                                                           //end else
                }                                                               //end if statement for deciding suit
            }
                System.out.println("");                                         //print line for next suit
        }                                                                       //end for loop going through each card in hand
    }                                                                           //end for loop going through each suit
 
  
    
public static boolean exactlyOneDup(int num[]){                                 //exactlyOneDup method
    int n=0;                                                                    //initialize
      for (int i = (num.length) - 1 ; i >=0 ; i--){                             //for each value in array
          for (int j = (num.length) - 1 ; j>=0; j--){                           //for each value in array
              if(i != j){                                                       //checks if both arrays are at same value
                  if(num[i] == num[j]){                                         //if array value is equal
                      n++;                                                      //increment n
                  }
              }
          }
      }
      n/=2;                                                                     //each duplicate will appear 2x :divide by 2
      if (n==1){                                                                //if n is equal to 1
          return true;                                                          
      }
      else{return false;}
  }


    
    
public static void simulateOdds(){                                              //simulateOdds method
    int[] hand = new int [53];                                                  //initialize hand array
    int[] result = new int [14];                                                //initialize result array
    int n=0;                                                                    //initialize n
    for(int j=10000; j > 0 ; j--){                                              //for 10000 runs
    hand= showOneHand();                                                        //get hand
    for(int i=4; i >=0 ; i--){                                                  //for each card in hand
        hand[i]=(hand[i])%13;                                                   //find rank of card
    }
    if(exactlyOneDup(hand)){                                                    //check for only one duplicate
        int num = OneDupNumber(hand);                                           //call oneDupNumber to find the duplicate
        for(int i = 12 ; i>=0 ; i--){                                           //scan through 13 possible numbers
            if(i==num){                                                         //if there is a match
                result[num]++;                                                  //increment that number's corresponding counter
            }
        }
    }
    else{n++;}                                                                  //else no matches (or too many)
    }
    System.out.println("Rank    Frequency of Each Pair");                       //print
    String resultString[]={"A       ","2       ","3       ","4       ","5       ","6       ","7       ","8       ","9       ","10      ","J       ","Q       ","K       "};
                                                                                //prints possible answers
    for(int i=0; i<=12 ; i++){                                                  //for each number print
        System.out.print(resultString[i]);                                      //the number
        System.out.println(result[i]);                                          //how many times that number
    }
    System.out.println("----------------");
    System.out.println("Total not exactly one pair: "+n);                       //print number that there was not exactly one pair
}



public static int OneDupNumber(int num[]){                                      //OneDupNUmber method
    int dup= -1;                                                                //initialize
        for (int i = (num.length) - 1 ; i >=0 ; i--){                           //scan through each number
            for (int j = (num.length) - 1 ; j>=0; j--){                         //scan through each number
                if(i != j){                                                     //compare locations...if not the same
                    if(num[i] == num[j]){                                       //if numbers match at different locations
                        dup = num[i];                                           //that location has duplicate
                    }  
                }
            }
        }
    return dup;                                                                 //return duplicate
    }
}