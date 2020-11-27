package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C", "D"};
        Integer[] integers = {1, 2, 3, 4};

        PairKV[] pairs = new PairKV[Math.min(strings.length, integers.length)];
        for (int i = 0; i < strings.length && i < integers.length; i++)
            pairs[i] = new PairKV(strings[i], integers[i]);

        ArrayList<String> stringArrayList = new Solution().newArrayList(strings);
        HashSet<Integer> integerHashSet = new Solution().newHashSet(integers);
        HashMap<String, Integer> stringIntegerHashMap = new Solution().newHashMap(pairs);

        System.out.println(stringArrayList);
        System.out.println(integerHashSet);
        System.out.println(stringIntegerHashMap);
    }
}
