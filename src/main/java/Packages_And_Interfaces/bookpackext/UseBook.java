
// Данный класс принадлежит пакету bookpackext
package Packages_And_Interfaces.bookpackext;

import Packages_And_Interfaces.bookpack.Book;

//  Использовать класс Book из пакета bookpack
public class UseBook {
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2011);
        books[1] = new Book("Java: The Complete Reference", "Schildt", 20011);
        books[2] = new Book("The Art of Java", "Schildt and Holmes", 2003);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road","Kerouac",1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
