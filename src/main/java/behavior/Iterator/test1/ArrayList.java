package main.java.behavior.Iterator.test1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/25 16:33
 * @Description:
 */
public class ArrayList<E> {

    transient Object[] elementData = new Object[10];

    private int size;
    private int modCount;

    public ArrayList() {
        this.modCount = 0;
        this.size = 0;
    }

    public E remove(int index) {
        rangeCheck(index);

        modCount++;
        E oldValue = elementData(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                    numMoved);
        elementData[--size] = null; // clear to let GC do its work

        return oldValue;
    }

    public void add(E e){
        elementData[size] = e;
        size++;
    }

    public E elementData(int index){
        return (E) elementData[index];
    }

    private Iterator iterator(){
        return new Itr();
    }


    //范围边界检查
    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }


    class Itr implements Iterator{

        private int exceptedModCount;
        private int cursor;
        private int lateRet = -1;


        @Override
        public boolean hasNext() {
            return cursor !=size;
        }

        @Override
        public E next() {
            //检查 数组元素是否有修改
            checkForComodification();
            int i = cursor;
            if(i >= size)
                throw new NoSuchElementException();
            Object[] elementData = ArrayList.this.elementData;
            if(i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i+1;
            return (E) elementData[lateRet = i];

        }

        @Override
        public Object currItem() {
            return elementData(this.cursor);
        }
        public void remove(){
            if(lateRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            ArrayList.this.remove(lateRet);
            cursor = lateRet;
            lateRet = -1;
            exceptedModCount = modCount;
        }

        public void checkForComodification(){
            if(this.exceptedModCount!=modCount)
            throw new ConcurrentModificationException("is modificated....");
        }
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        System.out.println(list);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.currItem());
//            iterator.next();
//        }
//
//    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        Iterator iterator = list.iterator();
        iterator.next();
        iterator.remove();
        iterator.remove();
        System.out.println();
        System.out.println(list);
    }
}
