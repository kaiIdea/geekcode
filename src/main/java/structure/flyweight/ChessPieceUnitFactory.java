package main.java.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 17:18
 * @Description:
 */
public class ChessPieceUnitFactory {

    private static final Map<Integer,ChessPieceUnit> map = new HashMap<>();

    static {
        map.put(1,new ChessPieceUnit(1,"ju",Color.BLACK));
        map.put(2,new ChessPieceUnit(2,"ma",Color.RED));
    }

    public static ChessPieceUnit getPiece(Integer id){
        return map.get(id);
    }


}
