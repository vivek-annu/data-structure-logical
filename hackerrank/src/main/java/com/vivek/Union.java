package com.vivek;

/**
 * Created by Vivek on 7/26/2019.
 */
public class Union {
    public static void main(String[] args) {
        int ar1[] = {1, 3, 4, 5, 7};
        int ar2[] = {2, 3, 5, 6};
        int i = 0, j = 0;
        while (true) {


            for (int k = i; i < ar1.length; k++) {

                for (int l = j; j < ar2.length; l++) {
                    if (ar1[k] < ar2[l]) {
                        System.out.println(ar1[k]);
                        i++;
                        break;
                    } else if (ar1[k] == ar2[l]) {
                        System.out.println(ar1[k]);
                        i++;
                        j++;
                        break;
                    } else {
                        System.out.println(ar2[l]);
                        j++;
                        break;
                    }

                }
            }
            break;
        }

    }

    }



