import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello in our Bank!");
        System.out.println("How many users you want to add?");
        int amountNewUsers = scanner.nextInt();
        Account tableOfNewCustomers [] = new Account[amountNewUsers];
        for(int i = 0; i < tableOfNewCustomers.length; i++){
            tableOfNewCustomers[i] = new Account();
            tableOfNewCustomers[i].createAccount();
            tableOfNewCustomers[i].showAccount();
        }

        int inputNumber;

        do {
            System.out.println("1. Display all accounts");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdrawal money");
            System.out.println("4. Exit application");
            System.out.println("Enter your choice");
            inputNumber = scanner.nextInt();

            switch (inputNumber) {
                case 1:
//                    account.showAccount();
                    break;
                case 2:
                    System.out.println("Enter account number to deposit: ");
                    String accountNumber = scanner.next();
                    boolean found = false;
                    for(int i=0; i < tableOfNewCustomers.length; i++){
                        found = tableOfNewCustomers[i].search(accountNumber);
                        if(found){
                            tableOfNewCustomers[i].depositMoney();
                        }
                    }
//                    account.depositMoney();
                    break;
                case 3:
//                    account.withdrawalMoney();
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
