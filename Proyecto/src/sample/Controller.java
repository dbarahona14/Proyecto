package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

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
                panes.add(this.getPwithChar(character));

            }
            return panes;
        }
    }

    public Pane getPwithChar(Character character){
        if(character.equals('a')){
            return this.getUpa();
        } if(character.equals('A')){
            return this.getUpA();
        } if(character.equals('b')){
            return this.getUpb();
        } if(character.equals('B')){
            return this.getUpB();
        } if(character.equals('C')){
            return this.getUpC();
        } if(character.equals('c')){
            return this.getUpc();
        } if(character.equals('D')) {
            return this.getUpD();
        } if(character.equals('d')){
            return this.getUpd();
        } if(character.equals('E')){
            return this.getUpE();
        } if(character.equals('e')){
            return this.getUpe();
        } if(character.equals('F')){
            return this.getUpF();
        } if(character.equals('f')){
            return this.getUpf();
        } if(character.equals('G')){
            return this.getUpG();
        } if(character.equals('g')){
            return this.getUpg();
        } if(character.equals('H')){
            return this.getUpH();
        } if(character.equals('h')){
            return this.getUph();
        } if(character.equals('I')){
            return this.getUpI();
        } if(character.equals('i')){
            return this.getUpi();
        } if(character.equals('J')){
            return this.getUpJ();
        } if(character.equals('j')){
            return this.getUpj();
        } if(character.equals('K')){
            return this.getUpK();
        } if(character.equals('k')){
            return this.getUpk();
        } if(character.equals('L')){
            return this.getUpL();
        } if(character.equals('l')){
            return this.getUpl();
        } if(character.equals('M')){
            return this.getUpM();
        } if(character.equals('m')){
            return this.getUpm();
        } if(character.equals('N')){
            return this.getUpN();
        } if(character.equals('n')){
            return this.getUpn();
        } if(character.equals('Ñ')){
            return this.getUpEnie();
        } if(character.equals('ñ')){
            return this.getDownEnie();
        } if(character.equals('O')){
            return this.getUpO();
        } if(character.equals('o')){
            return this.getUpo();
        } if(character.equals('P')){
            return this.getUpP();
        } if(character.equals('p')){
            return this.getUpp();
        } if(character.equals('Q')){
            return this.getUpQ();
        } if(character.equals('q')){
            return this.getUpq();
        } if(character.equals('R')){
            return this.getUpR();
        } if(character.equals('r')){
            return this.getUpr();
        } if(character.equals('S')){
            return this.getUpS();
        } if(character.equals('s')){
            return this.getUps();
        } if(character.equals('T')){
            return this.getUpT();
        } if(character.equals('t')){
            return this.getUpt();
        } if(character.equals('U')){
            return this.getUpU();
        } if(character.equals('u')){
            return this.getUpu();
        } if(character.equals('V')){
            return this.getUpV();
        } if(character.equals('v')){
            return this.getUpv();
        } if(character.equals('W')){
            return this.getUpW();
        } if(character.equals('w')){
            return this.getUpw();
        } if(character.equals('X')){
            return this.getUpX();
        } if(character.equals('x')){
            return this.getUpx();
        } if(character.equals('Y')){
            return this.getUpY();
        } if(character.equals('y')){
            return this.getUpy();
        } if(character.equals('Z')){
            return this.getUpz();
        } if(character.equals('z')){
            return this.getUpz();
        } if(character.equals('¿')){
            return this.getUPPreguntaOpen();
        } if(character.equals('?')){
            return this.getUPPreguntaClose();
        } if(character.equals('¡')){
            return this.getUpExOpen();
        } if(character.equals('!')){
            return this.getUpExClose();
        }
        return this.getUpUnknown();
    }

    private CubicCurve configurarCurva(CubicCurve c){
        c.setStroke(Color.FORESTGREEN);
        c.setStrokeWidth(4);
        c.setStrokeLineCap(StrokeLineCap.ROUND);
        c.setFill(null);
        c.setFocusTraversable(false);
        return c;
    }

    public Pane getUpL(){
        Pane letter= new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(30,160,-10,130,10,270,90,15);
        curve1 = this.configurarCurva(curve1);

        CubicCurve curve2= new CubicCurve(30,160,50,200,70,150,90,170);

        curve2 = this.configurarCurva(curve2);

        letter.getChildren().addAll(curve1,curve2);
        return letter;
    }

    public Pane getUpA(){
        Pane letter= new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(60,5,40,50,25,90,0,132);
        curve1 = this.configurarCurva(curve1);

        CubicCurve curve2= new CubicCurve(60,5,65,60,40,190,100,115);
        curve2 = this.configurarCurva(curve2);

        CubicCurve curve3 = new CubicCurve(35,66,40,66,50,66,60,66);
        curve3 = this.configurarCurva(curve3);

        letter.getChildren().addAll(curve1, curve2, curve3);
        return letter;
    }

    public Pane getUpa(){
        Pane letter= new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(45,66,-15,60,-10,180,45,110);
        curve1 = this.configurarCurva(curve1);

        CubicCurve curve2= new CubicCurve(45,66,45,120,55,160,100,115);
        curve2 = this.configurarCurva(curve2);

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
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(80,30,-25,-25,-20,220,100,115);
        curve1 = this.configurarCurva(curve1);

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

    public Pane getUpg(){
        Pane letter =new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,40,150,25,100,50,100);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(50,100,90,110,40,170,30,125);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(65,120,75,270,-5,170,85,148);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);


        letter.getChildren().addAll(curve, curve1, curve2);

        return letter;
    }

    public Pane getUph(){
        Pane letter =new Pane();
        letter.setMinSize(75,200);
        letter.setMaxSize(75,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,85,70,10,-20,30,150);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(30,150,20,90,55,95,55,130);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(55,130,55,160,75,155,75,148);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1, curve2);

        return letter;
    }

    public Pane getUpi(){
        Pane letter =new Pane();
        letter.setMinSize(50,200);
        letter.setMaxSize(50,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,20,130,30,120,30,100);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(30,100,30,130,20,160,50,148);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);
        Circle circle = new Circle();
        circle.setCenterX(30);
        circle.setCenterY(80);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);
        letter.getChildren().addAll(curve, curve1, circle);

        return letter;
    }

    public Pane getUpj(){
        Pane letter =new Pane();
        letter.setMinSize(50,200);
        letter.setMaxSize(50,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,20,130,30,120,30,100);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(30,100,40,270,-40,170,50,148);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);
        Circle circle = new Circle();
        circle.setCenterX(30);
        circle.setCenterY(80);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);
        letter.getChildren().addAll(curve, curve1, circle);

        return letter;
    }

    public Pane getUpk(){
        Pane letter =new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,120,60,40,-10,50,150);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(50,110,90,80,90,125,50,120);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);



        CubicCurve curve2= new CubicCurve(50,120,60,130,90,170,100,148);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1, curve2);

        return letter;
    }

    public Pane getUpm(){
        Pane letter =new Pane();
        letter.setMinSize(130,200);
        letter.setMaxSize(130,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,30,135,50,55,50,150);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(50,150,45,85,90,90,80,150);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(80,150,75,90,120,100,110,125);
        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(110,125,105,160,125,157,130,148);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1, curve2, curve3);

        return letter;
    }

    public Pane getUpn(){
        Pane letter =new Pane();
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,30,135,50,55,50,150);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(50,150,45,85,90,90,80,125);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(80,125,75,160,95,157,100,148);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1, curve2);

        return letter;
    }

    public Pane getUpo(){
        Pane letter =new Pane();
        letter.setMinSize(75,200);
        letter.setMaxSize(75,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,40,150,25,100,50,100);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(50,100,90,110,40,170,30,125);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(45,105,50,110,60,105,75,100);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1, curve2);

        return letter;
    }

    public Pane getUpp(){
        Pane letter =new Pane();
        letter.setMinSize(75,200);
        letter.setMaxSize(75,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,148,15,130,20,120,25,100);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(25,100,25,130,25,120,25,200);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(25,110,75,75,75,170,25,140);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(25,140,50,150,60,155,75,148);
        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1, curve2, curve3);

        return letter;
    }

    public Pane getUpCorcheteClose(){
        Pane letter =new Pane();
        letter.setMinSize(20,200);
        letter.setMaxSize(20,200);
        letter.setStyle("-fx-background-color: white;");

        Line linea =new Line();
        linea.setStartX(0) ;
        linea.setStartY(150) ;
        linea.setEndX(20) ;
        linea.setEndY(150) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);

        Line linea1 =new Line();
        linea1.setStartX(0) ;
        linea1.setStartY(50) ;
        linea1.setEndX(20) ;
        linea1.setEndY(50) ;
        linea1.setStroke(Color.FORESTGREEN);
        linea1.setStrokeWidth(4);
        linea1.setStrokeLineCap(StrokeLineCap.ROUND);

        Line linea2 =new Line();
        linea2.setStartX(19) ;
        linea2.setStartY(50) ;
        linea2.setEndX(19) ;
        linea2.setEndY(150) ;
        linea2.setStroke(Color.FORESTGREEN);
        linea2.setStrokeWidth(4);
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);


        letter.getChildren().addAll(linea,linea1,linea2);

        return letter;
    }

    public Pane getUpCorcheteOpen(){
        Pane letter =new Pane();
        letter.setMinSize(20,200);
        letter.setMaxSize(20,200);
        letter.setStyle("-fx-background-color: white;");

        Line linea =new Line();
        linea.setStartX(0) ;
        linea.setStartY(150) ;
        linea.setEndX(20) ;
        linea.setEndY(150) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);

        Line linea1 =new Line();
        linea1.setStartX(0) ;
        linea1.setStartY(50) ;
        linea1.setEndX(20) ;
        linea1.setEndY(50) ;
        linea1.setStroke(Color.FORESTGREEN);
        linea1.setStrokeWidth(4);
        linea1.setStrokeLineCap(StrokeLineCap.ROUND);

        Line linea2 =new Line();
        linea2.setStartX(1) ;
        linea2.setStartY(50) ;
        linea2.setEndX(1) ;
        linea2.setEndY(150) ;
        linea2.setStroke(Color.FORESTGREEN);
        linea2.setStrokeWidth(4);
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);


        letter.getChildren().addAll(linea,linea1,linea2);

        return letter;
    }

    public Pane getUpGuion(){
        Pane letter =new Pane();
        letter.setMinSize(30,200);
        letter.setMaxSize(30,200);
        letter.setStyle("-fx-background-color: white;");

        Line linea =new Line();
        linea.setStartX(0) ;
        linea.setStartY(120) ;
        linea.setEndX(30) ;
        linea.setEndY(120) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);


        letter.getChildren().addAll(linea);

        return letter;

    }

    public Pane getUpRaya(){
        Pane letter =new Pane();
        letter.setMinSize(40,200);
        letter.setMaxSize(40,200);
        letter.setStyle("-fx-background-color: white;");

        Line linea =new Line();
        linea.setStartX(0) ;
        linea.setStartY(150) ;
        linea.setEndX(40) ;
        linea.setEndY(150) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);


        letter.getChildren().addAll(linea);

        return letter;

    }

    public Pane getUpLlaveClose(){
        Pane letter =new Pane();
        letter.setMinSize(30,200);
        letter.setMaxSize(30,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,50,30,50,0,100,30,100);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(30,100,0,100,30,150,0,150);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1);

        return letter;
    }

    public Pane getUpLlaveOpen(){
        Pane letter =new Pane();
        letter.setMinSize(30,200);
        letter.setMaxSize(30,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(30,50,0,50,30,100,0,100);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(0,100,30,100,0,150,30,150);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1);

        return letter;
    }

    public Pane getUpParentesisClose(){
        Pane letter =new Pane();
        letter.setMinSize(26,200);
        letter.setMaxSize(26,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(1,150,25,140,25,60,1,50);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        letter.getChildren().add(curve);

        return letter;
    }

    public Pane getUpParentesisOpen(){
        Pane letter =new Pane();
        letter.setMinSize(26,200);
        letter.setMaxSize(26,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(25,150,0,140,0,60,25,50);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        letter.getChildren().add(curve);

        return letter;
    }

    public Pane getUpComillasEspClose(){
        Pane letter =new Pane();
        letter.setMinSize(40,200);
        letter.setMaxSize(40,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(0,140,35,110,35,140,0,110);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(10,140,50,110,50,140,10,110);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1);

        return letter;
    }

    public Pane getUpComillasEspOpen(){
        Pane letter =new Pane();
        letter.setMinSize(40,200);
        letter.setMaxSize(40,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve= new CubicCurve(25,140,-10,110,-10,140,25,110);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(35,140,5,110,5,140,35,110);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        letter.getChildren().addAll(curve, curve1);

        return letter;
    }

    public Pane getUpComillasSimplesClose(){
        Pane letter =new Pane();
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(90);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        CubicCurve curve= new CubicCurve(5,90,10,95,10,95,5,101);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        letter.getChildren().addAll(circle,curve);

        return letter;
    }

    public Pane getUpComillasSimplesOpen(){
        Pane letter =new Pane();
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(90);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        CubicCurve curve= new CubicCurve(5,90,0,85,0,85,5,79);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        letter.getChildren().addAll(circle,curve);

        return letter;
    }

    public Pane getUpComillasInglesasClose(){
        Pane letter =new Pane();
        letter.setMinSize(22,200);
        letter.setMaxSize(22,200);
        letter.setStyle("-fx-background-color: white;");

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(90);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        CubicCurve curve= new CubicCurve(5,90,10,95,10,95,5,101);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(17,90,22,95,22,95,17,101);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        Circle circle1 = new Circle();
        circle1.setCenterX(17);
        circle1.setCenterY(90);
        circle1.setFill(Color.FORESTGREEN);
        circle1.setRadius(5);

        letter.getChildren().addAll(circle,circle1,curve,curve1);

        return letter;
    }

    public Pane getUpComillasInglesasOpen(){
        Pane letter =new Pane();
        letter.setMinSize(22,200);
        letter.setMaxSize(22,200);
        letter.setStyle("-fx-background-color: white;");

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(90);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        CubicCurve curve= new CubicCurve(5,90,0,85,0,85,5,79);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(3);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(null);
        curve.setFocusTraversable(false);

        CubicCurve curve1= new CubicCurve(17,90,12,85,12,85,17,79);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        Circle circle1 = new Circle();
        circle1.setCenterX(17);
        circle1.setCenterY(90);
        circle1.setFill(Color.FORESTGREEN);
        circle1.setRadius(5);

        letter.getChildren().addAll(circle,circle1,curve,curve1);

        return letter;
    }

    public Pane getUpDosPuntos(){
        Pane letter =new Pane();
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");
        //punto1
        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(145);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        //punto2
        Circle circle1 = new Circle();
        circle1.setCenterX(5);
        circle1.setCenterY(110);
        circle1.setFill(Color.FORESTGREEN);
        circle1.setRadius(5);

        letter.getChildren().addAll(circle,circle1);

        return letter;
    }

    public Pane getUpPuntoComa(){
        Pane letter =new Pane();
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");
        //coma
        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(145);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        CubicCurve curve1= new CubicCurve(5,145,10,150,10,150,5,156);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        //punto
        Circle circle1 = new Circle();
        circle1.setCenterX(5);
        circle1.setCenterY(110);
        circle1.setFill(Color.FORESTGREEN);
        circle1.setRadius(5);

        letter.getChildren().addAll(circle,circle1, curve1);

        return letter;
    }

    public Pane getUpComa(){
        Pane letter =new Pane();
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(150);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        CubicCurve curve1= new CubicCurve(5,150,10,155,10,155,5,161);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(3);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        letter.getChildren().addAll(circle, curve1);

        return letter;
    }

    public Pane getUpPunto(){
        Pane letter =new Pane();
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(150);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        letter.getChildren().add(circle);

        return letter;
    }

    public Pane getUpq(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(80,200);
        letter.setMaxSize(80,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(0,148,5,145,5,145,10,140);

        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,100,50,150,50,150,50,200);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(50,100,-10,110,10,175,50,140);
        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        CubicCurve curve4= new CubicCurve(30,165,40,160,40,160,60,148);
        curve4.setStroke(Color.FORESTGREEN);
        curve4.setStrokeWidth(4);
        curve4.setStrokeLineCap(StrokeLineCap.ROUND);
        curve4.setFill(null);
        curve4.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3, curve4);



        return letter;
    }

    public Pane getUpr(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(80,200);
        letter.setMaxSize(80,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(0,148,25,135,35,125,30,100);

        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,100,50,105,50,105,60,110);
        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(60,110,40,130,60,160,80,148);
        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);



        return letter;
    }

    public Pane getUps(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(75,200);
        letter.setMaxSize(75,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(0,148,25,135,35,125,50,100);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,100,70,140,50,160,25,135);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(25,135,50,160,70,150,75,148);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);



        return letter;
    }

    public Pane getUpt(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(0,148,50,160,43,140,50,50);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(100,148,50,160,37,140,50,50);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(25,100,50,100,50,100,75,100);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);



        return letter;
    }

    public Pane getUpu(){

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(90,200);
        letter.setMaxSize(90,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(0,148,10,140,30,125,30,100);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,100,25,160,60,160,60,100);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(60,100,55,160,80,160,90,148);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);



        return letter;
    }

    public Pane getUpv(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(110,200);
        letter.setMaxSize(110,200);
        letter.setStyle("-fx-background-color: white;");

        CubicCurve curve1= new CubicCurve(0,148,25,149,40,75,50,115);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,115,50,160,80,160,80,100);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(80,100,90,105,100,105,110,100);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);



        return letter;

    }

    public Pane getUpw(){
        int pointX=350;
        int pointY=350;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(120,200);
        letter.setMaxSize(120,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(0,148,10,140,30,125,30,100);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,100,25,160,60,160,60,100);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(60,100,55,160,90,160,90,100);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        CubicCurve curve4= new CubicCurve(90,100,100,105,110,105,120,100);

        curve4.setStroke(Color.FORESTGREEN);
        curve4.setStrokeWidth(4);
        curve4.setStrokeLineCap(StrokeLineCap.ROUND);
        curve4.setFill(null);
        curve4.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3, curve4);



        return letter;
    }

    public Pane getUpx(){
        int pointX=350;
        int pointY=350;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(125,200);
        letter.setMaxSize(125,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(0,148,25,135,30,110,50,104);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,104,90,175,100,165,125,148);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(50,150,75,125,75,125,100,100);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);

        return letter;
    }

    public Pane getUpz(){
        int pointX=350;
        int pointY=350;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(75,200);
        letter.setMaxSize(75,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(0,148,25,135,30,110,50,100);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,100,70,115,60,135,45,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(50,144,80,220,-35,210,75,148);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);

        return letter;
    }

    public Pane getUpy(){
        int pointX=350;
        int pointY=350;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(0,148,25,149,40,75,50,115);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,115,50,160,90,160,90,100);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(90,100,90,275,25,160,100,148);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);

        return letter;
    }

    public Pane getUpExOpen(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");

        Line linea =new Line();
        linea.setStartX(5) ;
        linea.setStartY(60) ;
        linea.setEndX(5) ;
        linea.setEndY(150) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(45);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        letter.getChildren().addAll(linea,circle);

        return letter;
    }

    public Pane getUpExClose(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(10,200);
        letter.setMaxSize(10,200);
        letter.setStyle("-fx-background-color: white;");

        Line linea =new Line();
        linea.setStartX(5) ;
        linea.setStartY(50) ;
        linea.setEndX(5) ;
        linea.setEndY(140) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(155);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        letter.getChildren().addAll(linea,circle);

        return letter;
    }

    public Pane getUPPreguntaClose(){

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(45,200);
        letter.setMaxSize(45,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(0,60,50,25,60,110,5,100);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        Line linea =new Line();
        linea.setStartX(5) ;
        linea.setStartY(100) ;
        linea.setEndX(5) ;
        linea.setEndY(145) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);

        Circle circle = new Circle();
        circle.setCenterX(5);
        circle.setCenterY(155);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        letter.getChildren().addAll(curve1,linea,circle);

        return letter;
    }

    public Pane getUPPreguntaOpen(){

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(45,200);
        letter.setMaxSize(45,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(40,100,-15,110,-5,160,45,150);
        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        Line linea =new Line();
        linea.setStartX(40) ;
        linea.setStartY(100) ;
        linea.setEndX(40) ;
        linea.setEndY(55) ;
        linea.setStroke(Color.FORESTGREEN);
        linea.setStrokeWidth(4);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);

        Circle circle = new Circle();
        circle.setCenterX(40);
        circle.setCenterY(45);
        circle.setFill(Color.FORESTGREEN);
        circle.setRadius(5);

        letter.getChildren().addAll(curve1,linea,circle);

        return letter;
    }

    public Pane getUpl(){
        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(75,200);
        letter.setMaxSize(75,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.


        CubicCurve curve1= new CubicCurve(0,148,60,160,60,75,45,50);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(45,50,15,46,40,170,75,148);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);

        return letter;
    }

    public Pane getUpG(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(50,150,10,180,-50,90,60,30);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(20,100,100,80,10,160,70,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        /**zzzCubicCurve curve3= new CubicCurve(50,100,90,100,70,180,100,150);

         curve3.setStroke(Color.FORESTGREEN);
         curve3.setStrokeWidth(4);
         curve3.setStrokeLineCap(StrokeLineCap.ROUND);
         curve3.setFill(null);
         curve3.setFocusTraversable(false);
         **/
        letter.getChildren().addAll(curve1,curve2);

        return letter;
    }

    public Pane getUpJ(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(30,120,-10,200,110,230,90,30);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,120,50,100,90,140,90,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(40,80,60,60,70,40,90,30);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpK(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(30,100,-10,150,30,220,30,30);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,100,70,80,80,110,80,30);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);


        CubicCurve curve3= new CubicCurve(30,100,90,100,70,150,90,150);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpM(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,65,10,40,30,20,25,150);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(25,55,75,30,50,100,60,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);


        CubicCurve curve3= new CubicCurve(55,55,110,30,80,100,90,150);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpN(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,65, 10,50,30,20,10,150);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(20,60,100,10,35,150,85,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

/**
 *     CubicCurve curve3= new CubicCurve(50,30,110,-10,75,120,90,170);

 curve3.setStroke(Color.FORESTGREEN);
 curve3.setStrokeWidth(4);
 curve3.setStrokeLineCap(StrokeLineCap.ROUND);
 curve3.setFill(null);
 curve3.setFocusTraversable(false);
 **/
        letter.getChildren().addAll(curve1,curve2);
        return letter;
    }

    public Pane getUpO(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(70,150, 0,200,-10,40,45,50);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(45,50,90,50,90,130,70,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(15,65,40,70,75,70,95,50);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpEnie(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,65, 20,50,30,20,10,150);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(20,65,110,-10,35,150,85,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(20,40,40,10,20,50,70,30);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpQ(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(70,150, 0,180,-10,40,45,35);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(45,35,120,40,90,150,70,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(10,105,40,155,90,100,95,150);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }
    public Pane getUpU(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,15, 50,20,-40,180,80,145);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(70,15,110,15,55,170,95,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        /*
        CubicCurve curve3= new CubicCurve(5,120,20,180,90,120,95,170);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);
        */
        letter.getChildren().addAll(curve1,curve2);
        return letter;
    }

    public Pane getUpT(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(90,30,10,120,10,200,90,150);

        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,30,40,10,80,50,90,30);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(30,90,50,75,30,100,60,90);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);

        return letter;
    }

    public Pane getUpY(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(30,140,-10,160,100,270,70,20);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(30,140,60,120,80,135,90,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(30,20,10,100,90,120,70,20);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpV(){

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,25, 60,20,-20,150,50,150);

        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,150,100,150,40,70,90,70);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);
        return letter;
    }

    public Pane getUpS(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(15,150, 90,-0,70,10,50,30);

        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,30,150,100,20,170,90,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2);
        return letter;
    }

    public Pane getDownEnie(){
        int pointX=250;
        int pointY=250;

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,105, 20,80,30,60,10,150);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(20,105,110,30,35,150,85,150);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(20,60,40,70,50,50,70,60);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpP(){

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(30,105, 30,200,30,200,20,150);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(20,150,0,10,50,20,80,50);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(80,50,110,80,100,120,30,120);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }

    public Pane getUpR(){

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(30,60, 30,160,30,160,20,100);


        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(20,100,0,30,50,10,85,50);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(85,50,100,80,90,120,30,110);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        CubicCurve curve4= new CubicCurve(30,110,80,90,80,120,90,150);

        curve4.setStroke(Color.FORESTGREEN);
        curve4.setStrokeWidth(4);
        curve4.setStrokeLineCap(StrokeLineCap.ROUND);
        curve4.setFill(null);
        curve4.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3, curve4);
        return letter;
    }

    public Pane getUpW(){

        Pane letter= new Pane();
        //letter.setAlignment(null);
        letter.setMinSize(100,200);
        letter.setMaxSize(100,200);
        letter.setStyle("-fx-background-color: white;");

        //here I begin.
        CubicCurve curve1= new CubicCurve(10,25, 60,20,-20,180,50,120);

        curve1.setStroke(Color.FORESTGREEN);
        curve1.setStrokeWidth(4);
        curve1.setStrokeLineCap(StrokeLineCap.ROUND);
        curve1.setFill(null);
        curve1.setFocusTraversable(false);

        CubicCurve curve2= new CubicCurve(50,120,110,180,40,50,90,70);

        curve2.setStroke(Color.FORESTGREEN);
        curve2.setStrokeWidth(4);
        curve2.setStrokeLineCap(StrokeLineCap.ROUND);
        curve2.setFill(null);
        curve2.setFocusTraversable(false);

        CubicCurve curve3= new CubicCurve(50,120,60,90,40,90,50,120);

        curve3.setStroke(Color.FORESTGREEN);
        curve3.setStrokeWidth(4);
        curve3.setStrokeLineCap(StrokeLineCap.ROUND);
        curve3.setFill(null);
        curve3.setFocusTraversable(false);

        letter.getChildren().addAll(curve1,curve2, curve3);
        return letter;
    }



    public Pane getUpUnknown() {

        Pane letter = new Pane();
        letter.setMinSize(100, 200);
        letter.setMaxSize(100, 200);
        letter.setStyle("-fx-background-color: forestgreen;");

        letter.getChildren();
        return letter;
    }

}
