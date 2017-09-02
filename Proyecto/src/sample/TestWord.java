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
 * Created by dBarahona14 on 29-08-2017.
 */
public class TestWord extends Application{

    private Group root;

    public static void main(String[] args) throws Exception { launch(args); }
    @Override public void start(final Stage stage) throws Exception {
        this.root = new Group();

        Pane b1= getUpe();
        Pane a = getUpA();
        Pane aMin = getUpa();
        Pane b = getUpc();
        b1.setLayoutX(150);
        b1.setLayoutY(50);
        a.setLayoutX(50);
        a.setLayoutY(50);
        aMin.setLayoutX(250);
        aMin.setLayoutY(50);
        b.setLayoutX(350);
        b.setLayoutY(50);

        root.getChildren().addAll(a, b, aMin, b1);



        stage.setTitle("Test Word");
        stage.setScene(new Scene( root, 800, 500, Color.LIGHTGRAY));
        stage.show();
    }

    public Pane getUpL(){
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

    public Pane getUpA(){


        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(60,5,40,50,25,90,0,132);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(60,5,65,60,40,190,100,115);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3 = new CubicCurve(35,66,40,66,50,66,60,66);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1, curve2, curve3);

        return letter;



    }

    public Pane getUpa(){
        Pane letter= new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(45,66,-15,60,-10,180,45,110);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(45,66,45,120,55,160,100,115);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);


        return letter;
    }

    public Pane getUpb(){
        Pane letter= new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(0,115,25,90,85,5,40,0);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(40,0,15,5,10,170,60,130);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(60,130,64,125,68,120,70,113);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        CubicCurve curve4= new CubicCurve(70,113,77,120,84,120,100,115);

        curve4.setStroke(Color.FORESTGREEN);
        curve4.setStrokeWidth(4);
        curve4.setStrokeLineCap(StrokeLineCap.ROUND);
        curve4.setFill(null);
        curve4.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3, curve4);


        return letter;
    }

    public Pane getUpB(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,15,50,0,120,10,55,55);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(40,20,35,120,5,155,70,125);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(55,55,120,60,95,115,70,125);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1, curve2, curve3);

        return letter;
    }

    public Pane getUpC(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(80,30,-25,-25,-20,220,100,115);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        letter.getChildren().addAll(curve1);

        return letter;
    }

    public Pane getUpc(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(75,75,20,25,0,195,100,115);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(0,115,20,95,30,90,35,80);


        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1, curve2);

        return letter;
    }

    public Pane getUpd(){
        Pane letter= new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(45,66,-15,60,-10,180,45,110);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(45,66,45,120,55,160,100,115);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3 = new CubicCurve(45,66,45,70,40,10,60,10);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpD(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(40,33,40,70,40,125,40,132);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(20,25,90,10,150,125,40,132);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);

        return letter;
    }

    public Pane getUpE(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(25,10,28,40,0,190,100,115);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(10,15,30,0,75,30,90,5);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(10,70,40,50,60,80,80,60);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);

        return letter;
    }

    public Pane getUpe(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(75,75,20,25,0,195,100,115);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(0,115,20,95,30,90,35,80);


        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(75,75,61,97,48,99,30,100);


        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1, curve2, curve3);

        return letter;
    }

}
