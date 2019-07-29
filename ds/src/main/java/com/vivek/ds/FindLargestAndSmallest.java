package com.vivek.ds;

/**
 * Created by Vivek on 7/20/2019.
 */
public class FindLargestAndSmallest {
    public static void main(String[] args) {

        int ar[]={78,8,5,9,8,55,8,1,55,5};

        //find Largest
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <ar.length ; i++) {
            if(max<ar[i])
                max=ar[i];
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <ar.length ; i++) {
            if(max>ar[i])
                min=ar[i];
        }

        System.out.println(" largest   "+max);
        System.out.println(" minimum   "+min);
    }
}
