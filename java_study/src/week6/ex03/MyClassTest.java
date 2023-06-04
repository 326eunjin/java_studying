package week6.ex03;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();
        X xClass = mClass;
        //xClass.myMethod();
        xClass.x();
        Y yClass = mClass;
        yClass.y();
        MyInterface iClass = mClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
