import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q15 {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String dataToWrite = "this is a java program";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(dataToWrite.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(fileName)) {
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i = fis.read()) != -1) {
                sb.append((char) i);
            }
            String dataRead = sb.toString();
            System.out.println("Data read from file: " + dataRead);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
