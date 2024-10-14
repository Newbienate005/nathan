
import java.nio.channels.DatagramChannel;

public class StudentRegMain {
    public static void main(String[] args) {
        System.out.println("\n ===========using new Course");
        StudentCourse dan = new StudentCourse("G127/001/2023","Daniel Nioki",newCourse("SCI220","Programming in Python"));//pass object new Course
        StudentCourse kip + new StudentCourse("G127/2234/2023","Kipkirui Jang", new Course("SCI303","Web Programming"));
        System.out.println("\n_____________\n");
        System.out.println(dan.printD());
        System.out.println("\n_____________\n");
        System.out.println(kip.printD());
        System.out.println("\n==============\n");
        System.out.println("====CREATE OBJECT FIRST=====");
        Course a = new Course("SCI220","Programming in Python");
        Course b = new Course("SCI 303","Web Programming");
        //System.out.println("================================");
        StudentCourse dann = new StudentCourse("G127/001/2023","Daniel Nzioki",a);//pass object new Course 
        System.out.println(DatagramChannel.printD());
    }
}
