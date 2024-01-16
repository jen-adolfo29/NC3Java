/*problem 102: write a java program to create class called "TrafficLight" 
 * with attributes for color and duration, and methods to change the 
 * color and check for red and green.*/
package Problem_102;

public class TrafficLight {
	public enum Color {
        RED, YELLOW, GREEN
    }
	private Color currentColor;
    private int duration;

    // Constructor
    public TrafficLight(Color initialColor, int initialDuration) {
        this.currentColor = initialColor;
        this.duration = initialDuration;
    }
 	// Method to change the traffic light color
    public void changeColor(Color newColor, int newDuration) {
        this.currentColor = newColor;
        this.duration = newDuration;
        System.out.println("Traffic signal switched to " + newColor + 
        		" for " + newDuration + "s.");
    }

    // Method to check if the traffic light is currently red
    public boolean isRed() {
        return currentColor == Color.RED;
    }

    // Method to check if the traffic light is currently green
    public boolean isGreen() {
        return currentColor == Color.GREEN;
    }

	public static void main(String[] args) {
		//instance
        TrafficLight trafficLight = new TrafficLight(Color.RED, 20);

        // Check the initial state
        System.out.println("Traffic light is red? " + trafficLight.isRed());
        System.out.println("Traffic light is green? " + trafficLight.isGreen());

        //change color
        trafficLight.changeColor(Color.GREEN, 15);

        // Check the new state
        System.out.println("Is the traffic light currently red? " + trafficLight.isRed());
        System.out.println("Is the traffic light currently green? " + trafficLight.isGreen());

	}

}
