

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Calculator_withSwitchcase {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Welcome to Calculator ===\n" +
                    "[1] For addition in calculator please press 1\n" +
                    "[2] For subtraction in calculator please press 2\n" +
                    "[3] For multiplication in calculator please press 3\n" +
                    "[4] For division in calculator please press 4\n" +
                    "[5] To exit to Calculator please press 5");
            int num;
            try {
                System.out.println("\nChoose your operation: ");
                num = scan.nextInt();
            } catch (Exception e) {
                System.out.println("You have entered a letter, please choose your operation:\n" +
                        "[1],[2],[3],[4] or to exit to Calculator please press [5]");
                scan.nextLine();
                continue;
            }
            double x, y, result;
            switch (num) {
                case 1:
                    try {
                        System.out.println("First number you entered : ");
                        x = scan.nextDouble();
                        System.out.println("Second number you entered : ");
                        y = scan.nextDouble();
                        System.out.println("Calculating...");
                        TimeUnit.SECONDS.sleep(2);
                        result = x + y;
                        System.out.println("Adding Result...\n" +
                                String.valueOf(x) + " + " + String.valueOf(y) + " = " + String.valueOf(result));
                    } catch (Exception e) {
                        System.out.println("You have entered a letter, please enter a number!");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("First number you entered : ");
                        x = scan.nextDouble();
                        System.out.println("Second number you entered : ");
                        y = scan.nextDouble();
                        System.out.println("Calculating...");
                        TimeUnit.SECONDS.sleep(2);
                        result = x - y;
                        System.out.println("Subtracting Result...\n" +
                                String.valueOf(x) + " - " + String.valueOf(y) + " = " + String.valueOf(result));
                    } catch (Exception e) {
                        System.out.println("You have entered a letter, please enter a number!");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("First number you entered : ");
                        x = scan.nextDouble();
                        System.out.println("Second number you entered : ");
                        y = scan.nextDouble();
                        System.out.println("Calculating...");
                        TimeUnit.SECONDS.sleep(2);
                        result = x * y;
                        System.out.println("Multiplying Result...\n" +
                                String.valueOf(x) + " * " + String.valueOf(y) + " = " + String.valueOf(result));
                    } catch (Exception e) {
                        System.out.println("You have entered a letter, please enter a number!");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("First number you entered : ");
                        x = scan.nextDouble();
                        System.out.println("Second number you entered : ");
                        y = scan.nextDouble();
                        System.out.println("Calculating...");
                        TimeUnit.SECONDS.sleep(2);
                        result = x / y;
                        System.out.println("Dividing Result...\n" +
                                String.valueOf(x) + " / " + String.valueOf(y) + " = " + String.valueOf(result));
                    } catch (Exception e) {
                        System.out.println("\nYou have entered a letter, please enter a number!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Calculator...");
                    System.out.println("See you later...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have entered incorrectly!\n" +
                            "\nPlease choose your operation\n" +
                            "[1],[2],[3],[4] or to exit calculator please press [5]");
                    break;
            }
        }
    }
}
