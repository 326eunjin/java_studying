package week7.class2;

public class StringTest {
    public static void main(String[] args){
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//        System.out.println("===create new instance===");
//        System.out.println(str1 == str2);
//        String str3 = "abc";
//        String str4 = "abc";
//        System.out.println("===constant pool string===");
//        System.out.println(str3==str4);
        String str1 = new String("Android");
        String str2= new String("Java");
        str2 = str1.concat(str2);
        System.out.println(str2);//AndroidJava
    }
}
