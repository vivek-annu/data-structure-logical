package com.vivek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Vivek on 7/20/2019.
 */
public class FindDuplicateInArray {
    public static void main(String[] args) {
        int ar[]={4,1,2,2,1,2,5,5,1,1,33,3,3,4,4,4,0,44,4};

//        Approch 1

        //        Map<Integer,Integer> characterIntegerMap= new HashMap<>();
//        for (int i:ar){
//            if(!characterIntegerMap.containsKey(i)){
//                characterIntegerMap.put(i, 1);
//            }else{
//                characterIntegerMap.put(i, characterIntegerMap.get(i)+1);
//            }
//        }
//
//
//        Set<Integer> set = characterIntegerMap.keySet();
//        for (Integer i: set){
//            if(characterIntegerMap.get(i)>1){
//                System.out.println(characterIntegerMap.get(i));
//            }
//        }
//Aproch 2

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate= new HashSet<>();
        for (Integer i: ar) {
            if (!hashSet.contains(i)){
                hashSet.add(i);
            }else{
              duplicate.add(i);
            }

        }
        System.out.println(duplicate);
    }
}
