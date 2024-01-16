// GROUP 5 - JENNELYN, LAW, MENJIE, HANNAH AND DANIEL

import java.util.Scanner;
public class ProblemNumberTwo {

	public static void main(String[] args) {
		int radius;
	    double area;
	    double pi = 3.1416;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the radius of the circle : ");
	    
	    radius = sc.nextInt();
	    area = (radius*radius)*(pi);
	    System.out.println("Area of the circle is : " + area);

	}

}
