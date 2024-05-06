import java.util.Scanner;

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

    public void withdraw(double amount) {

        if ((totalBalance - 1500) >= amount) {

            totalBalance = totalBalance - amount;
            System.out.println(amount + " amount is withdrawed by you and transactions is successful.");
            System.out.println();
        }

        else {

            System.out.println("withdraw amount is greater then totalBalance therefore transactions is failure.");
            System.out.println();
        }
    }

    public void deposit(double amount) {

        totalBalance = totalBalance + amount;
        System.out.println(amount + " amount is deposited by you and transactions is successful.");
        System.out.println();
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
                    System.out.println("How much amount you want to withdraw : ");
                    double amountw = sc.nextDouble();
                    System.out.println();
                    u1.withdraw(amountw);
                    break;

                case 2:
                    System.out.println("How much amount you want to deposit : ");
                    double amountd = sc.nextDouble();
                    System.out.println();
                    u1.deposit(amountd);
                    break;

                case 3:
                    u1.checkBalance();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println(" Enter Invalide Input ! , plase enter 0, 1, 2 , 3 this !");
                    break;

            }
        }

    }

}
