/*  Jeffrey Stewart






*/

import java.util.Scanner;

public class Methods{
    
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three ints");
        a=getInt(input);
        b=getInt(input);
        c=getInt(input);
        System.out.println("The larger of "+a+" and "+b+" is " +larger(a,b));
        System.out.println("The larger of "+a+", "+b+",and "+c+" is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", "+c+" are in ascending order.");
    }

    public static int getInt(Scanner input){
        input=new Scanner(System.in);
        int a=0;
        if (input.hasNextInt()){
            a=input.nextInt();
        }
        if (a==0){
            System.out.println("Error in Input! This input will show as '0'.");
        }
        return a;
    }
    
    public static int larger(int a,int b){
        if (a>=b){
            return a;
        }
        else{
            return b;
            
        }
    }
    
    public static boolean ascending(int a,int b,int c){
        if(a<=b && b<=c){
            return true;
        }
        else{
            return false;
        }
    }
    
}