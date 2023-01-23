import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem {
    public static void main(String[] args) {
        String s = "This file will demostrate how to cope data from one file and paste to another file.";
        byte[] b = s.getBytes();
        try {
            FileOutputStream fout = new FileOutputStream("main_file.txt");
            fout.write(b);
            fout.close();

            FileInputStream fin = new FileInputStream("main_file.txt");
            FileOutputStream fout2 = new FileOutputStream("copied_file.txt");
            int ch;
            while ((ch = fin.read()) != -1) {
                fout2.write(ch);
            }
            FileInputStream fin2 = new FileInputStream("copied_file.txt");
            int ch2;
            while ((ch2 = fin2.read()) != -1) {
                System.out.print((char) ch2);
            }
            fin.close();
            fout2.close();
            fin2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}