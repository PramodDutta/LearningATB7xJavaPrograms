package july.ex_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {

        // Arrays -> new
        int[] marks = new int[3];
        // index - 0,1,2
        // len - 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        System.out.println(marks[10]); // AIOBE


        boolean[] is_married = {true, false, true};
        // To Print

        for (int i = 0; i < marks.length; i++) {
            // i = 0,1,2
            System.out.println(i + " -> " + marks[i]);
        }


        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }


    }
}
