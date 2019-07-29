package com.vivek.ds;

import java.util.Arrays;

/**
 * Created by Vivek on 7/20/2019.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int ar[]={23,39,2,1,5,6,3,8};
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void bubbleSort(int[] ar) {

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 1; j <ar.length ; j++) {

                if(ar[j-1]>ar[j]){
                    int temp =ar[j-1];
                    ar[j-1]=ar[j];
                    ar[j]=temp;
                }

            }
        }



    }
}
