package student;

public class Student {

	int		id;
	String	name;
	int		grade;
	
	void	getInfo(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	void	printInfo() {
		System.out.println("학번 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.grade + "학년");
	}
}