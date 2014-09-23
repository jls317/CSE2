/*  Jeffrey Stewart
    CSE 02
    HW04-Month
    09/22/2014
    
    Purpose: To display number of days in a given month. 
*/

import java.util.Scanner;       //imports scanner tool to take input from user

public class Month {        //starting class for program
    public static void main (String [] args) {  //main method for program
        Scanner myScanner;
        myScanner = new Scanner (System.in);    //allows system to add inputs
        System.out.print("Enter an integer giving the number of the month (1-12): ");   //prompts user for month number
        double monthd = myScanner.nextDouble();                                 //system takes input
        if (monthd == (int)monthd && monthd<13 && monthd>0) {                   //checks if input is integer between 0 and 13 (not including 0 and 13)
        int month = (int) monthd;                                               //converts input to integer
            //IF STATEMENTS to choose which month was selected
            if (month==1){                                                      //If month is 1 then
                System.out.println("Month 1 (January) has 31 days.");           //prints january has 31 days
            }
            if (month==2){                                                      //if month is 2 then
                System.out.print("Enter the year: ");                           //asks user for year
                double yeard = myScanner.nextDouble();                          //takes input from user
                if (yeard==(int)yeard && yeard>0){                              //checks if year entered is int and greater than 0
                    int year = (int) yeard;                                     //converts year to int
                    double year4= (double) year/4;                              //divides year by 4
                    if ((int) year4 == year4) {                                 //checks if year is divisible by 4 evenly
                        System.out.println("Month 2 (February) has 29 days in "+yeard+"."); //if yes then february has 29 days
                    }
                    else {                                                                  //if no then february has 28 days
                        System.out.println("Month 2 (February) has 28 days in "+yeard+"."); //prints information
                    }
                    
                }
                else {
                    System.out.println("Enter a postive integer.");             //if user entered a decimal or negative number: error
                }
            }
            if (month==3){                                                      //if month is 3
                System.out.println("Month 3 (March) has 30 days.");             //march has 30 days
            }
            if (month==4){                                                      //if month is 4
                System.out.println("Month 4 (April) has 30 days.");             //april has 30 days
            }
            if (month==5){                                                      //if month is 5
                System.out.println("Month 5 (May) has 30 days.");               //may has 30 days
            }
            if (month==6){                                                      //if month is 6 
                System.out.println("Month 6 (June) has 30 days.");              //june has 30 days
            }
            if (month==7){                                                      //if month is 7
                System.out.println("Month 7 (July) has 31 days.");              //july has 31 days
            }
            if (month==8){                                                      //if month is 8
                System.out.println("Month 8 (August) has 31 days.");            //august has 31 days
            }
            if (month==9){                                                      //if month is 9
                System.out.println("Month 9 (September) has 30 days.");         //september has 30 days
            }
            if (month==10){                                                     //if month is 10
                System.out.println("Month 10 (October) has 31 days.");          //october has 31 days
            }
            if (month==11){                                                     //if month is 11
                System.out.println("Month 11 (November) has 30 days.");         //november has 30 days
            }
            if (month==12){                                                     //if month is 12
                System.out.println("Month 12 (December) has 31 days.");         //december has 31 days
            }
        }
        else {                                                                  //if month entered isn't an integer and between 1 and 12
            System.out.println("Please input an integer from 1 to 12");         //error
            return;                                                             //terminates program
        }                                                                       //end else
    }                                                                           //end main method
}                                                                               //end class