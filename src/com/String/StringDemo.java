package com.String;

public class StringDemo {

    public static void main(String[] args) {
        String s1="MehrabRatul";
        String s2="MehrabRatus";
        StringBuffer s3=new StringBuffer("Happy Day");
        s3.append(" Sunday!!!");
        s3.insert(9, 'y');
        s3.replace(0,2, "HaP");
        s3.delete(0,1);
        StringBuilder s4 = new StringBuilder("Hello");
        s4.append(" Nipa");
        int j = 1001;
        String replace = s2.replace('s', 'L');

        System.out.println(String.valueOf(j));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(replace);
        System.out.println(replace.contains("s"));
        System.out.println(s1.equals(s2));
        System.out.println(s2.charAt(10));
        System.out.println(s1.endsWith("l"));
        System.out.println(s3);
        System.out.println(s3.reverse());
        System.out.println(s3.capacity());
        System.out.println(s1.length());
        System.out.println(s1.substring(2));
        System.out.println(s4);
        System.out.println(s4.delete(9,10));
        System.out.println(s4.insert(9, "atul"));
        System.out.println(s4.reverse());
    }
}
