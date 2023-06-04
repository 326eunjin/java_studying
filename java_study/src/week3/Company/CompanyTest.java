package week3.Company;

public class CompanyTest {
    public static void main(String[] args){
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();

        //Company company = new Company();//error
        System.out.println(myCompany1 == myCompany2);
    }
}
