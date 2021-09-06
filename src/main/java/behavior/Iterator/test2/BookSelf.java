package main.java.behavior.Iterator.test2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/6 14:10
 * @Description:
 */
public class BookSelf implements Aggregate {

    private Book[] books;
    private int last;


    public BookSelf(int size) {
        this.books = new Book[size];
        this.last = 0;
    }

    @Override
    public Iterator createIterator() {
        return new BookSelfIterator(this);
    }
    public int getLength(){
        return last;
    }

    public Book getBook(int index){
        return books[index];
    }
    public void append(String bookName){
        this.books[last] = new Book(bookName);
        last++;
    }
}
