package student;

public class ReferenceTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.name = "이순신";
		System.out.println(studentLee); //주소값이 나온다.
		
	}
}
