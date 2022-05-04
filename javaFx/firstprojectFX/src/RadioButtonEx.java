
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class RadioButtonEx extends Application {
    public void start(Stage stage1) throws Exception {

        FlowPane root = new FlowPane();
        RadioButton r1 = new RadioButton("BTech");
        RadioButton r2 = new RadioButton("MTech");
        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);

        // registering the event handler with the root so that it is invoked when either
        // of
        // the radiobuttons are clicked

        root.addEventHandler(ActionEvent.ANY, (ActionEvent ae) -> {
            RadioButton rb = (RadioButton) tg.getSelectedToggle();
            System.out.println(rb.getText());
        });

        /*
         * (or) register the event handler individually for each of the radio buttons
         * r1.setOnAction((ActionEvent ae)->
         * {
         * System.out.println(((RadioButton)tg.getSelectedToggle()).getText());
         * });
         * r2.setOnAction((ActionEvent ae)->
         * {
         * System.out.println(((RadioButton)tg.getSelectedToggle()).getText());
         * });
         */

        root.getChildren().addAll(r1, r2);
        Scene scene = new Scene(root, 200, 200);
        stage1.setTitle("Sample application");
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
