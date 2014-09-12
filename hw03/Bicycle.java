/*  Jeffrey Stewart
    CSE 2
    HW03-Bicycle
    09/10/2014
*/

import java.util.Scanner;       //import java scanner
                                //allows users to input

//starting class for program
public class Bicycle {
    //main method
    public static void main (String[] args) {
        Scanner myScanner;      //define myScanner to use Scanner
        myScanner = new Scanner (System.in);    //allows system inputs into scanner
        
        int wheelDiameterInch = 27;
        
        System.out.print(
            "Enter the time of the trip (in seconds): "); //prompts user to time of trip in seconds
        int timeS = myScanner.nextInt();        //takes user inputs for seconds as an integer
        int timeM = timeS/60;                   //converts seconds to minutes
        int timeH = timeM/60;                   //converts minutes to hours
        System.out.print(
            "Enter the number of rotations the wheel made: "); //prompts user for number of rotations
        int rotations = myScanner.nextInt();    //takes user inputs for rotations
        
        System.out.println("");
        
        double distance= 3.14159*(wheelDiameterInch)*(rotations)/(63360);  //Circumference of wheel * rotations (gives distance in inches)
                                                                           //divide by 63360 converts inches to miles
        distance*=100;      //multiply by 100 to later have 2 decimal places
        int distancei=(int)distance;    //convert to int truncates everything past 2 decimal places
        double distanced=(double)distancei; //convert int distance to double so it can have decimal again
        distanced/=100;     //divide by 100 
        distance/=100;
        
        double avgMPH= distance/timeH;         //total distance divided by hours
        
        avgMPH*=100;        //same method as distance
        int avgMPHi=(int)avgMPH;
        double avgMPHd=(double)avgMPHi;
        avgMPHd/=100;
        avgMPH/=100;
        System.out.println("The total trip distance: "+distanced+" miles and took "+timeM+" minutes.");   //prints trip distance (miles)
        System.out.println("The average trip speed: "+avgMPHd+" miles/hour"); //prints speed miles/hour
        
        
    }
}