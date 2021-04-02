package main.java.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 17:06
 * @Description: qiju
 */
public class ChessBoard {

    private Map<Integer,ChessPiece> map = new HashMap<>();

    public ChessBoard() {
        init();
    }

    public void init(){
        map.put(1,new ChessPiece(ChessPieceUnitFactory.getPiece(1),0,0));
        map.put(2,new ChessPiece(ChessPieceUnitFactory.getPiece(2),0,1));
    }
}
