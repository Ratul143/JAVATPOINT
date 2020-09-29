package com.Collections;

import java.util.*;
class ArrayListExample{
    public static void main(String args[]){

        ArrayList al=new ArrayList();  // creating array list
        al.add("Mehrab");                // adding elements
        al.add("Hossain");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
