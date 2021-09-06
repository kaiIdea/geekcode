package main.java.behavior.Iterator.test2;

/**
 * @Auther: GEEX1428
 * @Date: 2021/9/6 14:11
 * @Description:迭代器类
 */
public class BookSelfIterator implements Iterator{

    private BookSelf bookSelf;
    private int index;


    public BookSelfIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookSelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookSelf.getBook(index);
        index++;
        return book;
    }
}
