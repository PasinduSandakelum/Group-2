package com.virtusa.pasindu.examples;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        try {
            Iterator<String> iterator=list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());

                list.add("E");
            }
        }catch (ConcurrentModificationException e){
            System.out.println("Fail fast in Iterator");
        }

    }
}
