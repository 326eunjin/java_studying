package week7.generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
        printerPowder.setMaterial(new Powder());
        Powder powder = printerPowder.getMaterial();
        System.out.println(printerPowder);
        printerPowder.Printing();
        ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
        Plastic plastic = printerPlastic.getMaterial();
        printerPlastic.setMaterial(new Plastic());
        System.out.println(printerPlastic);
    }
}
