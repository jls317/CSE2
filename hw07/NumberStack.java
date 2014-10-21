/*  Jeffrey Stewart
    CSE 02
    hw07
    10/21/2014
    
    Purpose: Prints out a stack of numbers based on input.
    Numbers are centered and each digit has a dividing line.
    Lowest number starts at the top, highest number is the
    base.
    
*/
import java.util.Scanner;                                                       //import java scanner

public class NumberStack {                                                      //program class
    public static void main(String[] args) {                                    //program main method
        Scanner input = new Scanner(System.in);                                 //defines scanner
        int n;                                                                  //initializes variable n
        System.out.print("Enter an integer from 1 to 9: ");                     //prompts user for input
        if (input.hasNextInt()) {                                               //checks input for integer
            n = input.nextInt();                                                //takes input from user
            if (n >= 1 && n <= 9) {                                             //checks input for number between 1 and 9
                int y;                                                          //initializes y and x
                int x;



                //Using For Loops:                                  
                System.out.println("Using For Loops:");                         //intro statement
                for (y = 1; y <= n; y++) {                                      //y rows of numbers, 1 for each n
                    for (int k = 0; k < y; k++) {                               //repeats each number, that number of times
                        for (int j = -1 * y + n + 1; j > 0; j--) {              //centers the numbers, based on what number the 
                                                                                    //program is on (y) and the total number of
                                                                                    //numbers (n)
                            System.out.print(" ");                              //blank spaces
                        }
                        for (x = 0; x < 2 * y - 1; x++) {                       //prints out number (x) of y (odd number that
                                                                                    //gradually increase going down the stack)
                            System.out.print(y);                                
                        }
                        System.out.println("");                                 //prints for next line
                    }                                                                                                             
                    for (int j = -1 * y + n + 1; j > 0; j--) {                  //centers the numbers (same explanation as before---|)
                        System.out.print(" ");
                    }
                    for (x = 0; x < 2 * y - 1; x++) {                           //prints out dividing line based on number (x) of y
                        System.out.print("-");
                    }
                    System.out.println("");                                     //prints next line
                }
                for (int m = 2; m > 0; m--) {                                   //spacing before next set of code (while loops)
                    System.out.println("");
                }
                
                
                
                //Using While Loops:
                System.out.println("Using While Loops:");                       //intro statement
                y = 1;                                  
                while (y <= n) {                                                //number of y (corresponding to n (input))
                    int k = 0;                                                  //initialize
                    while (k < y) {                                             //repeats each number, that number of times
                        int j = -1 * y + n + 1;                                 //j= number of spaces for each row y
                        while (j > 0) {                                         //adds one space for each decrement of j until j=0
                            System.out.print(" ");                              //centers the numbers (y)
                            j--;
                        }
                        x = 0;  
                        while (x < 2 * y - 1) {                                 //prints out odd number of y (to be centered)
                            System.out.print(y);
                            x++;
                        }
                        System.out.println("");                                 //next line
                        k++;
                    }
                    int j = -1 * y + n + 1;                                     //j=number of spaces for each row y
                    while (j > 0) {                                             //prints one space for each decrement of j
                        System.out.print(" ");                                  //centers the dashes (-)
                        j--;
                    }
                    x = 0;
                    while (x < 2 * y - 1) {                                     //adds same number of dashes as number of y
                        System.out.print("-");
                        x++;
                    }
                    System.out.println("");                                     //next line
                    y++;
                }
                for (int m = 2; m > 0; m--) {                                   //spacing before the do-while loops
                    System.out.println("");
                }
                
                
                
                //Using Do-While Loops:
                System.out.println("Using Do-While Loops:");                    //intro statement Do-While
                                                                                //Since Do-While and While loops are very similar
                y = 1;                                                              //the biggest change was adding or subtracting 1
                                                                                    //from the range of the do-while to have it run 
                                                                                    //one less time than the while loop (since it 
                                                                                    //runs an extra time initially)
                do{
                    int k = 0;
                    do {
                        int j = -1 * y + (n + 1)+ 1;                            //spacing so that numbers are centered
                        do {
                            System.out.print(" ");          
                            j--;
                        } while (j > 1);                                        //adds space for every j decrement greater than 1
                        x = 0;
                        do {
                            System.out.print(y);
                            x++;
                        } while (x < 2 * y - 1);                                //prints out odd number of y's 
                        System.out.println("");                                 //next line
                        k++;
                    } while (k < y);                                            //repeats spacing and y's k<y times (depends on y)
                    int j = -1 * y + (n + 1)+ 1;                                //spacing equation
                    do {
                        System.out.print(" ");                                  
                        j--;
                    } while (j > 1);                                            //adds space for every j decrement greater than 1
                    x = 0;
                    do {                                                        //adds line of dashes
                        System.out.print("-");
                        x++;
                    } while (x < 2 * y - 1);                                    //equal number of dashes to number of y
                    System.out.println("");
                    y++;
                } while (y <= n);                                               //repeat until y reaches input number (n)
            }
            else {
                System.out.println("Integer must be between 1 and 9!");          //if integer isn't between 1 and 9; print error message
            }
        }
        else {
            System.out.println("Please provide an integer!");                   //if number isn't an integer; print error message
        }
    }                                                                           //end main method
}                                                                               //end class