package main.java.Bootcamp.SecondExercise.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void testConstructor() {

        new BankAccount();
    }

    @Test
    void testDeposit() {

        (new BankAccount()).deposit(10.0d);
    }

    @Test
    void testWithdraw() {

        (new BankAccount()).withdraw(10.0d);
    }

    @Test
    void testWithdraw2() {

        (new BankAccount()).withdraw(5000.0d);
    }

    @Test
    void testPrintBalance() {
        assertEquals(100.0d, (new BankAccount()).printBalance());
    }

    @Test
    void testTransferFrom() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.transferFrom(10.0d, new BankAccount());
    }

    @Test
    void testTransferFrom2() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.transferFrom(5000.0d, new BankAccount());
    }

    @Test
    void testTransferFrom3() {

        (new BankAccount()).transferFrom(1000.0d, null);
    }
}

