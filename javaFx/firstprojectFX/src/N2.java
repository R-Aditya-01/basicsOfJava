
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.PerspectiveCamera;
import javafx.collections.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import java.io.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.transform.Scale;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.beans.value.*;

public class N2 extends Application {

    Rectangle r1, r2, r3;
    Line l1, l2;
    ScrollBar sb1, sb2, sb3;
    int i = 0, j = 0, k = 0;

    public void start(Stage stage) throws Exception {
        double height = 10;
        double width = 10;
        VBox root = new VBox();
        Pane root1 = new Pane();
        VBox root2 = new VBox();
        ToggleGroup Tg = new ToggleGroup();
        RadioButton Rb1 = new RadioButton("Red Color");
        RadioButton Rb2 = new RadioButton("Pink Color");
        RadioButton Rb3 = new RadioButton("Green Color");
        TextField t1 = new TextField("Students number when click the particluar bar");
        t1.setPrefHeight(height);
        t1.setPrefWidth(width);
        TextField t2 = new TextField("Students % when click the particluar bar");
        t2.setPrefHeight(height);
        t2.setPrefWidth(width);

        Rb1.setToggleGroup(Tg);
        Rb2.setToggleGroup(Tg);
        Rb3.setToggleGroup(Tg);
        l1 = new Line(100, 100, 100, 600);
        l2 = new Line(100, 600, 600, 600);

        Rb1.setOnAction((ActionEvent ae) -> {
            r1.setFill(Color.valueOf("red"));
            r2.setFill(Color.valueOf("red"));
            r3.setFill(Color.valueOf("red"));

        });
        Rb2.setOnAction((ActionEvent ae) -> {
            r1.setFill(Color.valueOf("pink"));
            r2.setFill(Color.valueOf("pink"));
            r3.setFill(Color.valueOf("pink"));

        });
        Rb3.setOnAction((ActionEvent ae) -> {
            r1.setFill(Color.valueOf("green"));
            r2.setFill(Color.valueOf("green"));
            r3.setFill(Color.valueOf("green"));

        });

        r1 = new Rectangle();
        r1.setX(100);
        r1.setY(0);
        r1.setWidth(60);
        r1.setHeight(0);
        r1.setStroke(Color.valueOf("black"));

        r2 = new Rectangle();
        r2.setX(160);
        r2.setY(0);
        r2.setWidth(60);
        r2.setHeight(0);
        r2.setStroke(Color.valueOf("black"));

        r3 = new Rectangle();
        r3.setX(220);
        r3.setY(0);
        r3.setWidth(60);
        r3.setHeight(0);
        r3.setStroke(Color.valueOf("black"));

        sb1 = new ScrollBar();
        sb1.setMin(0);
        sb1.setMax(300);
        sb1.setValue(0);
        sb1.setUnitIncrement(3);
        sb1.setOrientation(Orientation.VERTICAL);

        sb2 = new ScrollBar();
        sb2.setMin(0);
        sb2.setMax(300);
        sb2.setValue(110);
        sb2.setUnitIncrement(3);
        sb2.setOrientation(Orientation.VERTICAL);

        sb3 = new ScrollBar();
        sb3.setMin(0);
        sb3.setMax(300);
        sb3.setValue(210);
        sb3.setUnitIncrement(3);
        sb3.setOrientation(Orientation.VERTICAL);

        r1.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                t1.setText(String.valueOf(r1.getHeight() / 10));
                t2.setText(String.valueOf(r1.getHeight() / 6));

            }
        });
        r1.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                t1.clear();
                t2.clear();

            }
        });
        r2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                t1.setText(String.valueOf(r2.getHeight() / 10));
                t2.setText(String.valueOf(r2.getHeight() / 6));

            }
        });
        r2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                t1.clear();
                t2.clear();

            }
        });
        r3.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                t1.setText(String.valueOf(r3.getHeight() / 10));
                t2.setText(String.valueOf(r3.getHeight() / 6));

            }
        });
        r3.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                t1.clear();
                t2.clear();

            }
        });

        root2.getChildren().addAll(sb1, sb2, sb3, Rb1, Rb2, Rb3, t1, t2);

        root1.getChildren().addAll(l1, r1, r2, r3, l2);
        root.getChildren().addAll(root2, root1);

        sb1.valueProperty().addListener((ov, oldval, newval) -> {
            i = newval.intValue();
            r1.setY(i);
            r1.setHeight(600 - i);
        });
        sb2.valueProperty().addListener((ov, oldval, newval) -> {
            j = newval.intValue();
            r2.setY(j);
            r2.setHeight(600 - j);
        });
        sb3.valueProperty().addListener((ov, oldval, newval) -> {
            k = newval.intValue();
            r3.setY(k);
            r3.setHeight(600 - k);
        });

        Scene scene = new Scene(root, 800, 800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}