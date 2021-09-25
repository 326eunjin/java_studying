package week4.Customer;

class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected int bonusPoint;
	protected int price;
	protected int customerService = 0;
	protected int num=30;
	Customer(String name){
		this.name=name;
		this.grade="SILVER";
	}
	Customer(int id,String name){
		this.id=id;
		this.name=name;
		this.grade="SILVER";
	}
	int calcPrice(int price){
		this.bonusPoint += (price * 0.01);
		this.price=price;
		return (this.price);
	}
	String showCustomerInfo(){
		String ret;
		ret = (name+"님의 등급은 "+grade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
		if (customerService != 0)
			ret+="당담 상담원 번호는 "+customerService+"입니다.";
		return ret;
	}
	String showCalInfo()
	{
		return (name+" 님이 "+price+"원 지불하셨습니다.\n"+name+"님의 현재 보너스 포인트는 "+bonusPoint+"점입니다.");

	}
}
class GOLDCustomer extends Customer{
	GOLDCustomer (String name){
		super(name);
		super.grade="GOLD";
	}
	GOLDCustomer(int id,String name)
	{
		super(id,name);
		super.grade="GOLD";
	}
	@Override
	int calcPrice(int price)
	{
		this.bonusPoint += (price * 0.02);
		this.price=(int)(price - price * 0.1);
		return (this.price);
	}
}
class VIPCustomer extends Customer{
	int num=40;
	VIPCustomer (String name){
		super(name);
		super.grade="VIP";
		super.customerService = 12345;
	}
	VIPCustomer(int id,String name){
		super(id,name);
		super.grade="VIP";
	}
	@Override
	int calcPrice(int price){
		this.bonusPoint += (price * 0.05);
		this.price=(int)(price - price * 0.1);
		return (this.price);
	}
}
