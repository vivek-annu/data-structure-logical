package com.vivek;

/**
 * Created by Vivek on 7/26/2019.
 */
public class StockDaysProfit {
    public static void main(String[] args) {


        int ar[] = {100, 180, 260, 310, 40, 560, 685};

        for (int i = 0; i < ar.length - 1; i++) {
            int localMinima = 0;
            int localMaxima = 0;
            if (ar[i] < ar[i + 1]) {
                localMinima = ar[i];


                localMaxima = 0;
                for (int j = i + 1; j < ar.length - 1; j++) {
                    localMaxima = ar[j];
                    if (ar[j] > ar[j + 1]) {
                        localMaxima = ar[j];

                        break;
                    } else if (ar[j + 1] > ar[j]) {
                        localMaxima = ar[j + 1];


                    }
                    i = j;
                }
                System.out.println("localMinima===>" + localMinima + " localMaxima  " + localMaxima);
            }


        }


    }
}
