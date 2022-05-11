package Bootcamp.SecondExercise.BankAccount;

public class BankMain {

    public static void main(String[] args) {

        BankAccount cust1 = new BankAccount();
        cust1.deposit(500);

        BankAccount cust2 = new BankAccount();
        cust2.deposit(100);
        cust2.withdraw(110);

        BankAccount cust3 = new BankAccount();
        System.out.println(cust3.printBalance());
        cust3.transferFrom(20, cust2);

        BankAccount cust4 = new BankAccount();
        cust4.deposit(5001);


        System.out.print("First customer have a balance: ");
        System.out.println(cust1.printBalance());
        System.out.print("Second customer have a balance: ");
        System.out.println(cust2.printBalance());


    }

}
