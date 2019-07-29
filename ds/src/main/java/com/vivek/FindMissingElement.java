package com.vivek;

/**
 * Created by Vivek on 7/20/2019.
 */
public class FindMissingElement {


    public static void main(String[] args) {
        int ar[]={1,2,4,5,6,9,8,3};
        int missing = findMissing(ar, ar.length + 1);
        System.out.println(missing);

    }

    private static int findMissing(int[] ar, int n) {

       int formulaValue = (n*(n+1)/2);
       int addTolat=0;
       for (int i:ar){
           addTolat+=i;
       }
        return (formulaValue-addTolat);



    }
}
