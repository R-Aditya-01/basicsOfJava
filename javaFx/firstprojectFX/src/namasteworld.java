import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class namasteworld extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage s) throws Exception {
        Button b = new Button("Namaste World!");

        StackPane root = new StackPane();
        root.getChildren().add(b);
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
}
