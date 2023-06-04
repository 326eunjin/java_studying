package week7.generics;

public class ThreeDPrinter<T extends Material> {//이렇게 하면 Material 상속받은 클래스만 T로 들어갈 수 있음. 즉 구분을 넣어두는 것!
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    public void Printing() {
        material.doPrinting();
    }
}
