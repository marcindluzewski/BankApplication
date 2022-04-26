import java.util.Scanner;

public class Account {
   private String name;
   private String surname;
   private String accNumber;
   private long balance;

   Scanner scanner = new Scanner(System.in);

   public String getName(){
       return name;
   }
   public String getSurname(){
       return surname;
   }
   public String getAccNumber(){
       return accNumber;
   }
    public long getBalance() {
        return balance;
    }

    public void setName(String name){
       this.name = name;
   }
    public void setSurname(String surname){this.surname = surname;}
    public void setAccNumber(String accNumber){this.accNumber = accNumber;}
    public void setBalance(long balance) {this.balance = balance;}

    public void createAccount(){
        System.out.println("Hello, please enter your name");
        name = scanner.next();
        System.out.println("Enter your surname");
        surname = scanner.next();
        System.out.println("Please enter your account number");
        accNumber = scanner.next();
        System.out.println("Enter your balance");
        balance = scanner.nextLong();

    }

    public void showAccount() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Account number: " + accNumber);
        System.out.println("Balance: " + balance);
    }

    public void depositMoney() {
        System.out.println("How much money you want to deposit?");
        long amount = scanner.nextLong();
        long new_balance = balance + amount;
        System.out.println("Your current balance is: " + new_balance + " PLN");


    }
}
