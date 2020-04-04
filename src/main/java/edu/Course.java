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
        
        StringBuilder result = new StringBuilder();
        
        result.append("------------------------------------------------------------------------\n");
        result.append("This course is called \"" + this.name + "\" and is taught by \"" + this.teacher.getName() + "\".\n");
        if (getStudentCount() == 0) {
            result.append("It has no students.\n");
        } else {
            result.append("It has these " + getStudentCount() + " students:\n");
            for (Student s : students) {
                result.append("  - " + s.getName() + "\n");
            }
        }
        
        return result.toString();
    }
}
