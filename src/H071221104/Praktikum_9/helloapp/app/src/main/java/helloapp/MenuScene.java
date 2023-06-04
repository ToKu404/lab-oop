package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MenuScene {
    private Stage stage;

    MenuScene(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Button buttonKalkulator1 = new Button("Kalkulator Pertambahan");
        buttonKalkulator1.setOnAction(V -> {
            Kalkulator1 kalkulator1 = new Kalkulator1(stage);
            kalkulator1.show();
        });
        buttonKalkulator1.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: black; -fx-background-color: grey;");


        Button buttonKalkulator2 = new Button("Kalkulator Perkalian");
        buttonKalkulator2.setOnAction(V -> {
            Kalkulator2 kalkulator2 = new Kalkulator2(stage);
            kalkulator2.show();

        });
        buttonKalkulator2.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: black; -fx-background-color: grey;");

        Button buttonCelcius = new Button("Celcius to Fahrenheit");
        buttonCelcius.setOnAction(V -> {
            Celcius celcius = new Celcius(stage);
            celcius.show();
        });
        buttonCelcius.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: black; -fx-background-color: grey;");

        Button buttonFahrenheit = new Button("Fahrenheit to Celcius");
        buttonFahrenheit.setOnAction(V -> {
            Fahrenheit fahrenheit = new Fahrenheit(stage);
            fahrenheit.show();
        });
        buttonFahrenheit.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: black; -fx-background-color: grey;");

        Button buttonBack = new Button("Back");
        buttonBack.setOnAction(V -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.show();

        });
        buttonBack.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: black; -fx-background-color: grey;");
        buttonBack.setAlignment(Pos.CENTER);

        Label label = new Label("PILIH MENU");
        label.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: white;");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(label,1,1);
        gridPane.add(buttonKalkulator1,1,3);
        gridPane.add(buttonKalkulator2,1,4);
        gridPane.add(buttonCelcius,1,5);
        gridPane.add(buttonFahrenheit,1,6);
        gridPane.add(buttonBack,1,7);
        gridPane.setAlignment(Pos.CENTER);
        
        

        Scene scene = new Scene(gridPane,350,600);
        gridPane.setStyle("-fx-background-color: darkblue;");
        stage.setScene(scene);
        stage.show();
    }
    
}
