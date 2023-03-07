package C01_calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Q2_miniGrocery {

    static  String listMenu = "\n [1] Onion " +
            "\n [2] Potato " +
            "\n [3] Tomato " +
            "\n [4] Carrot " +
            "\n [5] Cucumber " +
            "\n [0] EXIT " +
            "\n";

    static String enterSelection = "Please enter how many kilos of Onion you want to buy : ";
    static String addedBasketText = "The item you selected has been added to your basket. Would you like to choose another item? Y/N";
    static String incorrectlyText = "You have entered incorrectly, please try again : ";
    static  int itemSelection;
    static  String answer = "";
    static List<Q2_miniGrocery_Cons> basket = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String star = "**********";


        System.out.println("\n" + star + " WELCOME TO OUR MINI GROCERY " + star +
                "\n-Please enter the number of the item you want to buy from the item list. " +
                "\n-Then enter how many kg you want to take from the item you have chosen. " +
                "\n-Press 0(zero) key to EXIT. " +
                "\n" +
                listMenu +
                "\n");

        System.out.println("Please enter the number of the item you want to buy : ");
        itemSelection = scan.nextInt();

        createItemSelection();
        System.out.println("\nITEMS IN YOUR BASKET : " + "\n" + basket );
        System.out.println("\nTOTAL AMOUNT YOU HAVE TO PAY = " + Q2_miniGrocery_Cons.totalFee + " TL");

    }
    public static void createItemSelection(){
        Scanner scan = new Scanner(System.in);

        ArrayList<String> itemNamesList = new ArrayList<>(Arrays.asList("Onion", "Potato", "Tomato", "Carrot", "Cucumber"));
        ArrayList<Double> priceList = new ArrayList<>(Arrays.asList(19.75, 9.75, 24.90, 19.90, 21.55));

        Q2_miniGrocery_Cons onion = new Q2_miniGrocery_Cons(itemNamesList.get(0), priceList.get(0));
        Q2_miniGrocery_Cons potato = new Q2_miniGrocery_Cons(itemNamesList.get(1), priceList.get(1));
        Q2_miniGrocery_Cons tomato = new Q2_miniGrocery_Cons(itemNamesList.get(2), priceList.get(2));
        Q2_miniGrocery_Cons carrot = new Q2_miniGrocery_Cons(itemNamesList.get(3), priceList.get(3));
        Q2_miniGrocery_Cons cucumber = new Q2_miniGrocery_Cons(itemNamesList.get(4), priceList.get(4));

        while (itemSelection != 0) {

            switch (itemSelection) {
                case 1: // ONION
                    System.out.println(itemNamesList.get(0) +
                            "\n" + enterSelection);
                    onion.kg = scan.nextDouble();
                    itemKgProcess(onion.kg, onion, basket);
                    break;

                case 2: // POTATO
                    System.out.println(itemNamesList.get(1) +
                            "\n" + enterSelection);
                    potato.kg = scan.nextDouble();
                    itemKgProcess(potato.kg, potato, basket);
                    break;

                case 3: //TOMATO
                    System.out.println(itemNamesList.get(2) +
                            "\n" + enterSelection);
                    tomato.kg = scan.nextDouble();
                    itemKgProcess(tomato.kg, tomato, basket);
                    break;

                case 4: // CARROT
                    System.out.println(itemNamesList.get(3) +
                            "\n" + enterSelection);
                    carrot.kg = scan.nextDouble();
                    itemKgProcess(carrot.kg, carrot, basket);
                    break;

                case 5: // CUCUMBER
                    System.out.println(itemNamesList.get(4) +
                            "\n" + enterSelection);
                    cucumber.kg = scan.nextDouble();
                    itemKgProcess(cucumber.kg, cucumber, basket);
                    break;

                default:
                    System.out.println(incorrectlyText);
                    itemSelection = scan.nextInt();

            }

        }

    }


    public static void itemKgProcess(double kg, Q2_miniGrocery_Cons obj, List<Q2_miniGrocery_Cons> basket){
        Scanner scan = new Scanner(System.in);

        if (obj.kg <= 0) {
            System.out.println(incorrectlyText);
            obj.kg = scan.nextInt();
        } else if (obj.kg > 0 && obj.kg < 1){
            obj.charge = obj.charge * obj.kg;
            basket.add(obj);
            Q2_miniGrocery_Cons.totalFee += obj.charge;

            System.out.println(addedBasketText);
            answer = scan.next().substring(0, 1);
            yesOrNo(answer);
            itemSelection = 0;
        } else if (obj.kg == 1) {
            basket.add(obj);
            Q2_miniGrocery_Cons.totalFee += obj.charge;

            System.out.println(addedBasketText);
            answer = scan.next();
            yesOrNo(answer);
            itemSelection = 0;
        } else {
            obj.charge = obj.kg * obj.charge;
            basket.add(obj);
            Q2_miniGrocery_Cons.totalFee += obj.charge;

            System.out.println(addedBasketText);
            answer = scan.next().substring(0, 1);
            yesOrNo(answer);
            itemSelection = 0;
        }
    }

    public static int yesOrNo(String str){
        Scanner scan = new Scanner(System.in);
        if (str.equalsIgnoreCase("Y")){
            System.out.println(listMenu + "\n" + enterSelection);
            itemSelection = scan.nextInt();
            createItemSelection();
        } else if (str.equalsIgnoreCase("N")){
            itemSelection = 0;
        } else {
            System.out.println(incorrectlyText);
            createItemSelection();
        }
        return itemSelection;
    }
}
