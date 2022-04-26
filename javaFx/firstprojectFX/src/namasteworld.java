import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;

public class namasteworld extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage s) throws Exception {
        s.setTitle("Namaste World");
        Button b = new Button("Namaste World!");
        b.setOnAction((event) -> {
            System.out.println("Namaste World");
        });

        StackPane root = new StackPane();
        root.getChildren().add(b);
        Scene scene = new Scene(root, 200, 100);
        s.setScene(scene);
        s.show();
    }
}
