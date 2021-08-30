package person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person Per1 = new Person("제인");
		Per1.getInfo(30, "여성", "기혼자", 1);
		Per1.printInfo();

	
		Person Per2 = new Person("길동");
		Per2.getInfo(20, "남성", "미혼자", 0);
		Per2.printInfo();
		
		Person Per3	= new Person();
		Per3.getInfo(0, "남성", "미혼자", 0);
		Per3.printInfo();
	}

}
