/*  Jeffrey Stewart
    CSE 02
    hw09
    11/04/2014
    
    Purpose: 
    
*/


    
import java.util.Scanner;                                                       //import scanner for user input
public class BlockedAgain {                                                     //Class BlockedAgain
    public static void main(String[] s) {                                       //main Method
        Scanner input = new Scanner(System.in);                                 //declare scanner
        int m;                                                                  //declare int m
        //force user to enter int in range 1-9, inclusive.
        m = getInt();                                                           //defines m as output of getInt Method
        allBlocks(m);                                                           //allBlocks method will generate the numberstack
    }

    public static int getInt() {                                                //getInt Method
        System.out.print( 
            "Enter an integer between 1 and 9- ");                              //prompt user for input
        while (true) {                                                          //loop until return statement is reached
            int inputI = checkInt();                                            //Call checkInt and save int as inputI
            boolean isRange = checkRange(inputI);                               //Call checkRange and save boolean as isRange
            if (isRange) {                                                      //if isRange=true
                return inputI;                                                  //return the int
            }
            else {
                System.out.print("Enter an integer between 1-9! Try again- ");  //if isRange=false: try again
            }
        }
    }

    public static int checkInt() {                                              //checkInt Method
        while (true) {                                                          //loop until return statement is reached
            Scanner input = new Scanner(System.in);                             //declare Scanner variable
            if (input.hasNextInt()) {                                           //if hasNextInt is true
                int inputI = input.nextInt();                                   //take integer from scanner
                return inputI;                                                  //return integer to previous method
            }
            else {
                System.out.print("Enter an integer! Try again- ");              //if it is not an int, error message, try again
            }
        }
    }

    public static boolean checkRange(int inputI) {                              //checkRange Method
        if (inputI > 0 && inputI < 10) {                                        //compares int with 0 and 10
            return true;                                                        //if between return true to previous method
        }
        else {
            return false;                                                       //if not between, return false
        }
    }
    
    public static void allBlocks(int n){
        
        int x,y;                                                                //initializes x and y
        for (y = 1; y <= n; y++) {                                              //y rows of numbers, 1 for each n
            block (y,n);
            System.out.println("");                                     //prints next line
        }
    }
    
    public static void line(int y, int n){
        for (int j = -1 * y + n + 1; j > 0; j--) {              //centers the numbers, based on what number the 
                                                                //program is on (y) and the total number of
                                                                //numbers (n)
            System.out.print(" ");                              //blank spaces
        }
    }
    
    public static void block(int y, int n){
for (int k = 0; k < y; k++) {                               //repeats each number, that number of times
                        
                        line(y,n);
               
                        for (int x = 0; x < 2 * y - 1; x++) {                       //prints out number (x) of y (odd number that
                                                                                    //gradually increase going down the stack)
                            System.out.print(y);                                
                        }
                        System.out.println("");                                 //prints for next line
                    }   
                    
                    line(y,n);
                    
                    
                    for (int x = 0; x < 2 * y - 1; x++) {                           //prints out dividing line based on number (x) of y
                        System.out.print("-");
                    }
}
}