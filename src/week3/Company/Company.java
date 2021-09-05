package week3.Company;

public class Company {
    private static Company one;
    private Company(){
    }

    public static Company getInstance(){
        if (one == null){
            one = new Company();
        }
        return one;
    }
}
