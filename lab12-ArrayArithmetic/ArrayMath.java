/* Jeffrey Stewart CSE 02 Lab12 */
import java.util.Scanner;
public class ArrayMath {
    public static void main(String[] arg) {
        double x[] = {
            2.3, 3, 4, -2.1, 82, 23
        }, y[] = {
            2.3, 3, 4, -2.1, 82, 23
        }, z[] = {
            2.3, 13, 14
        }, w[] = {
            2.3, 13, 14, 12
        }, v[], u[] = {
            2.3,
            12, 14
        };
        v = addArrays(x, y);
        System.out.println(display(x) + " \n + " + display(y) + "\n = " + display(v));
        System.out.println(display(x) + " \n + " + display(z) + "\n = " + display(addArrays(x, z)));
        System.out.println("It is " + equals(x, y) + " that " + display(x) +
            " == " + display(y));
        System.out.println("It is " + equals(z, w) + " that " + display(z) + " == " + display(w));
        System.out.println("It is " + equals(u, z) + " that " + display(u) + " == " + display(z));
    }
    public static String display(double[] x) {                      //display method
        String out = "{";                   
        for (int j = 0; j < x.length; j++) {                        //for each value in array
            if (j > 0) {                                            //adds , to string
                out += ", ";
            }
            out += x[j];                                            //adds next value of array to string
        }
        return out + "}";                                           //return print string
    }
    public static double[] addArrays(double[] x, double[] y) {      //addArrays method
        int length;                                                 //initialize length
        if (x.length > y.length) {                                  //compare lengths
            length = x.length;                                      //if x.length larger then length=x.length
        }
        else {                                                      //if y.length larger then...
            length = y.length;
        }
        double[] result = new double[length];                       //initialize result double array
        for (int i = 0; i < length; i++) {                          //for each i in length
            if (i >= x.length) {                                    //if i is larger than array x
                result[i] = y[i];                                   //answer is y[i]
            }
            if (i >= y.length) {                                    //if i is larger than array y
                result[i] = x[i];                                   //answer is x[i]
            }
            if (i < x.length && i < y.length) {                     //if i is less than length of both arrays
                result[i] = x[i] + y[i];                            //add both arrays at i and store in result[i]
            }
        }
        return result;                                              //return result array
    }
    public static boolean equals(double[] x, double[] y) {          //equals method
        if (x.length == y.length) {                                 //checks for equal length arrays
            for (int i = 0; i < x.length; i++) {                    //for each space in array
                if (x[i] != y[i]) {                                 //if values are not equal
                    return false;                                   //return false
                }
            }
            return true;                                            //if no return false, all values are the same...return true
        }
        else {                                                      //if length is not equal return false
            return false;
        }
    }
}
