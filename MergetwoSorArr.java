package com.azad;

public class MergetwoSorArr {

    public static void main(String[]args)
    {
           int [] first ={10,20,35};
           int [] second ={5,50,100};

           merge(first,second);

    }

    private static void merge(int[] first, int[] second) {

          int size = first.length + second.length;
          int [] merge =new int[size];
          int i =0;
          int j=0;
          int k=0;

          while (i< first.length && j<second.length)
          {

              if (first[i]< second[j])
              {
                  merge[k] =first[i];
                  i++;
              }else
              {
                  merge[k] =second[j];
                  j++;

              }

              k++;

          }

          //for remaining element to copy to merge arrray


        while (i< first.length)
        {
            merge[k]=first[i];
            i++;
            k++;
        }

        while (j<second.length)
        {

            merge[k] =second[j];
            j++;
            k++;

        }


        for (int m=0;m< merge.length;m++)
        {
            System.out.print( " " +merge[m]);
        }

    }
}
