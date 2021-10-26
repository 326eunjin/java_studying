package week7.class1;

public class hashCodeEx {
    public static void main(String[] args) {
        String str1 = new String("Test1");
        String str2 = new String("Test1");
        Student student1 = new Student(1001, "Jang");
        Student student2 = new Student(1001, "Jang");
        System.out.println("===stduent1 student2 hashCode() funtion===");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println("===stduent1 student2 identityHashCode() funtion===");
        System.out.println(System.identityHashCode(student1));
        System.out.println(System.identityHashCode(student2));
        System.out.println("===str1 str2 hashCode() funtion===");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());//힙 메모리 주소가 다른데 왜 해시값이 같냐면 재정의되어있기때문이다.
        System.out.println("===str1 str2 identityHashCode() funtion===");
        System.out.println(System.identityHashCode(str1));//이렇게 원래의 해시값을 찾을 수 있음
        System.out.println(System.identityHashCode(str2));
    }
}
