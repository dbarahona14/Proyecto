package sample;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * Created by dBarahona14 on 29-08-2017.
 */
public class Symbol {
    private final int width;
    private final int height;

    private final Character character;

    public Symbol( Character character,int width, int height) {
        this.width = width;
        this.height = height;
        this.character = character;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Character getCharacter() {
        return character;
    }
}
