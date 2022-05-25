package com.azad;

import java.util.Arrays;
import java.util.Random;


public class MergeSOrt {



     public static void print(String str){


         System.out.println(str);


     }
    public static void main(String[]args)
    {

        Random rand =new Random();
        int [] numbers =new int[10];

        for (int i=0;i<numbers.length;i++)
        {
            numbers[i] = rand.nextInt();
        }



        Mergesort(numbers,0,numbers.length-1);

        print(Arrays.toString(numbers));




    }

    private static void Mergesort(int[] numbers, int si, int ei ) {


         if (si<ei)
         {
             int mid = si +(ei-si)/2;
             Mergesort(numbers,si,mid);
             Mergesort(numbers,mid+1,ei);
             Merge(numbers,si,mid,ei);




         }


    }

    private static void Merge(int[] numbers, int si, int mid, int ei) {

         int[] merge =new int[ei -si +1];

         int idx1 = si;
         int idx2 = mid+1;
         int k=0;

         while (idx1 <= mid && idx2 <= ei)
         {
             if (numbers[idx1]<=numbers[idx2]){


                 merge[k++] =numbers[idx1++];


             }else

             {

                 merge[k++] = numbers[idx2++];


             }





         }
        while (idx1<=mid)
        {
            merge[k++] = numbers[idx1++];

        }

        while (idx2<=ei)
        {
            merge[k++]=numbers[idx2++];

        }


        for(int i=0;i<merge.length;i++)
        {
            numbers[si+i]=merge[i];


        }




    }
}
