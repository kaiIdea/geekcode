package main.java.behavior.Iterator.test1;

import java.util.ArrayList;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/25 14:06
 * @Description:
 */
public class ArrayIterator<E> implements Iterator{

    private int cursor;
    private ArrayList<E> arrayList;

    private int exceptedModCount;

    public ArrayIterator(ArrayList arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        //下标值不等于集合元素大小时，代表还未遍历完
        return this.cursor != arrayList.size();
    }

    @Override
    public E next() {
        cursor++;
        return this.arrayList.get(cursor);
    }

    @Override
    public E currItem() {
        return this.arrayList.get(this.cursor);
    }

    @Override
    public void remove() {

    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = new ArrayIterator<String>(list);
        while (iterator.hasNext()){
            System.out.println(iterator.currItem());
            iterator.next();
        }
    }
}
