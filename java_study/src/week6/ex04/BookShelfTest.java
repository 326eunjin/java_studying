package week6.ex04;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("태백 산맥 1");
        shelfQueue.enQueue("태백 산맥 2");
        shelfQueue.enQueue("태백 산맥 3");
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
