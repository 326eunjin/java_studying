package week7.class2;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!");
        System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));//append 이후에도 주소값 그대로
        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));//새로운 객체를 가리키기 때문에 주소값 변경됨
    }
}
