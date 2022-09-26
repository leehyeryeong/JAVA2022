public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    } //end of Book

    public Book(String title) { //춘향전이 들어옴
        this(title, "작자미상");
    } //end of Book

    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    } //end of Book

    void show() {
        System.out.println(title+" "+author);
    } //end of show

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        littlePrince.show();
        loveStory.show();
        emptyBook.show();
    } //end of main

} //end of class