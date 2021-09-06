package main.java.behavior.Iterator.test2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/6 14:23
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf(10);
        bookSelf.append("pingfan");
        bookSelf.append("santi");
        bookSelf.append("gangtie");

        Iterator iterator = bookSelf.createIterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }
}
