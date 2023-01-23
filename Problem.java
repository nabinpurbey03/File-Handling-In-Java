import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem {
    public static void main(String[] args) {
        String s = "This file will demostrate how to cope data from one file and paste to another file.";
        byte[] b = s.getBytes();
        try {
            // Creating an initial file
            FileOutputStream fout = new FileOutputStream("main_file.txt");
            fout.write(b);// Written in file
            fout.close(); // Closed fout
            // Creatin a file to read from the file
            FileInputStream fin = new FileInputStream("main_file.txt");
            // Creating a file to copy data from the initial file
            FileOutputStream fout2 = new FileOutputStream("copied_file.txt");
            int ch;
            // Writing in second file
            while ((ch = fin.read()) != -1) {
                fout2.write(ch);
            }
            fin.close();// fin closed
            // Creatin a file to read from second the file
            FileInputStream fin2 = new FileInputStream("copied_file.txt");
            int ch2;
            // Reading from second file
            while ((ch2 = fin2.read()) != -1) {
                System.out.print((char) ch2);
            }
            fout2.close();// fout2 closed
            fin2.close();// fin2 closed
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("\nThe file has ran successfully.");
        }
    }
}