package H01_home_practise;
// these are scanner and timer for program
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        //Scanner for user can enter a value
        Scanner scan = new Scanner(System.in);

        // This is a While loop for until user want to exit it will run
        while (true) {

            //This is welcome screen and giving user information that which number use for the operation
            System.out.println("\n=== Welcome to Calculator ===\n" +
                    "[1] For addition in calculator please press 1\n" +
                    "[2] For subtraction in calculator please press 2\n" +
                    "[3] For multiplication in calculator please press 3\n" +
                    "[4] For division in calculator please press 4\n" +
                    "[5] To exit to Calculator please press 5");

            // This is an integer for taking a value from user for which operation he/she wants to make
            int num;

            // This part is the part where we get information about the operation that the user wants to do
            // There is also exception part for if user enter a invalid information
            try {
                System.out.println("\nChoose your operation: ");
                num = scan.nextInt();
            } catch (Exception e) {
                System.out.println("You have entered a letter, please choose your operation:\n" +
                            "[1],[2],[3],[4] or to exit to Calculator please press [5]");
                scan.nextLine();
                continue;
            }

            // There is if else part will work according to what action the user wants to do
            // There is also exception part for if user enter a invalid information
            if (num == 1) {

                try {
                    System.out.println("First number you entered : ");
                    double x = scan.nextDouble(); //first number information

                    System.out.println("Second number you entered : ");
                    double y = scan.nextDouble(); //second number information

                    System.out.println("Calculating...");
                    // this code will communicate with "import java.util.concurrent.TimeUnit;"
                    // and it will wait code for 2 seconds
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Adding Result...\n" +
                            String.valueOf(x) + " + " + String.valueOf(y) + " = " + (x + y));
                } catch (Exception e) {
                    // if user enters a letter will see that
                    System.out.println("You have entered a letter, please enter a number!");
                }

            } else if (num == 2) {

                try {
                    System.out.println("First number you entered : ");
                    double x = scan.nextDouble();
                    System.out.println("Second number you entered : ");
                    double y = scan.nextDouble();

                    System.out.println("Calculating...");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Subtracting Result...\n" +
                            String.valueOf(x) + " - " + String.valueOf(y) + " = " + (x - y));
                } catch (Exception e) {
                    System.out.println("You have entered a letter, please enter a number!");
                }

            } else if (num == 3) {

                try {
                    System.out.println("First number you entered : ");
                    double x = scan.nextDouble();
                    System.out.println("Second number you entered : ");
                    double y = scan.nextDouble();

                    System.out.println("Calculating...");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Multiplying Result...\n" +
                            String.valueOf(x) + " * " + String.valueOf(y) + " = " + (x * y));
                } catch (Exception e) {
                    System.out.println("You have entered a letter, please enter a number!");
                }

            } else if (num == 4) {

                try {
                    System.out.println("First number you entered : ");
                    double x = scan.nextDouble();
                    System.out.println("Second number you entered : ");
                    double y = scan.nextDouble();

                    System.out.println("Calculating...");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Dividing Result...\n" +
                            String.valueOf(x) + " / " + String.valueOf(y) + " = " + (x / y));
                } catch (Exception e) {
                    System.out.println("\nYou have entered a letter, please enter a number!");
                }

            // This is for to exit to Calculator program
            } else if (num == 5) {

                    System.out.println("Exiting Calculator...");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("See you later...");
                    break;

            // If user enter an invalid value this code will run and calculator program reruns
            } else {

                System.out.println("You have entered incorrectly!\n" +
                        "\nPlease choose your operation\n" +
                        "[1],[2],[3],[4] or to exit calculator please press [5]");

            }
        }
    }
}
