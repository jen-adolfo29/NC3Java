import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem_40 {
	public static void main(String[] args) {
		try {
            checkForPositiveNumbers("numbers.txt");
            System.out.println("No positive numbers found.");
        } catch (PositiveNumberException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public static void checkForPositiveNumbers(String filename) 
    		throws IOException, PositiveNumberException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int lineNumber = 0;

        while ((line = reader.readLine()) != null) {
            lineNumber++;
            int number = Integer.parseInt(line);

            if (number > 0) {
                throw new PositiveNumberException
                ("Positive number found at line " + lineNumber + ": " + number);
            }
        }

        reader.close();
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
	}
}