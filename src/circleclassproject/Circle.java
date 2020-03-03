package circleclassproject;

import java.util.Scanner;

public class Circle 
{
    Scanner stdIn = new Scanner(System.in);
    private double radius;
    
    public void setRadius(double newRadius)
    {
        this.radius = newRadius;
    } //end setRadius

    public void initialize()
    {
        System.out.print("Please enter the radius: ");
        this.radius = stdIn.nextDouble();
    } //end initialize
    
    public void printCircleData()
    {
        double diameter;
        double circumference;
        double area;
        diameter = this.radius * 2;
        circumference = Math.PI * diameter;
        area = Math.PI * (this.radius * this.radius);
        System.out.printf("Radius: %-8.3f\n", this.radius);
        System.out.printf("Diameter: %-8.3f\n", diameter);
        System.out.printf("Circumference: %-8.3f\n", circumference);
        System.out.printf("Area: %-8.3f\n", area);
    } //end printCircleData
 
} //end class Circle
