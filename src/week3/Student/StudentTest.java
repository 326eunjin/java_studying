package week3.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이순신");
        System.out.println(Student.getSerialNum());
        System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");
        System.out.println(Student.getSerialNum());
        System.out.println(studentSon.studentName + " 학번:" + studentLee.studentID);
    }
}