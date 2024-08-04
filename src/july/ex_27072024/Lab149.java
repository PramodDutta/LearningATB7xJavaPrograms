package july.ex_27072024;

public class Lab149 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };

        // R - 3 - i -> 0 to 2
        // C - 3  j -> 0 to 2

        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        // i = 0, j ->  0,1,2
        // i = 1 , j -> 0, 1,2
        // i = 2 , j -> 0, 1,2


    }
}
