/*  Jeffrey Stewart
    CSE 02
    Lab07
    10/13/2014
    
    Purpose: Asks user for input between 0-15. Displays number
    of asterisks equal to number input. Then displays ascending
    number of asterisks until it reaches that number. Will ask
    user to repeat the cycle.
    
*/

import java.util.Scanner;                                                       //import utility scanner
public class LooptheLoop {                                                      //class of program
    public static void main (String [] args) {                                  //main method of program
        Scanner input = new Scanner (System.in);                                //defines scanner
        boolean boo = true;                                                     //sets variable boo to true
        while (boo){                                                            //while boo(true)
            System.out.print("Enter an integer from 0 to 15 : ");               //PRompts user for input
            if(input.hasNextInt()){                                             //if input is an integer
                int i=input.nextInt();                                          //assigns input to i
                if(i>-1 && i<16){                                               //checks if input is between 0 and 15
                    System.out.println("");                                     //prints line for clarity
                    int x=0;                                                    //set x to 0 (counter)
                    int r=0;                                                    //set r to 0 (counter)
                    int c=i;                                                    //c is equal to input number
                    int times=0;                                                //set times to 0 (counter)
                        while (c > 0){                                          //while c is greater than 0 print *
                            System.out.print("*");                              //will run 'c' times and c=i
                            c--;                                                //will run number that was given
                        }
                    System.out.println("");                                     //print line for clarity
                        while (x < i){                                          //counts x up to i starting at 0 (will run program i times) 
                            while (r <= times){                                 //will run when r is less than times 
                                System.out.print("*");                              //first time through will run 0 (r gets reset to 0 and )
                                r++;                                                //times is incremented once (for every x<i r will go to times)
                            }                                                       //results in incrementing number of * up to i
                        times++;                                                //times+1
                        x++;                                                    //x+1
                        r=0;                                                    //reset r back to 0
                        System.out.println("");                                 //print line
                        }
                    System.out.print("Again? (No: F/f):");                      //prompts user to run again
                    String again=input.next();                                  //takes input as variable 'again'
                    System.out.println("");                                     //print line
                    switch(again){                                              //enter switch to take response
                        case "f":                                               //if enter f or F
                        case "F":
                            boo =false;                                         //boo = false (will stop main loop)
                            break;                                              //break from switch
                        default:                                                //if F or f not entered
                        System.out.println("Running again.");                   //run the loops again
                    }   
                }
                else{                                                           //if not between 0 and 15
                    System.out.println(
                        "Please enter an integer between 0 and 15.");           //error message and boo=false
                    boo=false;
                }
            }
            else{                                                               //if not integer
                System.out.println(
                    "Please enter an integer between 0 and 15.");               //error message and boo=false
                boo = false;
            }
        }
    }
}                                                                               //close open loops, method, and class