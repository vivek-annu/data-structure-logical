package com.vivek.ds;

/**
 * Created by Vivek on 7/20/2019.
 */
public class BothSideValueEQUAL {
    public static void main(String[] args) {

        int ar[]={1,6,7,0,7};

        for (int i = 1; i <ar.length ; i++) {

            int temp1=0,temp2=0;

            for (int j = 0; j <i ; j++) {
                temp1=temp1+ar[j];
            }
            for (int j = i+1; j < ar.length; j++) {
                temp2=temp2+ar[j];

            }
            if(temp1==temp2){
                System.out.println(i+" index is mid index in which if add both side of it value will come equal ");
          break;
            }


        }



    }
}
