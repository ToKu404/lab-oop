package pertemuan_9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
//import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        VBox vbox = new VBox();
        vbox.setStyle("-fx-background-color: #8FBC8F");
        //buat judul
        Label judul = new Label("KALKULATOR");
        judul.setFont(Font.font("Candara", 20));
        // vbox.getChildren().add(judul);
        vbox.setSpacing(12.0);

        ImageView logoCal = new ImageView("/image/calc.jpg");
        logoCal.setFitWidth(250);
        logoCal.setFitHeight(230);
        logoCal.setPreserveRatio(true);
        logoCal.setId("logo");
        VBox.setMargin(logoCal,new Insets(10,185, 10, 185));

        //buat tombol
        Button btnStart = new Button("Mulai");
        vbox.getChildren().addAll(logoCal, judul, btnStart);
        vbox.setAlignment(Pos.CENTER);
        btnStart.setOnAction(action -> {
            Scene1(stage);
        });

        //HBox rootNodeBox = new HBox(logoCal, vbox);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.setTitle("Kalkulator");
        stage.show();
    }

    public void Scene1(Stage stage){
        VBox vbox = new VBox();
        vbox.setStyle("-fx-background-color: #8FBC8F");
        Label judul1 = new Label("Pilih Menu");
        judul1.setFont(Font.font("Candara", 20));
        vbox.getChildren().add(judul1);
        vbox.setSpacing(12.0);

        Button calc1 = new Button("Kalkulator BMI");
        vbox.getChildren().add(calc1);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        calc1.setOnAction(action -> {
            kalkulatorBMI(stage);
        });

        Button calc2 = new Button("Kalkulator Berat Barang");
        vbox.getChildren().add(calc2);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        calc2.setOnAction(action -> {
            beratBarang(stage);
        });

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void kalkulatorBMI(Stage stage){
        Label judul2 = new Label("KALKULATOR BMI");
        judul2.setFont(Font.font("Candara", 20));

        TextField tfBerat = new TextField();
        tfBerat.setPromptText("Berat Badan");
        TextField tfTinggi = new TextField();
        tfTinggi.setPromptText("Tinggi Badan");
        Button btnCalculate = new Button("Hitung");

        Label lHasil1 = new Label();
        Button btnBack = new Button("Kembali");
        btnBack.setOnAction(action -> {
            Scene1(stage);
        });
        btnCalculate.setOnAction(action -> {
            double tinggi = Double.parseDouble(tfTinggi.getText());
            tinggi = tinggi/100;
            double berat = Double.parseDouble(tfBerat.getText());
            double hasil = berat/(tinggi * tinggi);
            lHasil1.setText(String.format("%f", hasil));

        String result;
        if (hasil < 18.5) {
            result = "Berat badan kurang proporsional";
        } else if (hasil < 25) {
            result = "Berat badan normal ";
        } else if (hasil < 30) {
            result = " Berat badan berlebih (berpotensi obesitas)";
        } else {
            result = "Obesitas";
        }
            lHasil1.setText("BMI: " + String.format("%.1f", hasil) + " - " + result);
        });

        VBox vbox = new VBox(judul2, tfBerat, tfTinggi, btnCalculate, lHasil1, btnBack);
        vbox.setStyle("-fx-background-color: #8FBC8F");
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void beratBarang(Stage stage){
        Label judul3 = new Label("KALKULATOR BERAT BARANG");

        // buat label dan field untuk berat
        Label lBerat = new Label("Berat(kg): ");
        TextField tfBerat = new TextField();
        tfBerat.setPromptText("Berat Barang");

        // buat label dan field untuk jumlah barang
        Label lJumlah = new Label("Jumlah: ");
        TextField tfJumlahBarang = new TextField();
        tfJumlahBarang.setPromptText("Jumlah Barang");

        // buat tombol hitung
        Button btnHitung = new Button("Hitung");
        // btnHitung.setOnAction(action -> {
        //     hitungBeratTotal(stage);
        // });

        // buat label dan field untuk berat total
        Label lBeratTotal = new Label("Berat Total(kg): ");
        TextField tfBeratTotal = new TextField();
        tfBeratTotal.setPromptText("Berat Total");
        tfBeratTotal.setEditable(false);

        Label lHasil2 = new Label();
        Button btnBack2 = new Button("Kembali");
        btnBack2.setOnAction(action -> {
            Scene1(stage);
        });
        btnHitung.setOnAction(action -> {
            try {
                double berat = Double.parseDouble(tfBerat.getText());
                int jumlah = Integer.parseInt(tfJumlahBarang.getText());
                double beratTotal = berat * jumlah;
                tfBeratTotal.setText(String.format("%.2f", beratTotal));
            } catch (NumberFormatException e) {
                tfBeratTotal.setText("Masukan tidak valid");
            }
        });

        VBox vbox = new VBox(judul3, lBerat, tfBerat, lJumlah, tfJumlahBarang, btnHitung, lBeratTotal, tfBeratTotal, lHasil2, btnBack2);
        vbox.setStyle("-fx-background-color: #8FBC8F");
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}