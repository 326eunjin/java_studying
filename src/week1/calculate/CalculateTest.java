package calculate;

public class CalculateTest {

	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		cal.a = 2;
		cal.b = 4;
		
		System.out.println(cal.plus());
		System.out.println(cal.minus());
		System.out.println(cal.times());
		System.out.println(cal.divide());

	}

}
