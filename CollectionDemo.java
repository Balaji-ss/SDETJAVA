package com.fss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);

        List<Integer> intList1=new ArrayList<>();
        intList1.add(2);
        intList1.add(5);
        intList.addAll(intList1);
        intList.forEach(il->{System.out.println(il);});

        List<Integer> intList2 = Arrays.asList(2,3,45,25);
        intList2.forEach(il2->{System.out.println("intlist2 "+il2);});

        intList2.forEach(System.out::println);

        //sorting
        Collections.sort(intList2);
        System.out.println("sorted order"+intList2);

       // Set

       HashSet<String> nameSet = new HashSet<>();
       nameSet.add("BALAJI");
       nameSet.add("VAIJU");

       nameSet.forEach(System.out::println);

       HashMap<String,Integer> studentMap= new HashMap<>();

        studentMap.put("Balaji", 100);
        studentMap.put("vaiju", 50);

        studentMap.entrySet().forEach(sm->{System.out.println(sm.getKey()+""+sm.getValue());});




        


}}