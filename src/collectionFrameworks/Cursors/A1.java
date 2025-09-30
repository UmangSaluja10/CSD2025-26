package collectionFrameworks.Cursors;

import java.util.*;

// Cursors in CollectionFrameworks
//cursors: interfaces used to traverse in group of colections
// types: 1. iterator, 2. List iterator, 3. Enumrator
// for each loop doesn't allow deletion of any element
// for legacy classes like vector and stack the enumrator is used to iterate
//_______________________________________________________________________________________
//|              Iterator                  ||                 listIterator             |
//_______________________________________________________________________________________
//|   Iterator i = list.iterator();        ||     Iterator i = list.listIterator();    |
//|    hasnext(),next(),remove()           ||     hasnext(),hasprevious(),next(),      |
//|                                        ||     previous(),remove(),set()            |
//_______________________________________________________________________________________
public class A1 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("Aatif");
        l.add(12.3);

        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List names =  new ArrayList<>();
        names.add(1);
        names.add("Rahul");
        names.add("Neha");
        ListIterator litr = names.listIterator();
        System.out.println("Forward iteration:");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        System.out.println("Backward iteration:");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }


        Stack list  = new Stack();
        list.add(10);
        list.add("Aatif");
        Enumeration enu = list.elements();
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }

}
