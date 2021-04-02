package main.java.structure.flyweight;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/1 17:18
 * @Description:
 */
public class ChessPieceUnit {

    private Integer id;
    private String text;
    private Color color;

    public ChessPieceUnit(Integer id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }
}
