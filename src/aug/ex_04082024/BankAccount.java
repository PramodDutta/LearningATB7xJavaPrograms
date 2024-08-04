package aug.ex_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode; // Instance

    // DC
    BankAccount(){
        bankName = "SBI";
        balance = 0;
        bankCode = "SBI001";
    }

    // PC - 3 Argument
    BankAccount(String bName,int bal, String bCode){
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }

    BankAccount(String bName,int bal){
        this.bankName = bName;
        this.balance = bal;

    }

    BankAccount(String bName){
        this.bankName = bName;
    }


    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
}
