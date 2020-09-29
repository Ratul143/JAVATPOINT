package com.Collections;

import java.util.*;
public class Linkedlist{
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();// creating linked list
        al.add("Rahim"); // adding elements
        al.add("Rahul");
        al.add("Ashiq");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
