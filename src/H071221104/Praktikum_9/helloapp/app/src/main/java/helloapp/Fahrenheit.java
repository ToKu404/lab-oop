package helloapp;

import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Fahrenheit {
    private Stage stage;

    Fahrenheit(Stage stage){
        this.stage = stage;
    }
    
    public void show(){
        Label label1 = new Label("Fahrenheit to Celcius");
        label1.setStyle("-fx-font-family: Verdana; -fx-font-size: 20px; -fx-text-fill: white;");
        Label label2= new Label("Hasil");
        label2.setStyle("-fx-font-family: Verdana; -fx-font-size: 16px; -fx-text-fill: white;");
        Label label3= new Label();
        label3.setStyle("-fx-font-family: Verdana; -fx-font-size: 16px; -fx-text-fill: white;");

        TextField textField1 = new TextField("input ");
        textField1.setPrefWidth(100);
        textField1.setPrefHeight(30);

        Button buttonClear = new Button("Clear");
        buttonClear.setOnAction(V ->{
            Fahrenheit fahrenheit = new Fahrenheit(stage);
            fahrenheit.show();
        });
        buttonClear.setStyle("-fx-font-family: Tahoma; -fx-font-size: 16px; -fx-background-color: grey; -fx-text-fill: white;");
        buttonClear.setPrefWidth(100);
        buttonClear.setPrefHeight(30);
        Button buttonCalculate = new Button("Calculate");
        buttonCalculate.setOnAction(v -> {
            try {
                int input1 = Integer.parseInt(textField1.getText());
                int hasil = (input1 -32) * 5/9;
                String hasilText = String.valueOf(hasil);
                label3.setText(hasilText + " C");
                
            } catch (Exception e) {
                label3.setText("Hanya berupa angka");
            }
        });
        buttonCalculate.setStyle("-fx-font-family: Tahoma; -fx-font-size: 16px; -fx-background-color: gold; -fx-text-fill: white;");
        buttonCalculate.setPrefWidth(100);
        buttonCalculate.setPrefHeight(30);
        Button buttonBackHome = new Button("Back to Home");
        buttonBackHome.setOnAction(V ->{
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });
        buttonBackHome.setStyle("-fx-font-family: Tahoma; -fx-font-size: 16px; -fx-background-color: black; -fx-text-fill: white; -fx-border-color: white");
        buttonBackHome.setPrefWidth(200);
        buttonBackHome.setPrefHeight(20);
        HBox hBox = new HBox();
        hBox.getChildren().add(buttonClear);
        hBox.getChildren().add(buttonCalculate);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(label1, 1, 1);
        gridPane.add(textField1,1,2);
        gridPane.add(label2,1,4);
        gridPane.add(label3,1,5);
        gridPane.add(hBox, 1, 6);
        gridPane.add(buttonBackHome,1,7);
        gridPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gridPane,350, 600);
        gridPane.setStyle("-fx-background-color: darkblue;");
        stage.setScene(scene);
        stage.show();
    }
}
