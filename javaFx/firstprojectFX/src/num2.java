
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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class num2 extends Application {
    TextField tf1, tf2, tf3;

    public void start(Stage stage1) throws Exception {

        FlowPane root = new FlowPane();

        Label lb1 = new Label("a");
        Label lb2 = new Label("b");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        Button b1 = new Button("add");
        Button b2 = new Button("multiply");

        b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {

                tf3.setText("" + (Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
            }
        });

        b2.setOnAction((ActionEvent ae) -> {
            tf3.setText("" + Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText()));
        });
        root.getChildren().addAll(lb1, tf1, lb2, tf2, tf3, b1, b2);
        Scene scene = new Scene(root, 200, 200);
        stage1.setTitle("Sample application");
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
