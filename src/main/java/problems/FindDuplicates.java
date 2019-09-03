package problems;

import sun.text.normalizer.UCharacter;

import java.util.*;

public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main  FindDuplicates(String[] args) {

        HashMap<Character, Integer> tiger = new HashMap<Character, Integer>();

        Object str;
        char[] carry = str.();

        for (char c : carry) {
            if (tiger.containsKey(c))
            {
                tiger put = tiger.put(c, tiger.get(c) +);
            } else
                tiger.put(c, 1);
        }


        Set<Character> Setchar = tiger.keySet();
        System.out.println("Duplicate in" + str);
        {
            Iterable<? extends Character> setchar;
            for (Character c : setchar) {
                if (tiger.get(c) > 1)
                    System.out.println(c + " "tiger.get(c));
            }