/*  Jeffrey Stewart
    9/12/14
    CSE 2
    lab03-BigMac
*/

import java.util.Scanner;       //imports java scanner to use scanner class
                                //allows user inputs instead of fixed inputs
public class BigMac {           //opening class statement
    public static void main(String[] args){     //main method inside of class
    
    Scanner myScanner;          //define myScanner variable with the imported scanner
    myScanner = new Scanner (System.in);    //allows system inputs to scanner
    System.out.print(
        "Enter the number of Big Macs(an integer > 0); "); //asks user for integer
    int nBigMacs = myScanner.nextInt();     //this statement allows the user to input an integer
    System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): "); //prompts user for cost
    double bigMac$ = myScanner.nextDouble();        //allows cost input in form of double
    System.out.print(
        "Enter the percent tax as a whole number (xx): ");  //prompts user for % tax as whole number
    double taxRate = myScanner.nextDouble ();     //allows tax input in form of double
    taxRate/=100; //configures percentage tax rate to decimal
    double cost$;
    int dollars,    //dollar amount of cost
        dimes,
        pennies;    //for storing digits to the right of decimal place
    cost$ = nBigMacs*bigMac$*(1+taxRate); //total cost
    dollars= (int) cost$; //takes dollar amount from total
    dimes= (int)(cost$*10)%10;
    pennies= (int)(cost$*10)%10;
    System.out.println("The total cost of " +nBigMacs+ "Big Macs at $"+bigMac$+" per Big Mac with a sales tax of "+(int)(taxRate*100)+ "%, is $"+dollars+'.'+dimes+pennies); //prints display with all given information including total cost
        
    }
}