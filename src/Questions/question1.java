package Questions;

import java.util.LinkedHashSet;
import java.util.Scanner;

// you are given two java list option list1 and list2 . Write a java program that uses LinkedHashSet
// to perform the following operations while preserving the input order
//1. Union of both list, 2. Intersection of both list, 3. Difference (element list1 that are not in list2)
public class question1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedHashSet<Integer> list1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> list2 = new LinkedHashSet<>();
        System.out.println("List1:");
        for(int i=0;i<5;i++){
            list1.add(in.nextInt());
        }
        System.out.println("List2:");
        for(int i=0;i<5;i++){
            list2.add(in.nextInt());
        }
        LinkedHashSet<Integer> list3 = new LinkedHashSet<>();
        LinkedHashSet<Integer> list4 = new LinkedHashSet<>();
        list3.addAll(list1);
        for(Integer i:list2){
            if(list1.contains(i)){
                continue;
            }
            list3.add(i);
        }
        System.out.println("Union: "+list3);
        for(Integer i:list1){
            if(list2.contains(i)){
                list4.add(i);
            }
        }
        System.out.println("Intersection: "+list4);
        for(Integer i:list2){
            if(list1.contains(i)){
                list1.remove(i);
            }
        }
        System.out.println("Difference: "+list1);
    }
}
