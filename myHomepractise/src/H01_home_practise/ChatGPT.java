package H01_home_practise;
import java.util.Scanner;
public class ChatGPT {
        public static void main(String[] args) {

                    Scanner input = new Scanner(System.in);

                    while (true) {
                        System.out.println("Welcome to calculator");
                        System.out.println("Enter first number: ");

                        if (!input.hasNextDouble()) {
                            System.out.println("You have entered a letter, please enter a number.");
                            input.next();
                            continue;
                        }
                        double num1 = input.nextDouble();

                        System.out.println("Enter second number: ");
                        if (!input.hasNextDouble()) {
                            System.out.println("You have entered a letter, please enter a number.");
                            input.next();
                            continue;
                        }
                        double num2 = input.nextDouble();

                        System.out.println("Enter an operator (+, -, *, /): ");
                        char operator = input.next().charAt(0);

                        double result;
                        switch (operator) {
                            case '+':
                                result = num1 + num2;
                                break;
                            case '-':
                                result = num1 - num2;
                                break;
                            case '*':
                                result = num1 * num2;
                                break;
                            case '/':
                                result = num1 / num2;
                                break;
                            default:
                                System.out.println("Invalid operator. Please enter a valid operator.");
                                continue;
                        }

                        System.out.println("The result is: " + result);
                        System.out.println("Do you want to continue using the calculator? (yes/no)");
                        String continueOption = input.next();

                        if (continueOption.equalsIgnoreCase("no")) {
                            break;
                        }
                    }
                    System.out.println("Thank you for using the calculator.");
                }
            }
