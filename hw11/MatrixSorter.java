/*  Jeffrey Stewart
    CSE 02
    12/05/14
    hw11
    
    Purpose:
    
*/
import java.util.Scanner;

public class MatrixSorter{                                  
  public static void main(String arg[]){                                    //main method
    int mat3d[][][];                                                
    mat3d=buildMat3d();                                                     //call buildMat3d
   show(mat3d);                                                             //call show
    System.out.println("The smallest entry in the 3D matrix is "+           
  			findMin(mat3d));                                                //call findMin
    System.out.println("After sorting the 3rd matrix we get");
    mat3d[2]=sort(mat3d[2]);                                                //sort slab3 of array
    show(mat3d);                                                            //call show
   }


   public static int[][][] buildMat3d(){                                    //buildMat3d method
        int array3d[][][]=new int [3][][];                                  //initialize
        for(int i = 0 ; i < 3 ; i++){                                       //for each i until 2
            array3d[i]= new int [i*2 + 3][];                                //initialize space
            for (int j = 0 ; j < 3 + 2*i ; j++){
                array3d[i][j]= new int [i+j + 1];                           //initialize space again (3rd dimension)
                for(int k = 0 ; k < i + j + 1 ; k++){
                    array3d[i][j][k] = (int) (Math.random()*100) ;          //assign random number to each space
                }
            }
        }
        return array3d;
    }
   
    public static void show(int[][][] array3d){                             //show
        for(int i = 0 ; i < 3 ; i++){                                       //for each slab, row, column
            System.out.println("--------------------Slab "+(i+ 1));
            for (int j = 0 ; j < array3d[i].length ; j++){
                for(int k = 0 ; k< array3d[i][j].length ; k++){
                    System.out.print(array3d[i][j][k]+" ");                 //print value
                }
                System.out.println("");
            }
        }
        System.out.println("--------------------");
    }
    
    public static int findMin(int[][][] array3d){                           //find min of whole array
        int min = array3d[0][0][0];                                         //initialize min
        for(int i = 0 ; i < 3 ; i++){                                       //for each and every value
            for (int j = 0 ; j < 3 + 2*i ; j++){
                for(int k = 0 ; k< i + j + 1 ; k++){
                    if(array3d[i][j][k] < min){                             //if value less than min
                        min = array3d[i][j][k];                                 //redefine min with that value
                    }
                }
            }
        }
        return min;                                     
    }
   public static int[][] sort(int[][] array2d){                             //sort 2d array
       for(int i = 0; i<array2d.length ; i++){                                  //for each row
            int min = array2d[i][0];
            int position = 0;
            for(int j=0 ; j < array2d[i].length ; j++){                          //for each number in the row
                min = array2d[i][j];
               for(int k =j+ 1; k<array2d[i].length ; k++){                   
                  if(array2d[i][k] < array2d[i][j]){
                      min = array2d[i][k];
                      position = k;
                  } 
               }
               array2d[i][position]=array2d[i][j];
               array2d[i][j]=min;
           }
       }
       int w = 0;
       for(int i =0 ; i<array2d.length ;i ++){                              //for each row
           for (int j=0 ; j<array2d.length ; j++){                          //for each row using first value
               if(array2d[j][w] > array2d[i][w]){                           //if value is larger
                   int[] value = array2d[j];                               //define value (placeholder)
                   array2d[j]= array2d[i];                            //move larger value down
                   array2d[i]= value;                                    //put smaller value in higher row
               }
           }
       }
       
       return array2d;
   } 
    
}