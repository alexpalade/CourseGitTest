package edu;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Hello, I'm " + this.name + " and I'm a teacher.");
    }

    @Override
    public String toString() {
        return this.name + " (teacher)";
    }    
}
