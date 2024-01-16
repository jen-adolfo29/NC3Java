/*problem 51: write a java program to create a class called Shape
 *  with methods called getPerimeter() and getArea(). 
 *  create a subclass Circle that overrides the 
 *  getPerimeter() and getArea() methods to calculate the area and 
 *  perimeter of a circle*/

package Problem_51;

public class Main {

	public static void main(String[] args) {
		//instance
		Circle c = new Circle(2.10);
		
		//call getPerimeter & getArea()
		double perimeter = c.getPerimeter();
        double area = c.getArea();
        
        //print perimeter & area
        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);

	}

}
