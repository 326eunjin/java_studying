package person;

public class Person {

	String	name;
	int		age;
	String	gender;
	String	married;
	int		child;
	
	Person() {	
	}
	
	Person(String name) {
		this.name = name;
	}
	
	void	getInfo(int age, String gender, String married, int child) {
		this.age = age;
		this.gender = gender;
		this.married = married;
		this.child = child;
	}
	
	void	printInfo() { 
		System.out.println("이름은 " + this.name + "이고, 나이는 " + this.age + "입니다.");
		System.out.println("성별은 " + this.gender + "이며, " + this.married + "입니다. 자녀는 " + this.child + "명이 있습니다.");		
	}
}
