
public class YourFirstAccount {

    /*
    Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, 
    and finally prints the balance.
    
     */
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account newAccount = new Account("Bob", 100);
        newAccount.deposit(20);

        System.out.println(newAccount.toString());

    }
}
