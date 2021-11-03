import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Greetings.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}