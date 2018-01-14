package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Test");

        Button btn1 = new  Button("　");
        Button btn2 = new  Button("　");
        Button btn3 = new  Button("　");
        Button btn4 = new  Button("　");
        Button btn5 = new  Button("　");
        Button btn6 = new  Button("　");
        Button btn7 = new  Button("　");
        Button btn8 = new  Button("　");
        Button btn9 = new  Button("　");

        GridPane pane = new GridPane();
        pane.add(btn1, 0, 0);
        pane.add(btn2, 1, 0);
        pane.add(btn3, 2, 0);
        pane.add(btn4, 0, 1);
        pane.add(btn5, 1, 1);
        pane.add(btn6, 2, 1);
        pane.add(btn7, 0, 2);
        pane.add(btn8, 1, 2);
        pane.add(btn9, 2, 2);

        btn1.setOnAction(event -> btn1.setText("〇"));

        Scene scene = new Scene(pane,100,100);
        stage.setScene(scene);
        stage.show();
    }
}
