package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
    public void start(Stage stage) {
        stage.setTitle("Test");

     // イベントリスナの生成

        ArrayList<Button> btn = new ArrayList<>();

        for(int i=0; i<9; i++) {
        	btn.add(new  Button("　"));
        }

        GridPane pane = new GridPane();

        pane.add(btn.get(0), 0, 0);
        pane.add(btn.get(1), 1, 0);
        pane.add(btn.get(2), 2, 0);
        pane.add(btn.get(3), 0, 1);
        pane.add(btn.get(4), 1, 1);
        pane.add(btn.get(5), 2, 1);
        pane.add(btn.get(6), 0, 2);
        pane.add(btn.get(7), 1, 2);
        pane.add(btn.get(8), 2, 2);

        for(Button e : btn) {
        e.setOnAction(event -> test(e,btn));
        }

        Scene scene = new Scene(pane,150,150);
        stage.setScene(scene);
        stage.show();
    }

	public void test(Button e, ArrayList<Button> btn) {
        e.setText("〇");

        //判定
        if (btn.get(0).getText().equals("〇") && btn.get(1).getText().equals("〇") && btn.get(2).getText().equals("〇")) {
            finMessage();
         }
        else if (btn.get(3).getText().equals("〇") && btn.get(4).getText().equals("〇") && btn.get(5).getText().equals("〇")) {
            finMessage();
         }
        else if (btn.get(6).getText().equals("〇") && btn.get(7).getText().equals("〇") && btn.get(8).getText().equals("〇")) {
            finMessage();
         }
        else if (btn.get(0).getText().equals("〇") && btn.get(3).getText().equals("〇") && btn.get(6).getText().equals("〇")) {
            finMessage();
         }
        else if (btn.get(1).getText().equals("〇") && btn.get(4).getText().equals("〇") && btn.get(7).getText().equals("〇")) {
            finMessage();
         }
        else if (btn.get(2).getText().equals("〇") && btn.get(5).getText().equals("〇") && btn.get(8).getText().equals("〇")) {
            finMessage();
         }
        else if (btn.get(0).getText().equals("〇") && btn.get(4).getText().equals("〇") && btn.get(8).getText().equals("〇")) {
            finMessage();
         }
        else if (btn.get(2).getText().equals("〇") && btn.get(4).getText().equals("〇") && btn.get(6).getText().equals("〇")) {
            finMessage();
         }
	}

	private void finMessage() {
	       Alert alert = new Alert(AlertType.INFORMATION); //アラートを作成

	       alert.setTitle( "ゲーム終了" );
	       alert.getDialogPane().setHeaderText( "ゲーム終了です" );
	       alert.getDialogPane().setContentText( "〇の勝ち" );

	       alert.showAndWait(); //表示
	    }
 }

