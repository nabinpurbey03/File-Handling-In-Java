
/**
 * File Handling by using Serialization and Deserialization
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private int id;
    private String name, faculty;

    Student(int id, String name, String faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public void showInfo() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Faculty = " + faculty);
    }
}

public class FourthFile {
    public static void main(String[] args) throws ClassNotFoundException {
        Student s = new Student(125, "Alexander", " Computer Science");
        try {
            // Serialization
            FileOutputStream fout = new FileOutputStream("File4.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(s);
            fout.close();
            oos.close();
            // Deserialization
            FileInputStream fin = new FileInputStream("File4.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Student s1 = (Student) ois.readObject();
            s1.showInfo();
            fin.close();
            ois.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("The file has ran successfully.");
        }
    }
}
