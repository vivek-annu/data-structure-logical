package com.vivek.ds;

import java.util.PriorityQueue;

/**
 * Created by Vivek on 7/24/2019.
 */
public class PQ {

    public static void main(String[] args) {

        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("vive");
        strings.add("annu");
        strings.add("monu");
        System.out.println(strings);
        strings.poll();
        System.out.println(strings);
        strings.remove();


        System.out.println(strings);

    }
}
