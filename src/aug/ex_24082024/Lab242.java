package aug.ex_24082024;

import java.util.*;

public class Lab242 {
    public static void main(String[] args) {
        // List - > Duplicate Allows
        // Set -> Doesn't allow Duplicate
        Set hs = new HashSet(); // Hashing mechanism to store the element, no order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet(); // LinkedList mechanism to store the element, order will maintain
        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        Set ts = new TreeSet(); // Black and Red Tree mechanism to store the element, order will maintain
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("WaterMelon");
        // ts.add(null); # Can we sorting with null?
        System.out.println(ts);


        for (Object s : ts) {
            System.out.println(s);
        }

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
