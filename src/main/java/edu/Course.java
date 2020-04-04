package edu;

import java.util.ArrayList;
import java.util.List;

public class Course {
    
    private String name;
    private final List<Student> students;
    private final Teacher teacher;
    
    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student s) {
        this.students.add(s);
    }
    
    public List<Student> getStudents() {
        return this.students;
    }
    
    public int getStudentCount() {
        return this.students.size();
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return "Not implemented yet.";
    }
}
