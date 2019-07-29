package com.vivek.ds;

import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem {






    public static void main(String[] args) {
        int values[]={60,100,120};
        int weight[]={10,20,30};
        int knapSackCapaticy=50;
        List<Item> items= new ArrayList<Item>();

        for (int i = 0; i <values.length ; i++) {
            Item item = new Item();
            item.setValue(values[i]);
           item.setWeight(weight[i]);
            items.add(item);
        }int tempCompare=0;













        System.out.println(items);



    }
}
