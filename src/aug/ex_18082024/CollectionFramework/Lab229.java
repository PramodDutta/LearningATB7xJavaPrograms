package aug.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab229 {
    public static void main(String[] args) {
        int [] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for (int i = 0; i < a.length ; i++) {
            if( a[i] == 4){
                System.out.println("Found 4");
            }
        }

        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.contains(4));

    }
}
