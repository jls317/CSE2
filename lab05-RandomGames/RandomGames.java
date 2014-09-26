/*  Jeffrey Stewart
    CSE 02
    Lab05
    09/26/2014
    
    Purpose: Runs one of the random games based on input from
    the user. Only roulette game works. Will give random 
    numbers from 0-36 including a 00 number. 
    
*/

import java.util.Scanner;                                                       //imports scanner

public class RandomGames {                                                      //define class
    public static void main (String [] args) {                                  //define method within class
        Scanner input;                                                          //names Scanner with input
        input = new Scanner (System.in);                                        //defines input 
        
        System.out.print(                                                       
            "Enter R/r for Roulette, C/c for craps, P/p for pick a card- ");    //Prompts user for input
            String game = input.nextLine();                                     //takes input from user
            switch (game) {                                                     //switch to base answers on input
                case "r":                                                       //if input=r
                case "R":                                                       //if input=R
                    
                    int roulette= (int) (Math.random()*38);                     //generate random number 0-1 multiply it by 38
                                                                                //will generate numbers from 0-37
                    if (roulette == 37){                                        //if random number is 37
                    roulette=00;                                                //redefine roulette to 00 (not needed)
                    System.out.println("Roulette: 00");                         //prints double 0 (00)
                    }
                    else                                                        //if not 37
                    System.out.println("Roulette: "+roulette+"");               //print the roulette number
                    
                    break;                                                      //break from roulette game
                    
                case "C":                                                       //if input=C
                case "c":                                                       //if input=c
                    System.out.println("The craps function has not been implemented yet."); //function not implemented
                    break;                                                      //break from craps game
                case "P":                                                       //if input=P
                case "p":                                                       //if input=p
                    System.out.println("The pick card function has not been implemented yet."); //function not implemented
                    break;                                                      //break from pick card game
                default:                                                        //if something other than R/r/C/c/P/p is entered
                    System.out.println("Invalid Input.");                       //Display error
            }                                                                   //end switch
    }                                                                           //end main method
}                                                                               //end class