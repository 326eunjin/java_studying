package week3.Array;

public class Book {
    String author;
    String bookName;

    public Book(String author, String bookName){
        this.author = author;
        this.bookName = bookName;
    }

    public void showBookInfo(){
        System.out.println(this.bookName+","+this.author);
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setter(String author, String bookName)
    {
        this.author=author;
        this.bookName=bookName;
    }
}
