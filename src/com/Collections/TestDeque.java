package com.Collections;

import java.util.*;
public class TestDeque{
    public static void main(String[] args) {
//Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Sumon");
        deque.add("Izad");
        deque.add("Nahid");
//Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
