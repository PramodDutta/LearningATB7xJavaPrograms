package aug.ex_18082024;

public class Lab225 {
    public static void main(String[] args) {
        try {
            String s1  = null;
            if (s1 == null){
                throw new Exception("Add a proper String or not null String");
            }
            s1.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //



    }
}
