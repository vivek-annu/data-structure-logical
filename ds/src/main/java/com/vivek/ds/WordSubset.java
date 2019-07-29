package com.vivek.ds;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vivek on 7/20/2019.
 */
public class WordSubset {
    public static void main(String[] args) {

        String ar1[]={"amazon","apple","facebook","google","vivek"};
        String ar2[]={"e","o"};

        Set<String> strings= new HashSet<>();


        for (int i = 0; i <ar1.length ; i++)



            if (ar1[i].contains(ar2[0])&& ar1[i].contains(ar2[1]) ) strings.add(ar1[i]);



        System.out.println(strings);



    }
}
