/*  Jeffrey Stewart
    CSE 02
    Lab13
*/
import java.util.Scanner;   

public class Sorting{
    public static void main(String [] args){                                    //main method
        int number;                                                             //initialize number and array
        int array[][]= new int [5][];
        for (int i= 0; i<5 ; i++){                                              //for each row in array
            array[i]= new int [i*3 + 5];                                        //for each row initialize column space
            for (int j= 0; j < i*3 + 5 ; j++){                                  //for each column
                array[i][j]= (int) (Math.random() * 40);                        //define value
            }
        }
        int sortedArray[][] = new int [5][];                                    //initialize sorted array
        sortedArray = sort(array);                                              //call method sort
        
        for (int i = 0; i< 5; i++){                                             //for each row
            for (int j = 0; j < array[i].length; j++) {                         //for each value in each row
                System.out.print(array[i][j]+" ");                              //adds next value of array to string
            }
            System.out.println("");
        }
    }
    
    public static int[][] sort(int [][] array){                                 //sort method
        int sort;                                       
        for (int j = 0 ; j < (5) ; j++){                                        //for each row
            for (int k = 0 ; k < ((array[j].length)- 1) ; k++){                 //for each value in each row
                for (int i = 0 ; i < ((array[j].length)- 1) ; i++){             //for each value in each row
                    if(array[j][i] > array[j][i + 1] && i < ((array[j].length)- 1)){        //if next value is greater
                        sort=array[j][i];                                       //store value in sort
                        array[j][i]=array[j][i + 1];                            //move next value to current space
                        array[j][i + 1]=sort;                                   //move sort to next value's space
                    }
                }
            }
        }
        return array;                                                           //return array
    }
}
