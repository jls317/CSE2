/*      Jeffrey Stewart
        CSE 02
        HW06
        10/13/2014
        
        Purpose: To simulate a roulette wheel spinning 't' times (t=100) and how
        many times it lands on a random number. Will simulate this for 'c' times
        (c=1000). At end of simulation, the program will give the number of times
        that the number did not match in all 100 spins and the number of times
        it matched 3 or more times (made a profit ($36 per match with $1 cost per
        spin)). It will also show total winnings and losings, along with the net
        cost for playing.
*/

public class Roulette {
    public static void main(String [] args){
        int x, c, win, pick, spin, profit,t,nothing;                            //declaration of variables
        double pickd, spind;
        c=1000;                                                                 //number of simulations to run
        profit=0;                                                               //initialization of profit, winT, lostT, nothing
        int winT=0;
        int lostT=0;
        nothing=0;
        while (c>0){                                                            //Simulates 100 spins for 'c' times
            t=100;                                                              //number of spins
            x=0;                                                                //number of matches
            pickd=Math.random()*37;                                            //random number of pick
            pick = (int) pickd;                                                 //truncates to integer
            while (t>0){                                                        //Simulates 1 spin for 't' times
                spind=Math.random()*37;                                        //random number of spin
                spin = (int) spind;                                             //truncates to integer
                t--;                                                            //number of total spins 't' decreases
                if (spin==pick){                                                //if spin equals pick
                    x++;                                                        //increase number of matches
                }
            }                                                                   //finished 't' spins
            if (x==0){                                                          //if at end of 't' spins x equals 0
                nothing++;                                                      //increase number of no matches by 1
            }
            win = x*36;                                                         //calculates money won (matches * $36)
            winT=winT+win;                                                      //keeps running total of all winnings
            lostT+=100;                                                         //lose $100 for every 100 spins
            if (win>100){                                                       //if winning after 100 spins is greater than $100
                profit++;                                                           //walk away with profit (+1)
            }
            c--;                                                                //finishes one simulation (continues for 'c' times)
        }
        int net= winT-lostT;                                                    //calculates net winnings (winnings - loses)
        System.out.println("Times with nothing: "+nothing+"");                  //Displays Simulation Results
        System.out.println("Times with profit: "+profit+"");                    //Times with no matches, times with profit
        System.out.println("Total winnings: $"+winT+"");                        //Total winnings
        System.out.println("Total cost: $"+lostT+"");                           //Total losses
        System.out.println("Net Winnings: $"+net+"");                           //Net Total from All simulations
    }
}                                                                               //end method and class of program