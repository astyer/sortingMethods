package com.company;

public class Main {

    public static void main(String[] args) {

        int theArray[] = {4, 8, 15, 16, 23, 42};

        sort(theArray);

        for(int j = 0; j < theArray.length; j++)
        {
            System.out.print(theArray[j] + " ");
        }
    }

    public static void sort(int a[])
    {
        boolean notdone = true;
        while(notdone)
        {
            for(int i = 0; i<a.length-1; i++)
            {
                if(a[i] > a[i+1])
                {
                    int x = a[i+1];
                    a[i+1] = a[i];
                    a[i] = x;
                }
            }
        }
    }
}
