package main.java.behavior.Iterator;

import java.util.LinkedList;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/25 15:03
 * @Description:
 */
public class LinkedIterator<E> implements Iterator{

    private int cursor;
    private LinkedList<E> list;

    public LinkedIterator(LinkedList<E> list) {
        this.cursor = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.cursor != list.size();
    }

    @Override
    public E next() {
        cursor++;
        return this.list.get(cursor);
    }

    @Override
    public E currItem() {
        return this.list.get(cursor);
    }

    @Override
    public void remove() {

    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator iterator = new LinkedIterator(list);
        while (iterator.hasNext()){
            System.out.println(iterator.currItem());
            iterator.next();
        }
    }
}
