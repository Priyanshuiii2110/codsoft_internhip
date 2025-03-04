/* 1.
       Create a class to represent the ATM machine.
       2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
       checking the balance.
       3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
       checkBalance().
       4. Create a class to represent the user's bank account, which stores the account balance.
       5. Connect the ATM class with the user's bank account class to access and modify the account
       balance.
       6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
       7. Display appropriate messages to the user based on their chosen options and the success or failure
       of their transactions*/


import java.util.Scanner;
public class atm {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 5000;
        int option;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println("********* ATM Program ***********");
            System.out.println("1. For Withdrawal");
            System.out.println("2. For Depositing");
            System.out.println("3. For Checking Balance");
            System.out.println("4. For Exit");
            System.out.print("Choose an option(1-4) :");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> balance = balance - withdraw(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> Balance(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Wrong Option");
            }
        }
        System.out.println("THANK YOU FOR VISITING ");

    }

    static void Balance(double balance) {
        System.out.printf("YOUR BALANCE IS  %.2f", balance);
  }
    static double withdraw( double balance ){
        double amount;
        System.out.print("ENTER AMOUNT TO BE WITHDRAW ");
       amount  = scanner.nextDouble();
       if (amount>balance){
           System.out.println("!!!INSUFFICIENT BALANCE!!!");
       }else {
           return amount;
       }
        return amount;
    }
        static double deposit () {
            double amount;
            System.out.print("ENTER AMOUNT TO BE DEPOSITED :" );
            amount = scanner.nextDouble();
            if(amount<0){
                System.out.println(("!!!NEGATIVE AMOUNT CAN'T BE DEPOSITED!!!"));
            }else {
                return amount;
            }
            return amount;
        }



}