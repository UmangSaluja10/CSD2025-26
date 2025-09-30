package collectionFrameworks.Comparable_Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student11 implements Comparable<Student11> {
    int id;
    String name;
    Student11(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + "-" + name;
    }

    @Override
    public int compareTo(Student11 other) {
        return this.id-other.id;
        // return this.name.compareTo(other.name);
    }
}

public class A2 {
    public static void main(String[] args) {
        List<Student11> list = new ArrayList<>();
        list.add(new Student11(20, "AJ"));
        list.add(new Student11(10, "ZJ"));
        list.add(new Student11(30, "CJ"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

}