package com.Array;

public class Demo_2 {

    public static void main(String[] args) {
        // Creating array of characters
        char[] source = {'M', 'Y', 'N', 'A', 'M', 'E',
                'I', 'S', 'R', 'A', 'T', 'U', 'L'};
        char[] destination = new char[7];

        // Copying elements from one array to another
        System.arraycopy(source,0,destination,1,6);
        System.out.println(new String(destination));

        // Deleting element from array
        int flag = 3; // element to be deleted
        for (int i =0; i < source.length; i++) {
            // Deleting Function
            if (flag == i) {
                for (int j = i + 1; i < source.length - 1; j++) {
                    source[i] = source[j];
                    i++;
                }
                System.out.println(source);
            }
        }
    }
}
