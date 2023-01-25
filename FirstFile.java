
/**
 * File Handling by using Byte Stream
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FirstFile {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            try {
                // To write in file "File1.txt"
                FileOutputStream fout = new FileOutputStream("File1.txt");
                System.out.println("Enter a line of text:");
                String s = ob.nextLine();
                byte[] b = s.getBytes();
                fout.write(b);
                fout.close();
                // To read from file "File1.txt"
                FileInputStream fin = new FileInputStream("File1.txt");
                int ch;
                while ((ch = fin.read()) != -1) {
                    char a = (char) ch;
                    System.out.print(a);
                }
                fin.close();// fin closed
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                System.out.println("The file has been saved successfull.");
            }
        }
    }
}
