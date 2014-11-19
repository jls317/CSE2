import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){                                     //main method
    Scanner scan=new Scanner(System.in);                                      //initialize Scanner
    int num[]=new int[10];                                                    //initialize array
    String answer="";                                                         //initialize answer String
    do{                                                                       //start do-while
      System.out.print("Enter 10 ints- ");                                    //prompts user for 10 ints
      for(int j=0;j<10;j++){                                                  //for 10 times
        num[j]=scan.nextInt();                                                //accept input from user
      }                       
      String out="The array ";                                                //out String declared
      out+=listArray(num); //return a string of the form "{2, 3, -9}"         
      if(hasDups(num)){                                                       //call hasDups
        out+="has ";                                                          //adds has to out string
      } 
      else{                                                                   //adds does not have to out string
        out+="does not have ";
      }
      out+="duplicates.";                                                     //adds duplicate to out string
      System.out.println(out);                                                //print
      out="The array ";                                                       //resets out to The array
      out+=listArray(num);                                                    //calls listArray
      if(exactlyOneDup(num)){                                                 //calls exactlyOneDup
        out+="has ";                                                          //adds has to out
      }
      else{
        out+="does not have ";                                                //adds does not have to out
      }
      out+="exactly one duplicate.";                                          //adds exactly one duplicate to out
      System.out.println(out);                                                //print out
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");      //prompt user for input to go again
      answer=scan.next();                                                     //takes input
    }while(answer.equals("Y") || answer.equals("y"));                         //checks input to y/Y
  }

  public static String listArray(int num[]){                                  //listArray method
    String out="{";                                                           //initialize out string
    for(int j=0;j<num.length;j++){                                            //for each number in array (depends on length)
      if(j>0){                                                                //if j greater than 0
        out+=", ";                                                            //adds , to out
      }
      out+=num[j];                                                            //adds number at j to out
    }
    out+="} ";                                                                //adds } to add
    return out;                                                               //return out
  }
  public static boolean hasDups(int num[]){                                   //hasDups method
      for (int i = (num.length)- 1 ; i >=0 ; i--){                            //for each number in array
          for (int j = (num.length) - 1 ; j>=0; j--){                         //for each number in array (again)
              if(i != j){                                                     //checks for different locations
                  if(num[i] == num[j]){                                       //if numbers match then return true else return false
                      return true;
                  }
              }
          }
      }
      return false;
  }
  public static boolean exactlyOneDup(int num[]){                             //exactlyOneDuplcate
      int n=0;
      for (int i = (num.length) - 1 ; i >=0 ; i--){
          for (int j = (num.length) - 1 ; j>=0; j--){
              if(i != j){
                  if(num[i] == num[j]){
                      n++;
                  }
              }
          }
      }
      n/=2;
      if (n==1){
          return true;
      }
      else{return false;}
  }
}
