package collectionFrameworks.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class A2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(true);
        list.add("karan");
        list.add(10);
        list.add(10);
        list.add(09.24);
        list.add(10);
        list.add(10);
        list.add(908);
        list.add(10);
        list.add(false);
        list.add(10);
        //list.remove(10); // will take 10 as a index not as a object.
        list.remove(Integer.valueOf(10));
        list.removeAll(Collections.singleton(10)); //will delete every occurance of 10
        list.removeIf(Predicate.isEqual(10));
        list.removeIf(e->e.equals(10));

        System.out.println(list);



        // arrays as list
        List<String> list1 = Arrays.asList("a", "b", "c");

    }
}
