/*problem 46: write a java program to create a class called Shape 
with a method  called getArea(). Create a subclass called Rectangle 
that overrides the getArea() method to  calculate the area of a rectangle?*/

package Problem_46;

public class Main {

	public static void main(String[] args) {
		// instance
		Rectangle r = new Rectangle(29.25, 52.92);
		
		//call getArea() method
		double area = r.getArea();
		
		// Print area
        System.out.println("Area of the rectangle: " + area);

	}

}