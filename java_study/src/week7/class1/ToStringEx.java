package week7.class1;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book("love", "prom");
        System.out.println(book);//toString overriding 안하면 week7.class1.Book@4617c264 출력
        String str1 = new String("Book2");
        System.out.println(str1);//객체의 주소값이 아닌 Book2가 출력되는 이유는 이미 재정의가 되어있기 때문이다.
    }
}
