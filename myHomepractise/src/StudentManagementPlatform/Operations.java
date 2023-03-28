package StudentManagementPlatform;

import java.util.ArrayList;
import java.util.Scanner;


public class Operations extends TcNoController {

    Scanner scan = new Scanner(System.in);
    StudentInfo student;
    int no = 1000;
    void menu(ArrayList<StudentInfo> studentList){
        System.out.println("\n======OPERATIONS======\n" +
                "\t 1-ADD STUDENT\n" +
                "\t 2-LIST STUDENTS\n" +
                "\t 3-SEARCH STUDENT\n" +
                "\t 4-DELETE STUDENT\n" +
                "\t Q-To EXIT SYSTEM\n" +
                "\n" +
                "\t CHOOSE OPERATION : ");

        String choise = scan.next().substring(0,1).toUpperCase();

        switch (choise){
            case "1":{
                add(studentList);
            }
            case "2":{
                list(studentList);
            }
            case "3":{
                search(studentList);
            }
            case "4":{
                delete(studentList);
            }
            case "Q":{
                System.out.println("See you :)...");
                System.exit(0);
            }
            default:{
                System.out.println("\nYOU'VE ENTERED INVALID VALUE, PLEASE TRY AGAIN!\n");
                menu(studentList);
            }
        }

    }

    private void delete(ArrayList<StudentInfo> studentList) {

        System.out.println("\nEnter the TC number of the student to be deleted : ");
        String deleteTcNo = scan.next();
        int flag = 0;

        for (int i = 0; i < studentList.size(); i++) {
            if (deleteTcNo.equals(studentList.get(i).getTcNo())){
                studentList.remove(i);
                flag = 1;
                System.out.println("\nThe student with this (" + deleteTcNo + ") Tc Number has been deleted.\n" +
                        "Latest version of the Student List : ");
                list(studentList);
            }
        }

        if (flag == 0){
            System.out.println("\nThere are no students matching the information you are looking for.");
        }

        menu(studentList);
    }

    private void search(ArrayList<StudentInfo> studentList) {

        System.out.println("\nTC Number to search : ");
        String searchTcNo = scan.next();
        int flag = 0;

        for (StudentInfo each: studentList) {
            if (searchTcNo.equals(each.getTcNo())){
                System.out.println("\nInformation of the student you are looking for : \n" + each);
                flag = 1;
            }
        }

        if (flag == 0){
            System.out.println("\nThere are no students matching the information you are looking for.");
        }

        menu(studentList);
    }

    private void list(ArrayList<StudentInfo> studentList) {
        for (StudentInfo each: studentList) {
            System.out.println(each);
        }

        menu(studentList);
    }

    private void add(ArrayList<StudentInfo> studentList) {

        scan.nextLine();
        System.out.println("\nEnter the student's name : ");
        String name = scan.nextLine();
        System.out.println("\nEnter the student's surname : ");
        String surName = scan.nextLine();
        System.out.println("\nEnter the student's TC Number : ");
        String tcNo = scan.next();
        while (!checkNumber(tcNo)){
            System.out.println("You've entered wrong TC Number, please try again : ");
            tcNo = scan.next();
        }

        System.out.println("\nEnter the student's age : ");
        int age = scan.nextInt();
        System.out.println("\nEnter the studet's class no : ");
        int classNumber = scan.nextInt();

        student = new StudentInfo(name, surName, tcNo, age, no++, classNumber);
        studentList.add(student);
        System.out.println("The student whose information you entered has been added to the list. \n" +
                "Here is the latest version of Student List : ");
        list(studentList);

    }
}
