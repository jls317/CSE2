/*  Jeffrey Stewart
    CSE 02
    hw05-BurgerKing
    09/30/2014
    
    Purpose: To take possible order options at 
    Burger King. Asks user to choose: burger, 
    soda, or fries. Then asks specifics about each.
    Then prints the order.
    
*/

import java.util.Scanner;                                                       //import java scanner

public class BurgerKing {                                                       //class of program
    public static void main (String [] args) {                                  //main method
        Scanner input;                                                          //defines Scanner to input
        input = new Scanner (System.in);                                        //defines input
        System.out.println(                                                         
            "Enter a letter to indicate choice:");                              //Prompts user for input
        System.out.println(
            "Burger (B or b)");                                                 //gives choice for: burger
        System.out.println(
            "Soda (S or s)");                                                   //soda
        System.out.println(
            "Fries (F or f)");                                                  //fries
        String choice = input.next();                                           //takes input
        switch (choice) {                                                       //main switch
            case "B":                                                           //case b and B for burger
            case "b":
                System.out.println(
                    "What would you like on your burger?");                     //prompts user
                System.out.println(
                    "All the fixins (A or a)");                                 //A/a for everything
                System.out.println(
                    "Cheese (C or c)");                                         //C/c for cheese
                System.out.println( 
                    "Nothing (N or n)");                                        //N/n for nothing
                String burgerTop = input.next();                                //takes input
                switch (burgerTop) {                                            //Burger Switch
                    case "A":                                                   
                    case "a":
                        System.out.println("You ordered a burger with all the fixins."); //if A/a print line
                        break;                                                  //break
                        
                    case "C":   
                    case "c":
                        System.out.println("You ordered a burger with cheese.");//if C/c print line
                        break;                                                  
                        
                    case "N":
                    case "n":
                        System.out.println("You ordered a plain burger.");      //if N/n print line
                        break;
                    default:
                        System.out.println("You entered an invalid input. (Must be A/a/C/c/N/n)"); //if entered something other 
                                                                                                   //than letters listed print line
                        break;
                }
                break;
                
            case "S":
            case "s":                                                           //if input for soda
                System.out.println("What kind of soda would you like?");        //prompts user for type of soda
                System.out.println("Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)"); //Gives options to user
                String typeSoda = input.next();                                 //takes input
                switch (typeSoda) {                                             //Soda switch
                    case "P":                               
                    case "p":
                        System.out.println("You ordered a Pepsi.");             //If P/p print line
                        break;
                    case "C":
                    case "c":
                        System.out.println("You ordered a Coke.");              //if C/c print line
                        break;
                    case "S":
                    case "s":
                        System.out.println("You ordered a Sprite.");            //If S/s print line
                        break;
                    case "M":
                    case "m":
                        System.out.println("You ordered a Mountain Dew.");      //if M/m print line
                        break;
                    default:
                        System.out.println("You entered an invalid input.(Must be P/p/C/c/S/s/M/m)");   //if input given
                                                                                                        //not an option,
                                                                                                        //print line
                        break;
                }
                break;
                
            case "F":                                                           //If F/f for fries is entered
            case "f":
                System.out.println("What size fries would you like?");          //prompts user for size input
                System.out.println("Large (L or l) or Small (S or s)");         //gives options
                String size = input.next();                                     //takes input
                switch (size) {                                                 //Fries Switch
                    case "L":                                                   //L/l for large
                    case "l":
                        System.out.println("You ordered large fries.");         //print line
                        break;
                    case "S":                                           
                    case "s":
                        System.out.println("You ordered small fries.");         //if S/s for small print line
                        break;
                    default:                                                    //if input given not an option print line
                        System.out.println("You entered an invalid input. (Must be L/l/S/s)");
                        break;
                }
                break;
            default:                                                            //if input given not valid, print line
                System.out.println("You entered an invalid input.(Must be B/b/S/s/F/f)");
                break;
        }
        System.out.println("Have a nice day!");                             //closing statement
    }
}