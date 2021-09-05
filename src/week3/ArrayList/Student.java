package week3.ArrayList;
import java.util.ArrayList;
public class Student {
    int studentID;
    String name;
    int total = 0;
    ArrayList<Subject> arrayList = new ArrayList<Subject>();
    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    public void addSubject(String subject, int score){
        arrayList.add(new Subject(subject,score));
    }

    public void showStudentInfo(){
        for(int i= 0; i<arrayList.size(); i++){
            System.out.print("학생 "+name+"의 ");
            arrayList.get(i).showInfo();
            total += arrayList.get(i).score;
        }
        System.out.println("학생 "+name+"의 총점은 "+total + "입니학.");
    }
}
