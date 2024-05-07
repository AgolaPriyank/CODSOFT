import java.util.Scanner;

class GreaterWithdrawAmountException extends Exception {

    public String toString() {

        return "withdraw amount is greater then totalBalance therefore transactions is failure. Plase try again with leass amount";
    }
}

class GreaterDepositAmountException extends Exception {

    public String toString() {

        return "Transactions is failure because amount for deposit is greater then 200000. Plase try again with leass amount";
    }
}

abstract class ATMMachine {

    abstract public void withdraw();

    abstract public void deposit();

    abstract public void checkBalance();
}

class BankAccount extends ATMMachine {

    double totalBalance;

    public BankAccount() {

    }

    public BankAccount(double amount) {

        this.totalBalance = amount;
    }

    public void withdraw(double amount) throws GreaterWithdrawAmountException {

        if ((totalBalance - 1500) >= amount) {

            totalBalance = totalBalance - amount;

            System.out.println(amount + " amount is withdrawed by you and transactions is successful.");
            System.out.println();
        }

        else {

            throw new GreaterWithdrawAmountException();
        }
    }

    public void deposit(double amount) throws GreaterDepositAmountException {

        if (amount <= 200000) {

            totalBalance = totalBalance + amount;

            System.out.println(amount + " amount is deposited by you and transactions is successful.");
            System.out.println();
        }

        else {

            throw new GreaterDepositAmountException();
        }
    }

    public void checkBalance() {

        System.out.println("Total balance of your Bank Account is : " + totalBalance);
        System.out.println();
    }

    public void withdraw() {

        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    public void deposit() {

        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

}

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount u1 = new BankAccount(5000);

        while (true) {

            System.out.println("---------------------------------------------");
            System.out.println("1. Enter '1' for withdrawing money ");
            System.out.println("2. Enter '2' for depositing money ");
            System.out.println("3. Enter '3' for checking Balance");
            System.out.println("4. Enter '0' for exit from program");

            int userChoice = sc.nextInt();

            System.out.println("------------------------------------------------");
            System.out.println();

            switch (userChoice) {

                case 1:

                    try {
                        System.out.println("How much amount you want to withdraw : ");
                        double amountw = sc.nextDouble();
                        System.out.println();
                        u1.withdraw(amountw);
                    }

                    catch (GreaterWithdrawAmountException w) {
                        System.out.println(w);
                        System.out.println();
                    }

                    break;

                case 2:

                    try {
                        System.out.println("How much amount you want to deposit : ");
                        double amountd = sc.nextDouble();
                        System.out.println();
                        u1.deposit(amountd);
                    }

                    catch (GreaterDepositAmountException d) {
                        System.out.println(d);
                        System.out.println();
                    }

                    break;

                case 3:

                    u1.checkBalance();
                    break;

                case 0:
                    System.exit(0);

                default:
                
                    System.out.println(" Enter Invalide Input ! , plase enter 0, 1, 2 , 3 this !");
                    System.out.println();
                    break;

            }
        }

    }

}
