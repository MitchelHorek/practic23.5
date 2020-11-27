package com.company;

import java.util.*;

public class Solution {

    public <T> ArrayList<T> newArrayList(T[] array){
        return new ArrayList<T>(Arrays.asList(array));
    }

    public <T> HashSet<T> newHashSet(T[] array){
        return new HashSet<T>(Arrays.asList(array));
    }

    public <K, V> HashMap<K, V> newHashMap(PairKV<K, V>[] array){
        HashMap<K, V> buff = new HashMap<>();
        for (PairKV<K, V> pair: array)
            buff.put(pair.getKey(), pair.getValue());

        return buff;
    }
}
