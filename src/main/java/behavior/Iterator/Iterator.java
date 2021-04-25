package main.java.behavior.Iterator;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/25 14:04
 * @Description:
 */
public interface Iterator<E>{

    //边界判断
    public boolean hasNext();
    //计算下一个元素下标
    E next();
    //返回当前元素
    E currItem();

    public void remove();
}
