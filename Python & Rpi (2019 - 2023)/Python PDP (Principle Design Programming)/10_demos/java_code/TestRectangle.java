/** 
Example of a Java Program 
auth: srattigan
date: 13 Dec 2020
**/

class Rectangle{
    // define two fields
    private double length, width;
    // define no arg constructor
    Rectangle()
    {
        this.length = 1;
        this.width = 1;
    }
    // define param constructor (takes args)
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width  = width;
    }
    // define a method to return area
    double getArea()
    {
        return (this.length * this.width);
    }
    // define a method to return perimeter
    double getPerimeter()
    {
        return (2 * (this.length + this.width));
    }
}
public class TestRectangle {

    public static void main(String[] args) {
        
        // create first object
        //and initialize with no arg constructor
        Rectangle rect1 = new Rectangle();
        
        // create second object
        //and initialize with param constructor
        Rectangle rect2= new Rectangle(15.0,8.0);
        
        System.out.println("Area of first object="+rect1.getArea());
        System.out.println("Perimeter of first object="+rect1.getPerimeter());
        System.out.println("Area of second object="+rect2.getArea());
        System.out.println("Perimeter of second object="+rect2.getPerimeter());
   }
    
}