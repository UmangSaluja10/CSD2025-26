package collectionFrameworks.Comparable_Comparator;
/*
               COMPARABLE                 VS                    COMPARATOR
       -> java.lang                                    -> java.util
       -> CompareTo(object o)                          -> Compare(object o1, object o2)
       -> Follows Natural order                        -> Follows Custom ordering
       -> At a time(one order)                         -> Multiple order
       -> Same class(logic)                             -> Different class
 */


import java.util.ArrayList;
import java.util.Collections;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
