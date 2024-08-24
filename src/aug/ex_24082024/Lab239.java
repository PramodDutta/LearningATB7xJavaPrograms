package aug.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lab239 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(14);
        marks.add(98);
        marks.add(10);
        marks.add(99);
        Collections.sort(marks); // Natural Sorting
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("Pramod");
        names.add("Amit");
        names.add("Dutta");
        names.add("Lukcy");
        Collections.sort(names); // A,D,L,P // Natural Sorting First Alpha
        System.out.println(names);




    }
}
