package com.Matrix;

// Java program to print a 
// square matrix in Z form 

import java.lang.*;
import java.io.*;

class ZedMatrix {
    public static void Zed(int arr[][], int n)
    {
        int i = 0, j, k;

        // print first row 
        for (j = 0; j < n - 1; j++) {
            System.out.print(arr[i][j] + " ");
        }
        // print diagonal
        k = 1;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n; j++) {
                if (j == n - k) {
                    System.out.print(arr[i][j] + " ");
                    break;
                }
            }
            k++;
        }
        // print last row
        i = n - 1;
        for (j = 0; j < n; j++)
            System.out.print(arr[i][j] + " ");

        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        int a[][] = {   { 4, 5, 6, 8, 6 },
                        { 1, 2, 3, 1, 1 },
                        { 7, 8, 9, 4, 2 },
                        { 1, 8, 7, 5, 7 },
                        { 1, 8, 7, 5, 7 }
                    };
        int b[][] = {   { 4, 5, 6, 8, 6 },
                        { 1, 2, 3, 1, 1 },
                        { 7, 8, 9, 4, 2 },
                        { 1, 8, 7, 5, 7 },
                        { 1, 8, 7, 5, 7 }
                    };

        Zed(a, 5);
        Zed(b, 5);

        System.out.print("\n");

        System.out.println( "The sum of the Z Square is = " );
    }
}
