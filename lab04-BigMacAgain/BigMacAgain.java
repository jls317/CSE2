/*  Jeffrey Stewart
    CSE 02
    Lab04
    9/17/2014
    
    Purpose: Determines the price of a number of Big Macs.
    Asks for integer of Big Macs and reject negative or 
    non integer numbers. Will also ask if user would like
    an order with fries with the burgers. After all information
    is taken, the program displays the total cost
    
*/

import java.util.Scanner;                                                       //imports java scanner which allows user input

public class BigMacAgain {                                                      //starting class for the program
    public static void main (String [] args)    {                               //main method for the program and class
        Scanner myScanner;                                                      //define myScanner to Scanner
        myScanner = new Scanner (System.in);                                    //allows user to add inputs
        
        System.out.print(
            "Enter the number of Big Macs: ");                                  //prompts user to input number of big macs wanted
        double nBigMac = myScanner.nextDouble();                                //defines nBigMac given by scanner
        if (nBigMac<0)  {                                                       //only accept positive numbers
            System.out.println ("Please enter a number greater than 0!");       //tells user to enter positive number
            return;                                                             //terminate program
        }
            else{                                                               //if it is greater than 0 then continue
                int nBigMaci= (int) nBigMac;                                    //converts double bigmac to int. 
                int cost= nBigMaci*222;                                         //calculates cost in cents before converting to dollars
                double costd= cost/100;                                         //converts cost to dollars 
                
                
                if (nBigMac == (int)nBigMac) {                                  //if number is an integer        
                    System.out.println ("Would you like fries with that? ");    //asks user if they would like fries
                    System.out.println ("Y/N or y/n (Y is yes and N is no)");   //provides examples of possible inputs
                    String answer = myScanner.next();                           //takes user string input
                    
                    if (answer.equals("Y")||answer.equals("y")||answer.equals("N")||answer.equals("n")){    //if user inputted one of these options...
                        if (answer.equals("Y") || answer.equals("y")) {         //if user input a Y or y...
                           System.out.println ("An order of fries costs $2.15.");   //prints cost of fries
                           System.out.println ("The cost for the BigMacs is $"+costd+"");   //prints cost of burgers
                           System.out.println(                                  
                              "The total cost of the meal is $"+(2.15+costd)+"");   //prints total cost
                        }
                            else {                                              //if user input a N or n
                                System.out.println( 
                                    "The cost for the BigMacs is $"+costd+"");    //prints total cost without fries
                            }                                                   //end else
                    }                                                           //end if
                        else {                                                  //if something other than Y, y, N, n was given
                            System.out.println ("You did not enter either a Y, y, N, n!");  //error didn't enter recognized input
                            return;                                             //terminates program
                        }                                                       //end else
            
            
            
                }                                                               //end if
                    else {                                                      //if number is not an integer
                    System.out.println("You did not enter an integer!");        //display to user that they did not enter an integer
                    return;                                                     //terminate program
                    }                                                           //end else
            }                                                                   //end else
            
    }                                                                           //end main method
        
        
}                                                                               //end class

            