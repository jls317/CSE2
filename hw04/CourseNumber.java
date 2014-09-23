/*  Jeffrey Stewart
    CSE 02
    HW04-CourseNumber
    09/22/2014
    
    Purpose: To describe when the course was offered given a 6 
    digit course ID number. Will provide the year and semester
    that the course ran. 
*/

import java.util.Scanner;       //imports scanner tool to take input from user

public class CourseNumber {        //starting class for program
    public static void main (String [] args) {  //main method for program
        Scanner myScanner;
        myScanner = new Scanner (System.in);    //allows system to add inputs
        System.out.print("Enter 6 digit course ID number: "); //prompts user for course number
        double courseID = myScanner.nextDouble();               //assigns courseID from input
        if (courseID==(int) courseID && courseID>=186510 && courseID<=201440){  //if courseID is an integer and between values
          double courseYear= courseID/100;                                      //divide courseID by 100 to get year
          int courseYeari= (int)courseYear;                                     //only take whole numbers (extract year)
          int courseYear100=courseYeari*100;                                    //multiply by 100 to help find semester
          double courseSemester= courseID-courseYear100;                        //separate semester digits by subtraction
          int courseSemesteri= (int)courseSemester;                             //convert semester to integer
          
          if (courseSemesteri==10) {                                            //if course semester is 10
              System.out.println("The course was offered in Spring Semester of "+courseYeari+"");   //Spring Semester of given year
          }
          if (courseSemesteri==20) {                                            //if course semester is 20
              System.out.println("The course was offered in Summer 1 Semester of "+courseYeari+""); //Summer 1 Semester of given year
          }
          if (courseSemesteri==30) {                                            //if course semester is 30
              System.out.println("The course was offered in Summer 2 Semester of "+courseYeari+""); //Summer 2 Semester of given year
          }
          if (courseSemesteri==40) {                                            //if course semester is 40
              System.out.println("The course was offered in Fall Semester of "+courseYeari+""); //Fall Semester of given year
          }
          if (courseSemesteri!=10 && courseSemesteri!=20 && courseSemesteri!=30 && courseSemesteri!=40) {   //if semester is not 10,20,30,40
              System.out.println(""+courseSemesteri+" is not a legitimate semester");   //invalid semester
              return;                                                           //terminate program
          }
        }
        else {
            System.out.println("Please enter an integer between 186510 and 201440.");   //error, input out of range or not an integer
            return;                                                             //terminates program
        }
    }                                                                           //end main method
}                                                                               //end class