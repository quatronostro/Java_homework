package StudentManagementPlatform;

public class StudentInfo {

    private String name;
    private String sName;
    private String tcNo;
    private int age;
    private int number;
    private int classNumber;

    public StudentInfo() {
    }

    public StudentInfo(String name, String sName, String tcNo, int age, int number, int classNumber) {
        this.name = name;
        this.sName = sName;
        this.tcNo = tcNo;
        this.age = age;
        this.number = number;
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return  "name='" + name + " " +
                "sName='" + sName + " " +
                "tcNo='" + tcNo + " " +
                "age=" + age + " " +
                "number=" + number + " " +
                "classNumber=" + classNumber ;
    }
}
