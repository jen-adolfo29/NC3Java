package Problem_51;

public class Circle extends Shape {
	private double radius;
    
    // Constructor
    public Circle(double radius) {
    	this.radius = radius;
    }
    //Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
    	return 2 * Math.PI * radius;
    }

}
