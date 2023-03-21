package D03_Ders;

import java.util.Scanner;

public class Basic_AtmMachine {

    static String cardNumber = "123456";
    static String password = "1234";
    static double balance = 50000;

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        enterScreen();
    }

    private static void enterScreen() {

        System.out.println("********* WELCOME TO YOUR BANK ACCOUNT *********");
        System.out.println("Please enter your card Number : ");
        String userCardNumber = scan.nextLine().replace(" ", "");

        System.out.println("\nPlease enter your password : ");
        String userPassword = scan.next();

        if (userCardNumber.equals(cardNumber) && userPassword.equals(password)){
            menuForOperation();
        } else {
            System.out.println("You've entered your card number or password incorrectly!" +
                    "\nPlease try again.");
            scan.nextLine();
            enterScreen();
        }
    }

    private static void menuForOperation() {

        System.out.println("\nPLEASE CHOOSE YOUR OPERATION NUMBER\n" +
                "1. Balance inquiry and account info\n" +
                "2. Money deposit process\n" +
                "3. Money withdrawal process\n" +
                "4. Sending money\n" +
                "5. Change password\n" +
                "6. EXIT\n" +
                "\n" +
                "Your choice : ");

        int choose = scan.nextInt();

        switch (choose){
            case (1): {
                balanceInquiry();
            }
            case (2): {
                System.out.println("Enter the amount you want to deposit : ");
                double amount = scan.nextDouble();
                deposit(amount);
            }
            case (3): {
                System.out.println("Enter the amount you want to withdraw : ");
                double amount = scan.nextDouble();
                withdraw(amount);
            }
            case (4): {
                sendingMoney();
            }
            case (5): {
                changePassword();
            }
            case (6): {
                System.out.println("\nSee you next time :)");
                System.exit(0);
            }
            default:
                System.out.println("\nYou've entered incorrectly! PLEASE TRY AGAIN!\n");
                menuForOperation();
        }
    }

    private static void changePassword() {

        System.out.println("\nPlease enter your old password : ");
        String userPassword = scan.next();

        if (userPassword.equals(password)){
            System.out.println("\nPlease enter your new password : ");
            password = scan.next();
            scan.nextLine();
            System.out.println("\nYou are being redirected to login again.Please enter your new password!");
            enterScreen();
        } else {
            System.out.println("\nYou've entered incorrectly, PLEASE TRY AGAIN!\n");
            changePassword();
        }
    }

    private static void sendingMoney() {

        scan.nextLine();
        System.out.println("Enter the iban number you want to send money to : ");
        String IBAN = scan.nextLine().replace(" ", "").toUpperCase();

        if (IBAN.length() == 26 && IBAN.startsWith("TR")){
            System.out.println("Enter the amount you want to send");
            double amount = scan.nextDouble();

            if (amount <= balance){
                balance -= amount;
                System.out.println(amount + " TL, sent to account number : " + IBAN);
                balanceInquiry();
            } else {
                System.out.println("You do not have the amount you want to send!");
                balanceInquiry();
            }
        } else {
            System.out.println("You've entered the iban number incorrectly! PLEASE TRY AGAIN!");
            sendingMoney();
        }
    }

    private static void withdraw(double amount) {

        if (amount <= balance){
            balance -= amount;
            balanceInquiry();
        } else {
            System.out.println("\nYou do not have the amount you want to withdraw.\n");
            balanceInquiry();
        }
    }

    private static void deposit(double amount) {

        balance += amount;
        balanceInquiry();
    }

    private static void balanceInquiry() {

        System.out.println("\nYour card number : " + "****" + cardNumber.substring(4, 6));
        System.out.println("Your password : ****");
        System.out.println("Your current balance : " + balance);
        menuForOperation();
    }

}
