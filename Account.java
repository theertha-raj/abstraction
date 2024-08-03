package Abstration; // single tone classa

public class Account {
    private static Account a;

    private Account() {
        System.out.println("object created");
    }

    public static Account geta() {
        if (a == null) {
            a = new Account();
        }
        return a;
    }
    public static void main(String[] args) {
        Account obj1 = Account.geta();
        Account obj2 = Account.geta();
        if (obj1 == obj2) {
            System.out.println("new account");
        } else {
            System.out.println("object already created");
        }
    }
}
