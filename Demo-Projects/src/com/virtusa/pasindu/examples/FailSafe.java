package com.virtusa.pasindu.examples;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put("A",1);
        concurrentHashMap.put("B",2);
        concurrentHashMap.put("C",3);
        concurrentHashMap.put("D",4);

        Iterator<String> iterator = concurrentHashMap.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+" : "+concurrentHashMap.get(key));

            concurrentHashMap.put("E",5);
        }
    }
}
