package FindAnimalName;

import java.util.Random;
import java.util.Scanner;

public class Runner {

    static Scanner scan = new Scanner(System.in);

    static StringBuilder guess;

    public static void main(String[] args) {

        Animal[] animals = {new Cat(), new Dog(), new Cow(), new Sheep()};

        int flag = 3;

        System.out.println("---WELCOME TO ANIMAL GUESSING GAME---" +
                "\nCan you know the name of the animal I remember?");

        Random rnd = new Random();
        int randomNum = rnd.nextInt(4);

        Animal randomAnimal = animals[randomNum];

        while (flag != 0){

            System.out.print("\nThis animal ");
            randomAnimal.movement();
            guess = new StringBuilder(scan.next().toLowerCase());

            if (randomAnimal.isTrue(guess)){
                System.out.println("Correct Answer, Congrats!");
                break;
            } else {
                System.out.println("Wrong Answer, Please try again!");
                flag--;
            }

            System.out.println("Is this animel edible?" + randomAnimal.isEdible());
            guess = new StringBuilder(scan.next().toLowerCase());

            if (randomAnimal.isTrue(guess)){
                System.out.println("Correct Answer, Congrats!");
                break;
            } else {
                System.out.println("Wrong Answer, Please try again!");
                flag--;
            }

            System.out.println("This animal makes this sound = " + randomAnimal.getSound());
            guess = new StringBuilder(scan.next().toLowerCase());

            if (randomAnimal.isTrue(guess)){
                System.out.println("Correct Answer, Congrats!");
                break;
            } else {
                System.out.println("Wrong Answer, Please try again!");
                flag--;
            }


        }

        if (flag == 0){
            System.out.println("\nYou have filled your guess. Correct answer was " + randomAnimal.name);
        }


    }

}
