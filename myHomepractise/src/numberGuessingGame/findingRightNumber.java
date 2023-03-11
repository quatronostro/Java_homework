package T02;

import java.util.Random;
import java.util.Scanner;

public class findingRightNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();


        int number = rnd.nextInt(100);
        //System.out.println(number);
        System.out.println("WELCOME TO NUMBER GUESSING GAME!!!" +
                "\nYou have 5 guesses for to find correct number and it must be between 0 and 100, so lets try." +
                "\nEnter your number : ");
        int enteredNum = scan.nextInt();
        int flag = 4;


        do {
            int difference = number - enteredNum;
            if (enteredNum < number) {

                if (difference < 10) {
                    System.out.println("The number you entered is less than the correct number. You're so close. Your remaining trial : " + flag +
                            "\nPlease try again : ");
                    enteredNum = scan.nextInt();
                } else if (difference < 20) {
                    System.out.println("The number you entered is less than the correct number. Try some more. Your remaining trial : " + flag +
                            "\nPlease try again : ");
                    enteredNum = scan.nextInt();
                } else {
                    System.out.println("The number you entered is less than the correct number. You made a long guess. Your remaining trial : " + flag +
                            "\nPlease try again : ");
                    enteredNum = scan.nextInt();
                }
            } if (enteredNum > number) {
                if (difference < 10) {
                    System.out.println("The number you entered is greater than the correct number. You're so close. Your remaining trial : " + flag +
                            "\nPlease try again : ");
                    enteredNum = scan.nextInt();
                } else if (difference < 20) {
                    System.out.println("The number you entered is greater than the correct number. Try some more. Your remaining trial : " + flag +
                            "\nPlease try again : ");
                    enteredNum = scan.nextInt();
                } else {
                    System.out.println("The number you entered is less than the correct number. You made a long guess. Your remaining trial : " + flag +
                            "\nPlease try again : ");
                    enteredNum = scan.nextInt();
                }
            }
            flag--;
            if (flag == 0) {
                System.out.println("You have filled your right to guess.");
                break;
            }

        }while (enteredNum != number);

        if (enteredNum == number) {
            System.out.println("You got the correct number, Congratulations!");
        }
    }
}
