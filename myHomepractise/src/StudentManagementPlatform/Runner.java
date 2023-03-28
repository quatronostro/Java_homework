package StudentManagementPlatform;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<StudentInfo> studentList = new ArrayList<>();

        StudentInfo student1 = new StudentInfo("Berke", "Baramuk", "111111", 29, 319, 1);
        studentList.add(student1);
        StudentInfo student2 = new StudentInfo("Berke", "Baramuk", "222222", 30, 319, 1);
        studentList.add(student2);
        StudentInfo student3 = new StudentInfo("Berke", "Baramuk", "333333", 25, 319, 1);
        studentList.add(student3);

        Operations op = new Operations();
        op.menu(studentList);


    }

}
