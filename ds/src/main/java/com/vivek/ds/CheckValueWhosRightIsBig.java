package com.vivek.ds;

/**
 * Created by Vivek on 7/20/2019.
 */
public class CheckValueWhosRightIsBig {
    public static void main(String[] args) {
        int ar []={14,15,8,9,5,2};
        for (int i = 0; i <ar.length -1; i++) {

            for (int j=i; j<=i; j++){
                if (ar[j] > ar[j+ 1]) {
                    System.out.println(ar[j ]);
                }
            }
        }
        System.out.println(ar[ar.length-1]);
    }




}
