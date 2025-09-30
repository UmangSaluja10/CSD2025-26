package collectionFrameworks.ArrayLists;

import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Lucky");
        list.add(true);
        list.add(10.20);
        System.out.println(list);
        for(Object i : list){
            System.out.println(i);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        ArrayList list1 = new ArrayList();
        list1.add(11);
        list1.add(0,"hello");
        list1.add(true);
        // list1.add(list); // will add list as a sublist
        list1.addAll(list); // will add all list members of list in list1
        System.out.println(list1);
        for(Object i : list1){
            System.out.println(i);
        }
    }
}
