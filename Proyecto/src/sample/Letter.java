package sample;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * Created by dBarahona14 on 29-08-2017.
 */
public class Letter {
    private int centerPointX;
    private int centerPointY;
    private Pane container;

    private Character character;

    public Letter(int centerPointX, int centerPointY, Character character) {
        this.centerPointX = centerPointX;
        this.centerPointY = centerPointY;
        this.character = character;
        this.container= new Pane();

    }

    public Pane getContainer(){
        return this.container;
    }

    public int getCenterPointX() {
        return centerPointX;
    }

    public void setCenterPointX(int centerPointX) {
        this.centerPointX = centerPointX;
    }

    public int getCenterPointY() {
        return centerPointY;
    }

    public void setCenterPointY(int centerPointY) {
        this.centerPointY = centerPointY;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
