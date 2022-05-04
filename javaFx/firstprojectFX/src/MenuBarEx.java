
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class MenuBarEx extends Application {
    public void start(Stage stage1) throws Exception {

        FlowPane root = new FlowPane();
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("square");
        Menu m2 = new Menu("circle");
        MenuItem mi1 = new MenuItem("area");
        MenuItem mi2 = new MenuItem("perimeter");
        MenuItem mi3 = new MenuItem("area");
        MenuItem mi4 = new MenuItem("circumference");
        m1.getItems().addAll(mi1, mi2);
        m2.getItems().addAll(mi3, mi4);
        mb.getMenus().addAll(m1, m2);

        mi1.setOnAction((ActionEvent ae) -> {
            System.out.println(((MenuItem) ae.getSource()).getText());
        });
        mi2.setOnAction((ActionEvent ae) -> {
            System.out.println(((MenuItem) ae.getSource()).getText());
        });
        mi3.setOnAction((ActionEvent ae) -> {
            System.out.println(((MenuItem) ae.getSource()).getText());
        });
        mi4.setOnAction((ActionEvent ae) -> {
            System.out.println(((MenuItem) ae.getSource()).getText());
        });

        root.getChildren().addAll(mb);
        Scene scene = new Scene(root, 200, 200);
        stage1.setTitle("Sample application");
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
