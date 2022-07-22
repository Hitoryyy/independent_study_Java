
//  Объявление защищёнными переменных экземпляра в классе Book
package Packages_And_Interfaces.bookpack_1;

public class Book {
    //  При объявлении этих переменных использован
    //  модификатор доступа protected
    protected String title;
    protected String author;
    protected int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}
