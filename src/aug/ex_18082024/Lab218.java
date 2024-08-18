package aug.ex_18082024;

public class Lab218 {

    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]); // Unchecked - ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("ArrayIndexOutofBound");
        }finally {
            // File.close, sc.close, sqlconnection.close.
            System.out.println("End of the program");
        }
    }
}
