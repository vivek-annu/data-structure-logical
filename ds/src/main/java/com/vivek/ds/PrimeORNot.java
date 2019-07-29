package com.vivek.ds;

import java.util.Scanner;

/**
 * Created by Vivek on 7/20/2019.
 */
public class PrimeORNot {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nextInt = sc.nextInt();

            int findPrime=0;
            for (int i = 1; i <=nextInt ; i++) {
                if(nextInt%1==0){
                    findPrime++;
                }
            }
            if(findPrime==2)
                System.out.println("prime no");
           else System.out.println("not a prime");
        }
    }
}
