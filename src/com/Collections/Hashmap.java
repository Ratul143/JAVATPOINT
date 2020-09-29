package com.Collections;


// Java program to illustrate

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        print(map);
        map.put("abc", 10);
        map.put("mno", 26);
        map.put("xyz", 45);

        System.out.println("Size of map is " + map.size());

        print(map);
        if (map.containsKey("mno"))
        {
            Integer m = map.get("mno");
            System.out.println("Value for key \"mno\" is:-" + m);
        }

        map.clear();
        print(map);
    }

    public static void print(HashMap<String, Integer> map)
    {
        if (map.isEmpty())
        {
            System.out.println("map is empty");
        }
        else
        {
            System.out.println(map);
        }
    }
}
