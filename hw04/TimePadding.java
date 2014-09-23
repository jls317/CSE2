/*  Jeffrey Stewart
    CSE 02
    HW04-TimePadding
    09/22/2014
    
    Purpose: Convert time in seconds to hours:minutes:seconds in conventional
    formatting. Pads each number with 0's if both digits are not used.
*/

import java.util.Scanner;       //imports scanner tool to take input from user

public class TimePadding {        //starting class for program
    public static void main (String [] args) {  //main method for program
        Scanner myScanner;
        myScanner = new Scanner (System.in);    //allows system to add inputs
        System.out.print("Enter time in seconds: "); //prompts user for time in seconds
        double intimeS = myScanner.nextDouble();                                //takes input from user
        if (intimeS== (int) intimeS && intimeS>=0) {                            //checks if input is positive and integer
            int timeS = (int) intimeS;                                          //converts input to int
            int timeM = timeS/60;                                               //finds minutes by dividing time by 60
            int timeH = timeM/60;                                               //finds hours by dividing time by 60
            int timeMI= timeM - timeH*60;                                       //subtracts hour from minutes (to only show minutes)
            int timeSI= timeS - timeM*60;                                       //subtracts minutes from seconds (to only show seconds)
            int timeHI= timeH;                                                  //convert hours to int
            
            String hourF= String.format("%02d", timeHI );                       //add 0 padding to hours
            String minuteF = String.format("%02d" , timeMI);                    //add 0 padding to minutes
            String secondF = String.format("%02d" , timeSI);                    //add 0 padding to seconds
            
            System.out.println("The time is "+hourF+":"+minuteF+":"+secondF+"");//formatted, prints hour:minutes:seconds
        }
        else {
            System.out.println("Please enter a positive integer.");             //error message, didn't enter a positive integer
            return;                                                             //terminate program
        }
    }
}