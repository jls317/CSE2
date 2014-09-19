/*  Jeffrey Stewart
    CSE 02
    Lab04
    9/17/2014
    
    Purpose:
    
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
            System.out.println ("Please enter a number greater than 0!");        //tells user to enter positive number
            return;                                                             //terminate program
        }
            else{                                                               //if it is greater than 0 then continue
                int nBigMaci= (int) nBigMac;
                int cost= nBigMaci*222;
                double costd= cost/100;
                
                
                if (nBigMac == (int)nBigMac) {                                  //if number is an integer        
                    System.out.println ("Would you like fries with that? ");    //asks user if they would like fries
                    System.out.println ("Y/N or y/n (Y is yes and N is no)");    //provides examples of possible inputs
                    String answer = myScanner.next();
                    
                    if (answer.equals("Y")||answer.equals("y")||answer.equals("N")||answer.equals("n")){
                        if (answer.equals("Y") || answer.equals("y")) {
                           System.out.println ("An order of fries costs $2.15.");
                           System.out.println(
                              "The total cost of the meal is $"+(2.15+costd)+"");
                        }
                            else {
                                System.out.println(
                                    "The total cost of the meal is $"+costd+"");
                            }
                    }
                        else {
                            System.out.println ("You did not enter either a Y, y, N, n!");
                            return;
                        }
            
            
            
                }
                    else {                                                      //if number is not an integer
                    System.out.println("You did not enter an integer!");         //display to user that they did not enter an integer
                    return;                                                     //terminate program
                    }                                                           //end else
            }
            
    }                                                                       //end main method
        
        
}                                                                           //end class

            