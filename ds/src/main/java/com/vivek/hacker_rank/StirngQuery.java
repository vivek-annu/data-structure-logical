package com.vivek.hacker_rank;

import java.util.Arrays;

/**
 * Created by Vivek on 7/22/2019.
 */
public class StirngQuery {


    public static void main(String[] args) {

        String strings[]={"ab","ab","abc"};
        String queries []= {"ab","abc","bc"};
        int results[]= new int[queries.length];

        for (int i = 0; i <queries.length ; i++) {
            int count =0;
            for (int j = 0; j < strings.length; j++) {
                if(strings[j].contentEquals(queries[i]))
                {
                    count++;
                }
            }
            results[i]=count;

        }


        System.out.println(Arrays.toString(results));
    }
}
