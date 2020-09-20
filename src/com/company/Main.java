package com.company;

public class Main {

    public void nonStaticTest() {
        System.out.println("Non Static Method");
    }

    public static void staticTest() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Main mainObject = new Main();
	    System.out.println("My Name is Mehrab :)");
	    mainObject.nonStaticTest();
	    staticTest();
    }
}
