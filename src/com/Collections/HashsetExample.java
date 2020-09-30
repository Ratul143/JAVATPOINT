package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashsetExample{

    public static void main(String args[]){

        HashSet<String> set = new HashSet<String>(); // creating hashSet
        // TreeSet<String> set = new TreeSet<>(); // Data is unordered but it is alphabetically sorted

        set.add("Mehrab");                 // adding elements
        set.add("Hossain");
        set.add("Ratul");
        set.add("Kasem");
        set.add("Rahim");
        set.add("Kashim");
        set.add("Hashim");

        //1. Data is Unique, no Redundancy
        //2. Data is unordered in  output due to hashing

        System.out.println("Set is: "+set);

        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("Kasem");
        System.out.println("Set after removing Kasem is: "+set);
        if (set.contains("Ratul")){
            System.out.println("Ratul is in the set");
        }

        System.out.println("Set Size is: "+set.size());
    }
}
