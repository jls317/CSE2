/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   double rem = 0;
   // rem = 1-x/100;
   //System.out.println("rem="+rem);
   if((100-x)==93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(100-x==59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(100-x==86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(100-x==67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(100-x==40)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    else
      System.out.println("Percent entered not a selected value.");
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * 
 The acceptable inputs are: 7, 41, 14, 33, and 60
 The only input that worked was 60 before changes were made.
 The reason for this was the way java does its math. When it divides x by 100
 there is a loss in accuracy. When it does further calculations with this 
 inaccurate number, the solution is not exact. 
 To show this, I ran a print statement of the expected result (1-x/100) and
 did not get the numbers the program was looking for. Example: x=7 ... 1-7/100 
 gave an answer of .92999999 not .93. This gave a problem when I compared the answer
 to .93. 
 
 To fix the problem, I removed dividing by 100 altogether. I multiplied the whole
 expression by 100 and got: 100-x == .93*100 or 100-x == 93. This solved problems 
 with error and gave the expected results.
 
 
 * 
 * 
 */

