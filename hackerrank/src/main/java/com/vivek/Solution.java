package com.vivek;

import java.util.Scanner;

public class Solution {




    public static void main(String[] args)throws Exception{
        boolean flag=false;
        Scanner scanner= new Scanner(System.in);
        int B=scanner.nextInt();
        scanner.nextLine();
        int H=scanner.nextInt();
        if(B>=0  && H>0)flag=true;
        else throw new Exception("Breadth and height must be positive");
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//e

