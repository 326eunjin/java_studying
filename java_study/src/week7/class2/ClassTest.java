package week7.class2;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());//week7.class2.Person
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());
        Class pClass3 = Class.forName("week7.class2.Person");//해당 문자열?로 표현한 클래스가 없으면 에러가 발생
        System.out.println(pClass3.getName());
    }
}
