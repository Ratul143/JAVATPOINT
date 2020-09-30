package com.Matrix;

import java.io.*;

class ZedStarPattern

{

    public static void main(String args[])throws IOException

    {

        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the dimension of the matrix:");

        int l1=Integer.parseInt(r.readLine());


        System.out.println("The z pattern output is:" );

        int k=l1-1;

        for(int i=0;i<l1;i++)

        {

            for(int j=0;j<l1;j++)

            {

                if(i==0 || i==l1-1)

                {

                    System.out.print("1");

                }

                else if(j==k)

                {

                    System.out.print("1");

                }

                else

                {

                    System.out.print(" ");

                }

            }

            k=k-1;

            System.out.println();

        }

    }

}
