import java.util.Scanner;
public class Problem_27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        // Declare an array to store five numbers
        int[] numbers = new int[5];

        // Prompt the user to enter five numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            numbers[i] = s.nextInt();
        }

        // Calculate the sum
        int sum = 0;
        for (int num : numbers) {
            sum += num; // increment value of sum
        }

        // Calculate the average
        double average = (double) sum / 5;
        // numbers.length
        // Display the total sum and average
        System.out.println();
        System.out.println("Total sum is : " + sum);
        System.out.println("Average is   : " + average);

	}

}