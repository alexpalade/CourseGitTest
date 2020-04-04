package edu;

abstract class Person {
    protected String name;
    
    Person(String name) {
        this.name = name;
    };
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
           return this.name;
    }
    
    public abstract void greet();    
}
