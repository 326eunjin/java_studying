package week7.generics;

public class Powder extends Material {
    public String toString() {
        return "재료는 Powder 입니다";
    }

    @Override
    public void doPrinting() {
        System.out.println("print using powder");
    }
}
