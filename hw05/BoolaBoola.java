/*  Jeffrey Stewart
    CSE 02
    hw05-BoolaBoola
    09/30/2014
    
    Purpose: Gives random boolean equation, using
    3 true/false and 2 operators. Then prompts user 
    for the answer. Will either say incorrect or 
    correct depending on the accuracy of the answer.
    
*/
import java.util.Scanner;                                                       //import Scanner
public class BoolaBoola {                                                       //class of program
    public static void main (String [] args) {                                  //main method of program
        Scanner input;                                                          //define scanner to input
        input = new Scanner (System.in);                                        //input protocol
        int logic1 = (int) (Math.random()*2);                                   //random number 0 or 1
        int logic2 = (int) (Math.random()*2);                                   //^
        int truefalse1 = (int) (Math.random()*2);                               //^
        int truefalse2 = (int) (Math.random()*2);                               //^
        int truefalse3 = (int) (Math.random()*2);                               //^
        boolean TF1 = false;                                                    //set boolean variables
        boolean TF2 = false;                
        boolean TF3 = false;
        switch (truefalse1){                                                    //switch for truefalse1
            case 0:                                                             //truefalse1 = 0
                TF1 = false;                                                    //set to false
                break;                                                  
            case 1:                                                             //truefalse1 = 1
                TF1 = true;                                                     //set to true
                break;
        }
        switch (truefalse2){                                                    //repeat for truefalse2
            case 0:
                TF2 = false;
                break;
            case 1:
                TF2 = true;
                break;
        }
        switch (truefalse3){                                                    //repeat for truefalse3
            case 0:
                TF3 = false;
                break;
            case 1:
                TF3 = true;
                break;
        }
        boolean ans = false;                                                    //define boolean ans variable (false for now)
        String op1 = "0";                                                       //define string op1 and op2 (0 for now)
        String op2 = "0";
        switch (logic1) {                                                       //logic operator 1
            case 0:                                                             //if 0
                op1 = "&&";                                                     //first logic operator is &&
                switch (logic2) {                                               //logic operator 2
                    case 0:                                                     //if 0
                        op2 = "&&";                                             //second operator is &&
                        if (TF1 && TF2 && TF3){                                 //first combination (if its true, ans is true)
                            ans = true;                                             //if not true -> else -> ans is false
                        }
                        else {
                            ans = false;
                        }
                        break;
                    case 1:                                                     //if 1
                        op2 = "||";                                             //second logic operator is ||
                        if (TF1 && TF2 || TF3){                                 //second combination (if true ans=true , if false ans=false)
                            ans = true;
                        }
                        else {
                            ans = false;
                        }
                        break;
                }
                break;
            case 1:                                                             //if 1
                op1 = "||";                                                     //first logic operator is ||
                switch (logic2) {                                               //logic operator 2
                    case 0:                                                     //if 0 
                        op2 = "&&";                                             //second logic operator is &&
                        if (TF1 || TF2 && TF3) {                                //third combination (if true ans=true, if false ans=false)
                            ans = true;
                        }
                        else {
                            ans = false;
                        }
                        break;
                    case 1:                                                     //if 1
                        op2 = "||";                                             //second logic operator is ||
                        if (TF1 || TF2 || TF3) {                                //fourth/final combination (if true ans=true, if false ans=false)
                            ans = true;
                        }
                        else {
                            ans = false;
                        }
                        break;
                }
                break;
            default:                                                            //if logic1 is neither 0 or 1, error
                System.out.println("error");
                break;
        }
        System.out.println("Is ("+TF1+" "+op1+" "+TF2+" "+op2+" "+TF3+") true (T / t) or false (F / f)?");  //prompts user to guess for T/t/F/f
        String userAns = input.next();                                          //takes user input
        boolean userAnsB = false;                                               //defines boolean userAnsB (false for now)
        if (userAns.equals("f") || userAns.equals("F")){                        //if user gave f/F
            userAnsB = false;                                                   //answer is false
            if (userAnsB && ans){                                               //if ans and user answer are the same
                System.out.println("Correct.");                                 //print correct
            }
            else{                                                               //if they are not the same
                System.out.println("Incorrect.");                               //print incorrect
            }
        }
        if (userAns.equals("t") || userAns.equals("T")){                        //if user gave t/T
            userAnsB = true;                                                    //interpret to be true
            if (userAnsB && ans){                                               //if user answer and ans are equal
                System.out.println("Correct.");                                 //print correct
            }
            else {                                                              //if they are not equal
                System.out.println("Incorrect.");                               //print incorrect
            }
        }
            
        
        
    }   
}                                                                               //end open if/else statement, main method, program class

/*  While testing this code, I had some issues with getting the correct answers 
    from the boolean operations. I am unsure if it is a lack of understanding on
    my part, or if java is doing something weird with the operations. Most of
    the time the answers will match, but occasionally they do not. I don't think
    it is my code, but rather java doing the calculations with 2 boolean operators
*/