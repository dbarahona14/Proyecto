package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeType;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * Created by Freyja on 29-08-2017.
 */
public class TestWord extends Application{

    private Group root;

    public static void main(String[] args) throws Exception { launch(args); }
    @Override public void start(final Stage stage) throws Exception {
        this.root = new Group();

        Pane l= getUpL();
        l.setLayoutX(200);
        l.setLayoutY(200);
        root.getChildren().add(l);



        stage.setTitle("Test Word");
        stage.setScene(new Scene( root, 800, 500, Color.LIGHTGRAY));
        stage.show();
    }

    public Pane getUpL(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(30,160,-10,130,10,270,90,15);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,160,50,200,70,150,90,170);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);

        return letter;
    }

}
