
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

    /**
     * The constructor "Student" initializes the instance variables of class
     * "Student"
     * 
     * @param id      Takes the integer input as an ID of a student
     * @param name    Takes a string input as name of a student
     * @param faculty Takes a string input as faculty of a student
     */
    Student(int id, String name, String faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    /**
     * The method "showInfo" gives the output of the details passed in constructor's
     * parameters
     */
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
            fout.close(); // fout closed
            oos.close(); // oos closed
            // Deserialization
            FileInputStream fin = new FileInputStream("File4.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Student s1 = (Student) ois.readObject();
            s1.showInfo(); // callin the method
            fin.close(); // fin closed
            ois.close(); // ois closed
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("The file has run successfully.");
        }
    }
}
