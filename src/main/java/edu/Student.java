package edu;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Hello, I'm " + this.name + " and I'm a student.");
    }
    
    @Override
    public String toString() {
        return this.name + " (student)";
    }    
    
}
