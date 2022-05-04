import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class namasteworld extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage s) throws Exception {
        s.setTitle(" World ");
        Button b = new Button("Namaste World!");
        Button ex = new Button("Exit");
        ex.setOnAction(e -> {
            System.out.println("Namaste!");
            System.exit(0);

        });
        b.setOnAction((event) -> { // lamda expressionl
            System.out.println("Namaste World");
        });

        FlowPane root = new FlowPane();
        root.getChildren().addAll(b, ex);
        Scene scene = new Scene(root, 200, 100);
        s.setScene(scene);
        s.show();
    }
}
