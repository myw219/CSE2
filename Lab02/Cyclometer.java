// Allows us to calcualte multiple values with time and rotations
//
public class Cyclometer {
    	// main method
   	public static void main(String[] args) {
   	
   	int secsTrip1=480;  //the time it takes for trip 1
    int secsTrip2=3220;  //the time it takes for trip 2
	int countsTrip1=1561;  //the amount of rotations for trip 1
	int countsTrip2=9037; //the amount of rotations for trip 2
	double wheeldiameter= 27; //this is the diameter of the wheel
	double pi=3.141597; //yum pie...... whoops, I meant that this is the value for pi that we are using
	double feetpermile=5280; //the amount of feet per mile aka.... too many
	double inchesperfoot=12; //inches per foot
	double secondsperminute= 60; //seconds per minute
	double distancetrip1, distancetrip2, totalDistance;
	
	System.out.println("Trip 1 took "+ (secsTrip1/secondsperminute)+ "minutes and had" +countsTrip1+ "counts.");
	System.out.println("Trip 2 took "+ (secsTrip2/secondsperminute)+ "minutes and had" +countsTrip2+ "counts.");
    
    
    //runs the calcualtions
    distancetrip1=countsTrip1*wheeldiameter*pi;
    // Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distancetrip1=inchesperfoot*feetpermile; // Gives distance in miles
	distancetrip2=countsTrip2*wheeldiameter*pi/inchesperfoot/feetpermile;
	totalDistance=distancetrip1+distancetrip2;
	
	//Print out distances
           System.out.println("Trip 1 was "+distancetrip1+" miles");
	System.out.println("Trip 2 was "+distancetrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");

	}  //end of main method   
} //end of class