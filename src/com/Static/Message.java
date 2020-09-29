package com.Static;

public class Message {
    Message() {
        this("Ratul");
        System.out.println("Welcome to Malaysia!");
    }
    Message(String n) {
        System.out.println(n);
    }
}

class This2 {

    public static void main(String[] args) {
        Message m = new Message();
    }
}