package com.company;

public class Main {

    public static void main(String[] args) {

        int theArray[] = {15, 42, 4, 16, 8, 23};
        int mergear [] = new int[theArray.length];
        Msort(theArray, 0, theArray.length-1, mergear);

        for(int j = 0; j < theArray.length; j++)
        {
            System.out.print(theArray[j] + " ");
        }
    }

    public static void Bsort(int a[])
    {
        while(true)
        {
            boolean switched = false;
            for(int i = 0; i<a.length-1; i++)
            {
                if(a[i] > a[i+1])
                {
                    int x = a[i+1];
                    a[i+1] = a[i];
                    a[i] = x;
                    switched = true;
                }
            }
            if(!switched)
            {
                break;
            }
        }
    }

    public static void Ssort(int a[])
    {
        for(int i = 0; i < a.length-1; i++)
        {
            int min = a[i+1]+1;
            int pos = 0;
            for(int x = i; x<a.length; x++)
            {
                if(a[x] < min)
                {
                    pos = x;
                    min = a[x];
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
    }

    public static void Qsort(int ar [], int low, int high)
    {
        int pivot = ar[(low + high)/2];
        int l = low;
        int h = high;
        while(l <= h)
        {
            while(ar[l] < pivot)
            {
                l++;
            }
            while(ar[h] > pivot)
            {
                h--;
            }
            if(l <= h)
            {
                int x = ar[l];
                ar[l] = ar[h];
                ar[h] = x;
                l++;
                h--;
            }
        }
        if(low < h)
        {
            Qsort(ar, low, h);
        }
        if(l < high)
        {
            Qsort(ar, l, high);
        }
    }

    public static void Msort (int a[], int low, int high, int [] mer)
    {
        if (low < high)
        {
            int middle = (high + low) / 2;
            Msort(a, low, middle, mer);
            Msort(a, middle + 1, high, mer);
            merge(a, low, middle, high, mer);
        }
    }
    public static void merge(int ar [], int low, int middle, int high, int m [])
    {
        for(int i = low; i <= high; i++)
        {
            m[i] = ar[i];
        }
        int l = low;
        int j = middle + 1;
        int k = low;
        while (l <= middle && j <= high)
        {
            if (m[l] <= m[j])
            {
                ar[k] = m[l];
                l++;
            }
            else
            {
                ar[k] = m[j];
                j++;
            }
            k++;
        }
        while (l <= middle)
        {
            ar[k] = m[l];
            k++;
            l++;
        }
    }
}
