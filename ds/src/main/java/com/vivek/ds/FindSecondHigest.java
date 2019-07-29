package com.vivek.ds;

import java.util.Arrays;

/**
 * Created by Vivek on 7/20/2019.
 */
public class FindSecondHigest {
    public static void main(String[] args) {
        int ar[]={23,32,5,4,5,2,45,59};
        Arrays.sort(ar);
        System.out.println(ar[ar.length-2]);
    }

}
