/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;

public class Enigma3 {
  public static void main(String [] args){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println("if1 .. n="+n+" k="+k+"");
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println("if2 .. n="+n+" k="+k+"");
    }
    else {
      n=45;
      out+=n+k;
      System.out.println("else .. n="+n+" k="+k+"");
    }
    System.out.println("n="+n+" k="+k+"");  //used these values, and calculated the sum. This gave which 
                                            //case the program to run. Then added a print statement under
                                            //that case. 
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
        System.out.println("n="+n+" k="+k+"");      //gave value n=9 and k=5
      default:                                      //program runs default (no break)
        n-=3;                                       //n-3= 6
        k-=5;                                       //k-5= 0
    }
     out+=1/n + 1/k;                                //1/n is ok , 1/k gives div. by 0 error
    System.out.println(out);
  }
}

/*
 * Error report:
 * k is equal to 0 at the final out calculation. There is no break after
case "98", therefore the program also executes the default case. This subtracts
5 from k (which is equal to 5 at that point). The last equation divides by 
n and k. It gives a divide by 0 error when it does 1/k.
 * 
 * 
 * 
 */
