
/**
 * File Handling by using Character Stream
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThirdFile {
    public static void main(String[] args) {
        try {
            // To write in file "File2.txt"
            FileWriter fw = new FileWriter("File3.txt");
            String s = "This is an example of Character Stream.";
            fw.write(s);
            fw.close(); // fw closed
            // To read from file "File1.txt"
            FileReader fr = new FileReader("File3.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close(); // fr closed
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("The file has been saved successfull.");
        }
    }

}
