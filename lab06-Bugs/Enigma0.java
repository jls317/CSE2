/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n;
    if(scan.hasNextInt()){
      //int 
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 
 The variable "n" was only initialized in the initial if statement. The variable is only 'active' 
 within the scope of the if statement. Once the if statement closes, the variable 'n' closes as well. 
 Therefore when the program tries to print out the variable 'n' later on (outside of the if statement),
 it will generate an error (because the variable is unrecognized within the scope the program is in).
 The variable n is also initialized in the else statement and just before the switch, this is unneccessary. 
 
 Ending print statement is not identical to expected print statement.
 
 Solution: Initialize the variable 'n' before the if statement.
           Remove later initializations (remove "int" before "int n = 4" and remove ",n" from "int k=4,p=6...r=8,n;")
           Change ending print statement to read "Again" instead of "To repeat"
 
 
 
 
 
 
 
 
 */

