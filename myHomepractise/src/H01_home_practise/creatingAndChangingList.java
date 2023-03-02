import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class odev01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int getIndex;
        int setIndex;
        String yesOrNo = "";
        boolean flag = false;

        List<Integer> sonHali = new ArrayList<>(creatingList());

        System.out.println(sonHali);

        System.out.println("Do you want to change elements in your list? " +
                "\nIf your answer yes, please press 'Y'" +
                "\nIf your answer no, please press 'N'");
        yesOrNo = scan.next().substring(0, 1);

        if (Pattern.matches("[yY]", yesOrNo)){
            System.out.println("Please enter index number you want to change : ");
            getIndex = scan.nextInt();
            System.out.println("Please enter your new element you want to enter : ");
            setIndex = scan.nextInt();
            System.out.println(changeListElement(sonHali, getIndex, setIndex));

        } else if (Pattern.matches("[nN]", yesOrNo)) {
            System.out.println(sonHali);
        }





    }
    public static List<Integer> creatingList(){

        List<Integer> numbersList = new ArrayList<>();
        String enteredNumStr = "";
        int enteredNum = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Please enter numbers for create your list. " +
                    "\nIf you want to quit please press 'Q' ");
            enteredNumStr = scan.next();

            if (!Pattern.matches("[qQ]", enteredNumStr)){
                enteredNum = Integer.parseInt(enteredNumStr);
                numbersList.add(enteredNum);
            }
        } while (!Pattern.matches("[qQ]", enteredNumStr));

        return numbersList;
    }

    public static List<Integer> changeListElement(List<Integer> list, int x, int y){

        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);

        return list;

    }
}
