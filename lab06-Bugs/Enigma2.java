import java.util.Scanner;
public class Enigma2{
  public static void main(String [] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 The error given when running this code will give 2 useful pieces of information.
 The first piece of information is "/ by zero". This tells the user that
 there is somewhere in the code where it is trying to divide by 0, which
 obviously is an error. This tells you what the error is.
 The second piece of information is at the end of the error message. 
 It will give the file of the error "Enigma2.java...". Which is helpful if
 you have multiple codes running. It will also give "...:9" which is the line
 that the divide by zero error occurs on. The java.lang exception is helpful
 so that the user does not need to sift through lines upon lines of code to find
 what the error is. 
 
 
 * 
 * 
 * 
 * 
 */

