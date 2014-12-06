/*  Jeffrey Stewart
    CSE 02
    12/05/14
    hw11
    
    Purpose:
    
*/
import java.util.Scanner;

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
   show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    mat3d[2]=sort(mat3d[2]);
    show(mat3d);
   }


   public static int[][][] buildMat3d(){
        int array3d[][][]=new int [3][][];
        for(int i = 0 ; i < 3 ; i++){
            array3d[i]= new int [i*2 + 3][];
            for (int j = 0 ; j < 3 + 2*i ; j++){
                array3d[i][j]= new int [i+j + 1];
                for(int k = 0 ; k < i + j + 1 ; k++){
                    array3d[i][j][k] = (int) (Math.random()*100) ;
                }
            }
        }
        return array3d;
    }
   
    public static void show(int[][][] array3d){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("--------------------Slab "+(i+ 1));
            for (int j = 0 ; j < 3 + 2*i ; j++){
                for(int k = 0 ; k< i + j + 1 ; k++){
                    System.out.print(array3d[i][j][k]+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("--------------------");
    }
    
    public static int findMin(int[][][] array3d){
        int min = array3d[0][0][0];
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 + 2*i ; j++){
                for(int k = 0 ; k< i + j + 1 ; k++){
                    if(array3d[i][j][k] < min){
                        min = array3d[i][j][k];
                    }
                }
            }
        }
        return min;
    }
   public static int[][] sort(int[][] array2d){
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
       return array2d;
   } 
    
}