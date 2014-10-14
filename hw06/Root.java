/*  Jeffrey Stewart
    CSE 02 
    hw06
    10/14/2014
    
    Purpose: Uses loops to determine the square root of a number given by the 
    user (x) within an accuracy of .0000001 (R). 
*/

import java.util.Scanner;                                                       //import Scanner
    
public class Root {                                                             //define Class for program
    public static void main (String [] args) {                                  //define main method
        Scanner input= new Scanner(System.in);                                  //set up Scanner to take input
        double low = 0;                                                         //initialize variables low,high,middle,ans
        double high= 0;
        double middle= 0;
        double ans=0;
        System.out.print(
            "Enter a positive integer to find the square root of: ");           //prompts user for positive integer
        if (input.hasNextInt()){                                                //checks for integer
            int x=input.nextInt();                                              //sets x as input
            if(x>=0){                                                           //checks for greater than 0
                high=x;                                                         //high equals input
                low=0;                                                          
                ans=0;
                double R= .0000001;                                             //defines R (accuracy)
                double ansSqu = ans*ans;                                        //ansSqu is ans squared
                while (((ansSqu-x)>R) || ((ansSqu-x)< (-1*R))){                 //while distance of ansSqu is from x is greater than R
                    middle= low+((high-low)/2);                                 //finds middle number of range [low, high]
                    if((middle*middle)>x){                                      //if middle number squared is greater than x
                        high=middle;                                            //sets high to equal middle number
                    }
                    else{                                                       //if middle number squared is less than x
                        low=middle;                                             //sets low to equal middle number
                    }
                    ans=middle;                                                 //ans equal middle (middle will eventually give square root)
                    ansSqu=ans*ans;                                             //gives square of ans
                }
            System.out.println("Square Root= "+ans+"");                         //Prints answer
            }
            else {
                System.out.println("Please enter a positive number");           //prompts user for positive number
            }
        }
        else{
            System.out.println("Please enter an integer.");                     //prompts user for an integer
        }
    }
}