package week7.class1;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x : " + x + ",y : " + y;
    }
}

class Circle implements Cloneable {
    Point point;
    private int radius;

    public Circle(int x, int y, int radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "point is " + this.point + ", radius = " + radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneEx {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 5);
        Circle cloneCircle = (Circle) circle.clone();
        System.out.println("===clone identityHashCode===");
        System.out.println(System.identityHashCode(circle));//인스턴스가 생겼는지 확인
        System.out.println(System.identityHashCode(cloneCircle));//다른 해시코드임으로 기존의 인스턴스 상태를 그대로 복제한 새로운 인스턴스가 생성되었음을 알 수 있음.
        System.out.println("===toString===");
        System.out.println(circle.toString());//결과값이 똑같다는 걸 통해 두 인스턴스의 상태가 그대로 복제되었음을 알 수 있음
        System.out.println(cloneCircle.toString());
    }
}
