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

	private static final String MARU = "〇";
	private static final String BATSU = "×";

	//初期値"〇"
	private static String var = MARU;

	@Override
    public void start(Stage stage) {
        stage.setTitle("Test");

     // イベントリスナの生成

        ArrayList<Button> btn = new ArrayList<>();

        for(int i=0; i<9; i++) {
        	btn.add(new  Button("　"));
        	btn.get(i).setPrefWidth(150.0);
        	btn.get(i).setPrefHeight(150.0);
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

        Scene scene = new Scene(pane,500,500);
        stage.setScene(scene);
        stage.show();
    }

	public void test(Button e, ArrayList<Button> btn) {
        //押されたボタンに〇か×が入る
		e.setText(var);

		e.setDisable(true);

        //列判定
        check(btn);

        //〇×切り替え
        var =change_var(var);

	}

	private void check(ArrayList<Button> btn) {
	    //判定
        if (btn.get(0).getText().equals(var) && btn.get(1).getText().equals(var) && btn.get(2).getText().equals(var)) {
            finMessage();
         }
        else if (btn.get(3).getText().equals(var) && btn.get(4).getText().equals(var) && btn.get(5).getText().equals(var)) {
            finMessage();
         }
        else if (btn.get(6).getText().equals(var) && btn.get(7).getText().equals(var) && btn.get(8).getText().equals(var)) {
            finMessage();
         }
        else if (btn.get(0).getText().equals(var) && btn.get(3).getText().equals(var) && btn.get(6).getText().equals(var)) {
            finMessage();
         }
        else if (btn.get(1).getText().equals(var) && btn.get(4).getText().equals(var) && btn.get(7).getText().equals(var)) {
            finMessage();
         }
        else if (btn.get(2).getText().equals(var) && btn.get(5).getText().equals(var) && btn.get(8).getText().equals(var)) {
            finMessage();
         }
        else if (btn.get(0).getText().equals(var) && btn.get(4).getText().equals(var) && btn.get(8).getText().equals(var)) {
            finMessage();
         }
        else if (btn.get(2).getText().equals(var) && btn.get(4).getText().equals(var) && btn.get(6).getText().equals(var)) {
            finMessage();
         }
        else {

         }
	}

	private void finMessage() {
       Alert alert = new Alert(AlertType.INFORMATION); //アラートを作成

       alert.setTitle( "ゲーム終了" );
       alert.getDialogPane().setHeaderText( "ゲーム終了です" );
       alert.getDialogPane().setContentText( var + "の勝ち" );

       alert.showAndWait(); //表示
	}

	private String change_var(String var) {
		if(var.equals(MARU)) {
			var = BATSU;
			return var;
		}
		else{
			var = MARU;
			return var;
		}
	}
 }

