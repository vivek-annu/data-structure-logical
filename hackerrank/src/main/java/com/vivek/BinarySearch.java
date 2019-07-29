package com.vivek;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Vivek on 7/28/2019.
 */
public class BinarySearch {


    public static void main(String[] args) {
        int ar[] = {1, 2, 4, 5, 6, 8, 12, 13, 33, 52, 54, 345};
        System.out.println(Arrays.toString(ar));
        int findData = 8;

        System.out.println(Arrays.toString(ar));
        System.out.println("index   " + findElement(ar, findData, 0, ar.length - 1));
        System.out.println(Arrays.toString(ar));

    }

    private static int findElement(int[] ar, int findData, int min, int max) {
        int index = 0;
        if (min < max) {
            int middleIndex = (min + max) / 2;

            if (ar[middleIndex] == findData) {
                return index = middleIndex;
            }
            if (ar[middleIndex] > findData) {
                findElement(ar, findData, min, middleIndex);
            } else if (ar[middleIndex] < findData) {
                findElement(ar, findData, middleIndex + 1, max);

            } else {
                index = -1;
            }


        }
        return index;

    }

}
