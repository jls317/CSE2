/*  Jeffrey Stewart
    CSE 2
    HW03-Root
    09/13/2014
    
    Purpose: To approximate the cube root of a number given by the user. 
    By substituting the guess back into the equation multiple times, we 
    are able to find this approximation. The more times the substitution
    occurs the more accurate our cube root becomes.
*/

import java.util.Scanner;       //import java scanner
                                //allows users to input

//starting class for program
public class Root {
    //main method in class
    public static void main (String [] args) {
        Scanner myScanner;          //define myScanner to Scanner
        myScanner = new Scanner (System.in); //allows system to add inputs
        
        System.out.print(
            "Input a number to find its cube root: ");  //Prompts user for input number
       double input= myScanner.nextDouble();   //Accepts user inputs and assigns it to variable input     
       double guess=input/3;                    //Initial value of guess (using while)
       double diff=10;                          //defines variable difference (arbitrary)
       int x=0;                                 //defines x the counter in our while statement
       double guess1=input/3;                   //Initial value of guess (4 calculation only)
       double L= 1;                             //Accuracy of while loop
      
       while (diff<-L || diff>L){                          //begins while statement (1 is the accuracy)
                                                //the lower the number the higher the accuracy
           guess=((2*guess*guess*guess)+input)/(3*guess*guess); //guess formula to generate cube root
           x+=1;                                //counter (everytime while loop occurs count goes up 1)
           diff=(input-(guess*guess*guess));    //compares "guess cube root" with input number
                                                //when within 1 the loop will stop
       }
        
        
        System.out.println("The cube root of "+input+" is approximately "+guess+"."); 
        //prints out line giving user the approximate cube root of the input
        System.out.println(""+guess+"*"+guess+"*"+guess+"="+guess*guess*guess+""); //confirms cube root in print function
        System.out.println("Value achieved in "+x+" calculations.");    //displays number of calculations/loops the program went through
        System.out.println(" ");                                        //space for clarity
        System.out.println("USing only 5 calculations:");               //Using only 5 calculations
        
        guess1=((2*guess1*guess1*guess1)+input)/(3*guess1*guess1);      //Calculation1
        guess1=((2*guess1*guess1*guess1)+input)/(3*guess1*guess1);      //Calculation2
        guess1=((2*guess1*guess1*guess1)+input)/(3*guess1*guess1);      //Calculation3
        guess1=((2*guess1*guess1*guess1)+input)/(3*guess1*guess1);      //Calculation4
        guess1=((2*guess1*guess1*guess1)+input)/(3*guess1*guess1);      //Calculation5

        System.out.println(""+guess1+" is the cube root");              //takes guess1 after 5 calculations and displays it
        System.out.println(""+guess1+"*"+guess1+"*"+guess1+"="+guess1*guess1*guess1+"");    //gives cube root of answer

    }
}

/* Conclusion:

Using the while loop gave closer approximations due to it using more calculations.
The loop gives control of the amount of error that is acceptable (used 1 as default).
5 calculations are only good for inputs up to 40. After that the approximations 
have an error of .5 or greater. The higher the number, the more error. 

*/