/*  Jeffrey Stewart
    CSE 02
    hw08
    10/28/2014
    
    Purpose: Using created methods to check inputs of user based off of
    given strings to compare the input to. Checks that user inputs meet 
    criteria (length of 1).
    
*/
import java.util.Scanner;                                                       //import Scanner
public class HW8 {                                                              //program class

    public static void main(String[] arg) {                                     //MAIN Method
        char input;                                                             //initialize input variable
        Scanner scan = new Scanner(System.in);                                  //initialize Scanner

        System.out.print("Enter 'C' or 'c' to continue- ");                     //Prompt user for input (C or c)
        input = getInput(scan, "Cc");                                           //Call Method getInput (1)
        System.out.println("You entered '" + input + "'");                      //Print result from method


        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");                      //Prompt user for input (y,Y,n,N)
        input = getInput(scan, "yYnN", 5);                                      //call Method getInput (2)
                                                                                //give up after 5 attempts
        if (input != ' ') {                                                     //if result is not ' '
            System.out.println("You entered '" + input + "'");                  //print result from method
        }
        
        
        input = getInput(scan, "Choose a digit.", "0123456789");                //call method getInput (3)
        System.out.println("You entered '" + input + "'");                      //print result from method
    }


    //getInput (1)    
    public static char getInput(Scanner input, String equals) {                 
        input = new Scanner(System.in);                                         //initialize scanner for method
        while (true) {                                                          //loops until user enters satisfactory input
            String input1 = input.next();                                       //takes input
            if (input1.length() == 1) {                                         //checks for length of 1 in input
                int l = equals.length();                                        //l equals length of comparing string
                for (int i = l - 1; i >= 0; i--) {                              //checks each char in string (at length l)
                    if ((input1.charAt(0)) == (equals.charAt(i))) {             //if char in string equals user input
                        char inputChar = input1.charAt(0);                      //define user input to inputChar
                        return inputChar;                                       //return to main method with inputChar
                    }
                }
                System.out.print(                                               //if no match is found, display error, prompt for next input
                    "You did not enter a character from the list: \"" + equals + "\"; try again- ");
            }
            else {
                System.out.print(                                               //if not 1 character long, display error, and prompt for next input
                    "You did not enter exactly 1 character; try again-");
            }
        }
    }


    //getInput (2)    
    public static char getInput(Scanner input, String equals, int i) {
        input = new Scanner(System.in);                                         //initialize scanner for method
        while (i > 0) {                                                         //repeats i number of times (5 in this case) 
            String input1 = input.next();                                       //takes input
            if (input1.length() == 1) {                                         //checks input length for 1
                int l = equals.length();                                        //l equals length of string
                for (int j = l - 1; j >= 0; j--) {                              //checks each l of string
                    if ((input1.charAt(0)) == (equals.charAt(j))) {             //compares input to each char of string
                        char inputChar = input1.charAt(0);                      //if there is a match inputChar equals input
                        return inputChar;                                       //return to main method with inputChar
                    }
                }
                System.out.print(                                               //if nothing equals, print error, prompt for next input
                    "You did not enter a character from the list: \"" + equals + "\"; try again- ");
                i--;                                                            //decrement i 
            }
            else {
                System.out.print(                                               //not 1 character input, error, prompt
                    "You did not enter exactly 1 character; try again-");
                i--;                                                            //decrement i
            }
        }
        System.out.println("");                                                 
        char none = ' ';                                                        //set char none to ' '
        System.out.println("You have failed 5 times");                          //error message
        return none;                                                            //returns to main method with none
    }


    //getInput (3)  
    public static char getInput(Scanner input, String prompt, String equals) {
        input = new Scanner(System.in);                                         //initialize scanner for method
        while (true) {                                                          //repeats loop until satisfactory input is given
            System.out.println(prompt);                                         //print prompt given
            System.out.print(                                                   //print acceptable answers/inputs
                "Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
            String input1 = input.next();                                       //takes input
            if (input1.length() == 1) {                                         //checks for length of 1
                int l = equals.length();                                        //l equals length of string
                for (int j = l - 1; j >= 0; j--) {                              //compares input for each char l in string
                    if ((input1.charAt(0)) == (equals.charAt(j))) {             //if there is a match
                        char inputChar = input1.charAt(0);                      //set inputChar to the input
                        return inputChar;                                       //return with inputChar
                    }
                }
                System.out.println(                                             //if nothing equals, print error, prompt for next input
                    "You did not enter a character from the list: \"" + equals + "\"; try again- ");
            }
            else {
                System.out.println(                                             //if not length of 1, print error, prompt for next input
                    "You did not enter exactly 1 character; try again-");
            }
        }
    }
}