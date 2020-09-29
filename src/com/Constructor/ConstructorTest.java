package com.Constructor;

public class ConstructorTest {
    public String sName;
    public int sMarks;

        // Default Constructor of the class
    public ConstructorTest() {
        // this will call the instructor with string param
        this("Mehrab");
    }
    public ConstructorTest(String name) {
        // call the constructor with (String, int) param
        this(name, 85);
    }
    public ConstructorTest(String name, int mark){
        this.sName=name;
        this.sMarks=mark;
    }
    void display() {
        System.out.println("Student Name: "+sName);
        System.out.println("Student Marks: "+sMarks);
    }
    public static void main(String[] args) {
        ConstructorTest s = new ConstructorTest();
        s.display();
    }
}
