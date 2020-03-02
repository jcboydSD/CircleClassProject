package circleclassproject;

/******************************************************************************
 * CircleClassProject.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program calculates the diameter, circumference, and area of a circle
 * based on user input of the radius
 *****************************************************************************/

public class CircleClassProject {

    public static void main(String[] args) {
        double radius;
        
        System.out.println("Ch 6 Example - Circle - by JC Boyd\n");
        Circle spot;
        spot = new Circle();
        
        System.out.println("Original circle");
        spot.initialize(); //ask user to input radius
        spot.printCircleData(); //output calculated results
        
        System.out.println("\nChanged circle");
        spot.setRadius(5); //set raduis to 5
        spot.printCircleData(); //output calculated results
        
    } //end main
    
} //end class CircleClassProject
