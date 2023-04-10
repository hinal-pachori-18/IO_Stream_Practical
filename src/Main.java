import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            //Write text into file using file output stream
            FileOutputStream fileOutput = new FileOutputStream("file1.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Write data into text file ");
            System.out.println("Enter the String");
            String s = sc.next();
            byte[] output = s.getBytes();
            fileOutput.write(output);
            //Read text file using file-input stream

            FileInputStream fileInput = new FileInputStream("file1.txt");
            int i = 0;
            System.out.println("\nRead data from text file :");
            while ((i = fileInput.read()) != -1) {
                System.out.print((char) i);
            }
            fileInput.close();
            fileOutput.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

