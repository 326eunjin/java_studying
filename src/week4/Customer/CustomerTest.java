package week4.Customer;
import java.util.ArrayList;
// public class CustomerTest {
// 	public static void main(String[] args) {
// 		Customer customerLee = new Customer(10010, "이순신");
// 		customerLee.bonusPoint = 1000;
// 		System.out.println(customerLee.showCustomerInfo());
// 		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
// 		customerKim.bonusPoint = 10000;
// 		System.out.println(customerKim.showCustomerInfo());
// 	}
// }

// public class CustomerTest {
// 	public static void main(String[] args) {
// 		Customer customerLee = new Customer(10010, "이순신");
// 		customerLee.bonusPoint = 1000;
// 		System.out.println(customerLee.showCustomerInfo());
// 		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
// 		customerKim.bonusPoint = 10000;
// 		System.out.println(customerKim.showCustomerInfo());
// 		int priceLee = customerLee.calcPrice(10000);
// 		int priceKim = customerKim.calcPrice(10000);
// 		System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
// 		System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
// 		Customer customerNo = new VIPCustomer(10030, "나몰라");
// 		customerNo.bonusPoint = 10000;
// 		int priceNo = customerNo.calcPrice(10000);
// 		System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo + "원 입니다.");
// 	}
// 
public class CustomerTest{
	public static void main(String[] args){
		Customer customerLee = new Customer("이순신");
		Customer customerShin = new Customer("신사임당");
		GOLDCustomer customerHong = new GOLDCustomer("홍길동");
		GOLDCustomer customerLee2 = new GOLDCustomer("이율곡");	
		VIPCustomer customerKim = new VIPCustomer("김유신");
		System.out.println(customerKim.num);
		ArrayList <Customer> customerList=new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerLee2);
		customerList.add(customerKim);
		System.out.println("======고객 정보 출력======");
		for(Customer customer:customerList){
			System.out.println(customer.showCustomerInfo());
		}
		
		for(Customer customer:customerList){
			customer.calcPrice(10000);
		}
		System.out.println("======할인율과 보너스 포인트 계산======");
		for(Customer customer:customerList){
			System.out.println(customer.showCalInfo());
		}
	}
}