package com.azad;

public class IntersectionTwoSortedArray {



    public static void print(int num)
    {
        System.out.print(" "+num);

    }
    public static void main(String[]args)
    {

        int [] first = {2,20,20,40,60};
        int [] second = {10,20,20,20};

        intersection(first,second);



    }

    private static void intersection(int[] first, int[] second) {

        int i=0;
        int j=0;

        while (i<first.length && j<second.length)
        {


            if (i>0 && first[i]==first[i-1]){


                i++;
                continue;



            }
            if (j>0 && second[j]==second[j-1]){


                j++;
                continue;



            }


            if (first[i]<second[j])
            {
                print(first[i]);
                i++;
            }else
            if (first[i]>second[j])
            {

                print(second[j]);
                j++;
            }else


            if (first[i]==second[j])
            {
                print(first[i]);
                i++;
                j++;
            }





        }


         while (i<first.length)
         {
             print(first[i]);
             i++;
         }

         while (j<second.length)
         {
             print(second[j]);
             j++;
         }







    }
}
