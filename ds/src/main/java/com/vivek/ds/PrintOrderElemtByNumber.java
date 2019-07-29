package com.vivek.ds;

/**
 * Created by Vivek on 7/20/2019.
 */
public class PrintOrderElemtByNumber {
    public static void main(String[] args) {

        int temp=0;
        for (int i = 1; i < 5; i++) {


            for (int j = 1; j <= i; j++) {
                temp++;
                System.out.print(temp+"   ");
            }
            System.out.println();


        }

    }
}
