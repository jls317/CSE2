/*  Jeffrey Stewart
    CSE 02
    Lab10
*/
import java.util.Scanner;

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
  

    public static int addDigit(int a, int b){       //addDigit method
        double adouble= (double) a;                 //convert number to double
        int c=0;                                    //initialize counter
        if (adouble<0 && b<0){                      //if both numbers are negative
            adouble*=-1;                            //change to positive
            b*=-1;
        }
        if (adouble<0 && b>0){                      //if numbers are negative and positive
            b*=-1;                                  //change b to negative
        }                                               //b should never be negative to start
            
        while (!(adouble<1 && adouble> -1)){        //while adouble is not between -1 and 1
            adouble/=10;                            //divide by 10
            c++;                                    //increment counter
        }
        if (adouble>0){                             //if positive add number for calculation correction
            adouble+=.00000000001;
        }
        if (adouble<0){                             //if negative subtract number for calculation correction
            adouble-=.00000000001;
        }
        double ans = adouble+b;                     //add adouble (a decimal) to b (an integer)
        while (c>0){                                //for every c we divided
            ans*=10;                                    //multiply back by 10
            c--;                                    //decrement c
        }
        int ansI = (int) ans;                       //convert double back to integer    
        return ansI;                                //return answer integer
    }
    
    public static int join(int a, int b){           //join method
        return addDigit(b,a);                       //does equivalent task as addDigit but in reverse order inputs
    }
}