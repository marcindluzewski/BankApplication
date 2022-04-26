import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Hello in our Bank!");

        account.createAccount();
        int inputNumber;

        do {
            System.out.println("1. Display account details");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdrawal money");
            System.out.println("4. Exit application");
            System.out.println("Enter your choice");
            inputNumber = scanner.nextInt();

            switch (inputNumber) {
                case 1:
                    account.showAccount();
                    break;
                case 2:
                    account.depositMoney();
                    break;
                case 3:
                    account.withdrawalMoney();
                    break;
                case 4:
                    System.out.println("Thank you and goodbye - have a nice day!");
                default:
                    System.out.println("Wrong choice - please read closely and try again");

            }
        }
        while(inputNumber != 4);

    }
}
