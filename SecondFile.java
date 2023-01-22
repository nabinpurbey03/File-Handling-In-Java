
/**
 * File Handling by using Data Stream
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecondFile {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            try {
                // To write in file "File2.txt"
                FileOutputStream fout = new FileOutputStream("File2.txt");
                DataOutputStream dout = new DataOutputStream(fout);
                System.out.println("Enter ID:");
                int id = ob.nextInt();
                System.out.println("Enter name:");
                ob.nextLine();// To clear the buffer
                String name = ob.nextLine();
                System.out.println("Enter email");
                String email = ob.nextLine();
                dout.writeInt(id);
                dout.writeUTF(name);
                dout.writeUTF(email);
                dout.close();
                fout.close();
                // To read from file "File1.txt"
                FileInputStream fin = new FileInputStream("File2.txt");
                DataInputStream din = new DataInputStream(fin);
                System.out.println("Infromations available in file are:");
                System.out.println(din.readInt());
                System.out.println(din.readUTF());
                System.out.println(din.readUTF());
                fin.close();
                din.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}