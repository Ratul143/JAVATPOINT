package com.Matrix;

public class drawZ {
    public static void main(String[] args) {
        String a[][] = {
                {"1","2","3","4","5"},
                {"3","7","5","8","2"},
                {"6","7","8","9", "4"},
                {"4","5","7","6","1"},
                {"7","9","5","1","3"}
        };
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==0||i==a.length-1)
                {
                    System.out.print(a[i][j]);
                }
                else if(i+j==a.length-1)
                {
                    System.out.print(a[i][j-1]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}