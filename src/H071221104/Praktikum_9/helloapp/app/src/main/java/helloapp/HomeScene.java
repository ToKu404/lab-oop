package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage){
        this.stage = stage;
    }

    public void show() {
        Button buttonMulai = new Button("MULAI");
        buttonMulai.setOnAction(V -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });
        buttonMulai.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: white; -fx-background-color: gold");
        buttonMulai.setAlignment(Pos.CENTER);
        buttonMulai.setPrefWidth(200);
        buttonMulai.setPrefHeight(30);
        Label label = new Label("Kalkulator Sederhana");
        label.setStyle("-fx-font-family: Arial; -fx-font-size: 20px; -fx-text-fill: white");

        Image image = new Image("file:D:/Logo_PDI-P.svg.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        
        VBox vBox = new VBox();
        vBox.getChildren().add(imageView);
        vBox.getChildren().add(label);
        vBox.getChildren().add(buttonMulai);
        vBox.setAlignment(Pos.CENTER);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(imageView,1,1);
        gridPane.add(label,1,3);
        gridPane.add(buttonMulai,1,4);
        gridPane.setAlignment(Pos.CENTER);      

        Scene scene = new Scene(new StackPane(gridPane), 350, 600);
        gridPane.setStyle("-fx-background-color: darkblue;");
        stage.setScene(scene);
        stage.show();
    }
}
