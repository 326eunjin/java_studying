package week3.Student;

public class Student {
    static int studentID = 1000;
    String studentName;

    Student() {
        this.studentID++;
    }

    public void setStudentName(String name)
    {
        this.studentName=name;
    }
    public static int getSerialNum() {
        return studentID;
    }
}
