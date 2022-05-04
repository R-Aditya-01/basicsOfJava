
// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.Group;
// import javafx.stage.Stage;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.*;
// import javafx.scene.control.*;
// import javafx.scene.layout.*;
// import javafx.event.*;

// public class CheckBoxEx extends Application {
// public void start(Stage stage1) throws Exception {

// FlowPane root = new FlowPane();
// CheckBox c1 = new CheckBox("SCOPE");
// CheckBox c2 = new CheckBox("SITE");

// root.getChildren().addAll(c1, c2);
// root.addEventHandler(ActionEvent.ANY, (ActionEvent ae) -> {
// if (c1.isSelected())
// System.out.println("Scope");
// if (c2.isSelected())
// System.out.println("Site");
// });

// /*
// * (or) register the event handler individually for each of the checkboxes
// *
// * c1.addEventHandler(ActionEvent.ANY,(ActionEvent ae)->{
// * if(c1.isSelected()) System.out.println(c1.getText());
// * });
// * c2.addEventHandler(ActionEvent.ANY,(ActionEvent ae)->{
// * if(c2.isSelected()) System.out.println(c2.getText());
// * });
// */

// Scene scene = new Scene(root, 200, 200);
// stage1.setTitle("Sample application");
// stage1.setScene(scene);
// stage1.show();
// }

// public static void main(String args[]) {
// launch(args);
// }
// }
