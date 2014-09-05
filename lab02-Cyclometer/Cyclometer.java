/*  Jeffrey Stewart
    CSE 02
    09/05/2014
    
    Bicycle Cyclometer
    Measures speed, distance, etc using the time elapsed and 
    the number or rotations the bicycle wheel makes.
*/

//Starting class for program
public class Cyclometer {
    
    //main method for class
    public static void main (String[] args) {
        
        //input variables
        int timeTrip1=480;          //gives time of trip 1 in seconds
        int timeTrip2=3220;         //gives time of trip 2 in seconds
        int rotationsTrip1=1561;    //gives rotations wheel made in trip 1
        int rotationsTrip2=9037 ;   //rotations trip 2
        
        //constants
        double wheelDiameter=27.0,  //wheel diameter is 27 inches
        PI=3.14159,                 //pi value
        feetPerMile=5280,           //conversion factor feet in a mile
        inchesPerFoot=12,           //inches per foot
        secondsPerMin=60;           //seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; 
        
        //system print commands
        System.out.println("Trip 1 took "+(timeTrip1/secondsPerMin)+
        "minutes and had "+(rotationsTrip1+" rotations."));
        System.out.println("Trip 2 took "+ (timeTrip2/secondsPerMin)+
        "minutes and had "+(rotationsTrip2+" rotations."));
        
        //calculations
        distanceTrip1=rotationsTrip1*wheelDiameter*PI;          
        //gives distance of trip1 in inches
        distanceTrip1/=(inchesPerFoot*feetPerMile); //converts distance to miles
        distanceTrip2=(rotationsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile);
        //above gives distance of Trip2 in miles
        totalDistance=(distanceTrip2+distanceTrip1);
        
        //system print commands for distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
    } //end main method
} //end class