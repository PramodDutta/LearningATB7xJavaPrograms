package aug.ex_18082024;

public class Lab222 {
    public static void main(String[] args) throws Exception {
        // throw
        // Custom Exception
        Bank sbi = new Bank("INR", 100);
//        Bank icici = new Bank("INR",  10);
//        Integer total = sbi.add(icici);
//        System.out.println(total);

        Bank jpmorgan = new Bank("AED", 89);
        Integer totalnew = sbi.add(jpmorgan);
        System.out.println(totalnew);

    }


}
