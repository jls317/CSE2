/*  Jeffrey Stewart
    CSE 2
    HW03-FourDigits
    09/14/2014
    
    Purpose: To give the first 4 digits of a double that the user inputs.
    This should occur regardless of the digits to the left of decimal point
    and numbers after the 4 first digits.
*/

import java.util.Scanner;       //import java scanner
                                //allows users to input

//starting class for program
public class FourDigits {
    //main method in class
    public static void main (String [] args) {
        Scanner myScanner;          //define myScanner to Scanner
        myScanner = new Scanner (System.in); //allows system to add inputs
        
        System.out.print(
            "Input a number to see first 4 digits after the decimal point: ");  //Prompts user for input number
       double input= myScanner.nextDouble();   //Accepts user inputs and assigns it to variable input     
       int wholeN= (int) input;                 //finds the whole number portion of input
       double input1= input*10000;              //multiplies input by 10000 (moves four decimal places left)
                                                //first 4 digits past decimal are now part of whole number portion
       input1= (int) input1;                    //finds whole number portion (includes 4 decimal places)
       int wholeN1=wholeN*10000;                //multiplies original integer by 10000 (same scale as more exact number)
       double digits=input1-wholeN1;            //subtracts original integer from more exact integer 
                                                //separates original integer portion from original 4 digits past decimal point
       int digitsf= (int) digits;               //converts into integer
       String digitsFormat= String.format("%04d", digitsf); //formats digits string to have 4 places (with leading places as 0)
       System.out.println("First four digits after the decimal place: "+digitsFormat+"");  //prints formatted string
    }
}

/* Conclusion
Needed to format the output so that the string was always 4 digits long. 
Without formatting the result would drop leading zeroes. Since it is 
formatted the leading zeroes appear in the result.
*/