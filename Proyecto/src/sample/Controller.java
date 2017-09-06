package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    private @FXML TextField inputText;
    private @FXML Group groupA;
    private @FXML Button writeBtn;
    private @FXML ScrollPane scroll;
    private @FXML Rectangle rect;
    public ArrayList<Symbol> symbols;

    public void getText(){
        System.out.println(this.inputText);

    }

    public void clearGroup(){
        ArrayList<Node> nodes= new ArrayList<>();
        for(Node n:this.groupA.getChildren()){
            if(n instanceof Rectangle){

            }else{
                nodes.add(n);
            }
        }
        if(nodes.size()>0){
            for(Node ni:nodes){
                this.groupA.getChildren().remove(ni);
            }
        }
    }

    public void autohideAlert(String title, int wait){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(title);
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(wait);
                if (alert.isShowing()) {
                    Platform.runLater(() -> alert.close());
                }
            } catch (Exception exp) {
                exp.printStackTrace();
            }
        });
        thread.setDaemon(true);
        thread.start();
        Optional<ButtonType> result = alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.writeBtn.setOnMouseClicked(e->{
            this.clearGroup();
            String input= this.inputText.getText();
            System.out.println("input="+input);
            if(input!=null&&!input.equals("")){
                ArrayList<Pane> panes= this.getPwithSting(input);
                double x=0, y=0;
                for(Pane pane:panes){
                    pane.setStyle("-fx-background-color: blueviolet;");
                    pane.toFront();
                    pane.setLayoutY(y);
                    pane.setLayoutX(x);
                    this.groupA.getChildren().addAll(pane);
                    pane.toFront();
                    System.out.println("x="+x);
                    System.out.println("I add");
                    x= x+pane.getMaxWidth();
                }
            }else{
                autohideAlert("¡No ha ingresado texto!",3000);
            }
            }
        );

    }

    public ArrayList<Pane> getPwithSting(String string){
        if(string==null) {
            return null;
        }else {
            ArrayList<Pane> panes= new ArrayList<>();
            for (Character character:string.toCharArray()){
                panes.add(this.getPwihtChar(character));

            }
            return panes;
        }
    }

    public Pane getPwihtChar(Character character){
        if(character.equals('a')){
            return this.getUpa();
        } if(character.equals('A')){
            return this.getUpA();
        } if(character.equals('b')){
            return this.getUpb();
        } if(character.equals('B')){
//complete
        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        } if(character.equals('A')){

        }
        return null;// retornar algo por si no existe
    }

    public Pane getUpL(){
        Pane letter= new Pane();
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
        CubicCurve curve1= new CubicCurve(30,33,30,70,30,125,30,132);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(10,25,80,10,140,125,30,132);

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

    public Pane getUpF(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(25,10,25,40,25,80,25,132);


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


    public Pane getUpf(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(100,55,0,0,90,210,20,190);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(40,115,65,90,85,125,100,115);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(0,115,25,95,40,90,50,75);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);

        return letter;
    }

    public Pane getUpH(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(5,10,20,15,30,15,40,10);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(40,10,40,60,50,170,25,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(25,150,-5,65,120,50,90,10);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        CubicCurve curve4= new CubicCurve(90,10,70,5,70,170,100,148);

        curve4.setStroke(Color.FORESTGREEN);
        curve4.setStrokeWidth(4);
        curve4.setStrokeLineCap(StrokeLineCap.ROUND);
        curve4.setFill(null);
        curve4.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3, curve4);

        return letter;
    }

    public Pane getUpI() {
        Pane letter = new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100, 200);
        letter.setMaxSize(100, 200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1 = new CubicCurve(20, 10, 55, 15, 70, 15, 80, 10);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2 = new CubicCurve(80, 10, 80, 90, 95, 180, 25, 125);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);

        return letter;
    }

    public Pane getUpZ() {
        Pane letter = new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100, 200);
        letter.setMaxSize(100, 200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1 = new CubicCurve(20, 30, 80, 0, 130, 66, 50, 110);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2 = new CubicCurve(50, 110, 190, 240, -30, 180, 100, 148);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);

        return letter;
    }

    public Pane getUpX() {
        Pane letter = new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100, 200);
        letter.setMaxSize(100, 200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1 = new CubicCurve(20, 30, 80, 0, 25, 180, 100, 148);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2 = new CubicCurve(85, 30, 70, 55, 50, 100, 20, 150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);

        return letter;
    }
}
