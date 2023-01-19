import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FirstFile {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        try {
            FileOutputStream fout = new FileOutputStream("File1.txt");
            System.out.println("Enter a line of text:");
            String s = ob.nextLine();
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            FileInputStream fin = new FileInputStream("File1.txt");
            int ch;
            while ((ch = fin.read()) != -1) {
                char a = (char) ch;
                System.out.print(a);
            }
            fin.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
