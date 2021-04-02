package main.java.structure.flyweight;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 17:05
 * @Description: qizi
 */
public class ChessPiece {

    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit chessPieceUnit, int positionX, int positionY) {
        this.chessPieceUnit = chessPieceUnit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
