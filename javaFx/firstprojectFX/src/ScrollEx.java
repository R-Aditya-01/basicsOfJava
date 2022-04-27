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

public class ScrollEx extends Application {
    int r = 0, g = 0, b = 0;
    Arc ac;

    public void start(Stage stage1) throws Exception {
        Rectangle re = new Rectangle(100, 120, 100, 75);
        ac = new Arc();
        ac.setRadiusX(40);
        ac.setRadiusY(30);
        ac.setCenterX(100);
        ac.setCenterY(150);
        ac.setStartAngle(45);
        ac.setLength(120);
        ac.setType(ArcType.ROUND);
        ac.setStrokeWidth(3);
        ac.setStroke(Color.MAGENTA);
        ac.setFill(Color.GREEN);

        re.setFill(Color.rgb(r, g, b));
        ScrollBar sbr = new ScrollBar();
        sbr.setMin(0);
        sbr.setMax(255);
        ScrollBar sbg = new ScrollBar();
        sbg.setMin(0);
        sbg.setMax(255);
        ScrollBar sbb = new ScrollBar();
        sbb.setMin(0);
        sbb.setMax(255);
        sbr.setValue(20);
        sbb.setOrientation(Orientation.VERTICAL);
        HBox root = new HBox(10);
        root.getChildren().addAll(sbr, sbg, sbb, re, ac);
        sbr.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue ov, Number oldval, Number newval) {
                r = newval.intValue();
                re.setFill(Color.rgb(r, g, b));
            }
        });
        sbg.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue ov, Number oldval, Number newval) {
                g = (int) (newval.doubleValue());
                re.setFill(Color.rgb(r, g, b));
            }
        });
        sbb.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue ov, Number oldval, Number newval) {
                b = (int) (newval.doubleValue());
                re.setFill(Color.rgb(r, g, b));
            }
        });
        Scene scene = new Scene(root, 600, 400, Color.rgb(100, 100, 150, 0.5));
        stage1.setTitle("Sample application");
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}