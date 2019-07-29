package com.vivek;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    static char SolveIt(String str) {
        Set<Character> characters= new HashSet<>();
        TreeSet<Character> treeSet= new TreeSet<>();
        char[] chars = str.toCharArray();
        for (char c:chars){
            if(!characters.contains(c)){
                characters.add(c);
            }else {
                treeSet.add(c);
            }
        }


        return  treeSet.first();
        // Write your code here
    }
    public static void main( String[] args ) {

    }}

