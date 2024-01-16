// GROUP 5 - Jennelyn, Hannah, Law, Daniel & Menjie
import java.util.Scanner;
public class ProblemNineteen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number (N): ");
        int N = s.nextInt();

        int sum = 0, a = 1;

        while (a <= N) {
            sum += a;
            a++;
        }
        // for example: N = 3, sum = (1+2+3 = 6)
        System.out.println("Sum : " + sum);
	}
}