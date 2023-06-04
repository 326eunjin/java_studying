package week7.class1;

class Student {
    int StudentID;
    String StudentName;

    public Student(int StudentID, String StudentName) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.StudentID == std.StudentID)
                return true;
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return StudentID;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        String str1 = new String("Test1");
        String str2 = new String("Test1");
        System.out.println(str1 == str2);//메모리 주소가 다르므로 false
        System.out.println(str1.equals(str2));//두 문자열이 동일하니 true 논리적인 개념으로 접근

        Student student1 = new Student(1001, "Jang");
        Student student2 = new Student(1001, "Jang");
        System.out.println(student1 == student2);//주소값 다르니 false
        System.out.println(student1.equals(student2));//원래대로면 주소값을 비교하니 false 그러나, 논리적인 개념으로 동일하다고 판단하기 위해 재정의해줌.
    }
}
