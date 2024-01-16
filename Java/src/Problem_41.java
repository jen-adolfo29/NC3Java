import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem_41 {

	public static void main(String[] args) {
		
		try {
            checkForEmptyFile("numbers.txt");
            System.out.println("File is not empty.");
        } catch (EmptyFileException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public static void checkForEmptyFile(String filename) throws IOException, EmptyFileException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        // Attempt to read the first character
        int firstChar = reader.read();

        reader.close();

        if (firstChar == -1) {
            throw new EmptyFileException("File is empty: " + filename);
        }
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
	}

}