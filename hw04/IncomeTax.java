/*  Jeffrey Stewart
    CSE 02
    HW04-IncomeTax
    09/22/2014
    
    Purpose: To calculate the tax owed on a certain amount of income.
    It is based on different ranges of income corresponding to 
    different tax brackets.
*/

import java.util.Scanner;       //imports scanner tool to take input from user

public class IncomeTax {        //starting class for program
    public static void main (String [] args) {  //main method for program
        Scanner myScanner;
        myScanner = new Scanner (System.in);    //allows system to add inputs
        System.out.print(
            "Enter your income as an integer in thousands (Ex. 45 = 45000): ");    //prompts user for income as integer 
        double incomed = myScanner.nextDouble();       //takes input from user, assigns as variable "income"
        if ((incomed==(int)incomed) && incomed>=0) {
            incomed*=1000;                           //converts input to actual value
            int income = (int)incomed;              //converts incomed to integer
            //IF STATEMENTS
            if (income<20000) {                     //if the income is less than 20000
                int tax5 = income*5;                //multiplies income by the tax percentage
                tax5/=100;                          //converts to tax in dollars
                System.out.println("The tax rate is 5% and the tax is $"+tax5+"");  //prints tax percentage and the total tax owed
            }
        
            if (20000<=income && income<40000){     //if income is between 20000 and 40000
                int tax7 = income*7;                //uses tax of 7%
                tax7/=100;  
                System.out.println("The tax rate is 7% and the tax is $"+tax7+"");
            }
        
            if (40000<=income && income<78000){     //if income is between 40000 and 78000
                int tax12=income*12;                // uses tax of 12%
                tax12/=100;
                System.out.println("The tax rate is 12% and the tax is $"+tax12+"");
            }
        
            if (income>=78000){                     //if income is greater than or equal to 78000
                int tax14=income*14;                //uses tax of 14%
                tax14/=100;
                System.out.println("The tax rate is 14% and the tax is $"+tax14+"");
            }
        }
        else {
            System.out.println("Please enter a postive integer.");
            return;
        }
    }
}