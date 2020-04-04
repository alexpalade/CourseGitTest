package main;

import edu.Course;
import edu.Student;
import edu.Teacher;

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher("Grace");
        Course c = new Course("Maths", t);

        System.out.println(c.getName() + " has prof "+ c.getTeacher().getName());
        
        Student s = new Student("Popescu");
        c.addStudent(s);
        c.addStudent(new Student("Joe"));
        
        System.out.println(t);
        System.out.println(s);
        
        System.out.println("The course has " + c.getStudentCount() + " students");
        
        System.out.println(c);
    }

}
