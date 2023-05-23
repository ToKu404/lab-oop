package pertemuan9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        showScene1();
        stage.setTitle("Praktikum 9 - Kalkulator");
        stage.setResizable(false);
        stage.show();
    }
                                                                                                                                                                                                 
    // HALAMAN UTAMA
    public void showScene1() {
        ImageView logo = new ImageView("/Images/12.jpg");
        logo.setFitWidth(400);
        logo.setFitHeight(500);
        logo.setPreserveRatio(true);

        Text text = new Text("KALKULATOR SEDERHANA");
        Button startButton = new Button("Mulai");
        startButton.setId("startButton");


        VBox vbox = new VBox(logo, text, startButton);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setSpacing(15);

        Scene scene = new Scene(vbox, 400, 600);
        stage.setScene(scene);
        


        startButton.setOnAction(action -> {
            showScene2();
        });

        // style css
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
    }

    // MENU UTAMA
    public void showScene2() {
        Text tittle = new Text("PILIH MENU KALKULATOR : ");

        Button kubus = new Button("Operasi Kubus");
        kubus.setId("kubus");
        kubus.setOnAction(action -> {
            showKubus();
        });

        Button suhu = new Button("Konversi Suhu");
        suhu.setId("suhu");
        suhu.setOnAction(action -> {
            showSuhu();
        });

        VBox vBox = new VBox(tittle, kubus, suhu);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);

        Scene scene2 = new Scene(vBox, 400, 600);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    }

    // OPERASI KALKULATOR 1
    public void showKubus() {
        Label label = new Label("Operasi Kubus");
        Label label2 = new Label("Masukkan panjang rusuk :");

        TextField input = new TextField();
        Label output = new Label();

        Button keliling = new Button("Keliling");
        keliling.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = 12 * angka;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button luas = new Button("Luas");
        luas.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = 6 * (angka * angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button volume = new Button("Volume");
        volume.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = angka * angka * angka;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox luasKel = new HBox(keliling, luas);
        luasKel.setSpacing(10);
        luasKel.setAlignment(Pos.CENTER);

        VBox luasKelVol = new VBox(luasKel, volume);
        luasKelVol.setSpacing(18);
        luasKelVol.setAlignment(Pos.CENTER);

        Button clear = new Button("Hapus");
        clear.setId("clear");
        clear.setOnAction(action -> {
            input.setText("");
        });

        Button back = new Button("Kembali");
        back.setId("back");
        back.setOnAction(action -> {
            showScene2();
        });

        VBox vBox = new VBox(label, label2, input, output, luasKelVol, clear, back);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setSpacing(25);

        Scene scene3 = new Scene(vBox, 400, 600);
        scene3.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    // OPERASI KALKULATOR 2
    public void showSuhu() {
        Label label = new Label("Konversi Suhu");

        Label label2 = new Label("Celcius :");
        TextField input1 = new TextField();

        Label label3 = new Label("Fahrenheit :");
        TextField input2 = new TextField();

        Label label4 = new Label("Kelvin :");
        TextField input3 = new TextField();
        Label output = new Label();

        Button konversi = new Button("Konversi");
        konversi.setId("konversi");
        konversi.setOnAction(action -> {
            try {
                if (!input1.getText().isEmpty()) {
                    double celcius = Double.parseDouble(input1.getText());
                    double fahrenheit = celcius * 9 / 5 + 32;
                    input2.setText(String.format("%.2f", fahrenheit));

                    double kelvin = celcius + 273.15;
                    input3.setText(String.format("%.2f", kelvin));

                } else if (!input2.getText().isEmpty()) {
                    double fahrenheit = Double.parseDouble(input2.getText());
                    double celcius = (fahrenheit - 32) * 5 / 9;
                    input1.setText(String.format("%.2f", celcius));

                    double kelvin = (fahrenheit + 459.67) * 5 / 9;
                    input3.setText(String.format("%.2f", kelvin));

                } else if (!input3.getText().isEmpty()) {
                    double kelvin = Double.parseDouble(input3.getText());
                    double celcius = kelvin - 273.15;
                    input1.setText(String.format("%.2f", celcius));

                    double fahrenheit = kelvin * 9 / 5 - 459.67;
                    input2.setText(String.format("%.2f", fahrenheit));
                } 
            } catch (NumberFormatException e) {
                output.setText("Bukan angka");
            }
        });

        Button clear = new Button("Hapus");
        clear.setId("clear");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
            input3.setText("");
        });

        Button back = new Button("Kembali");
        back.setId("back");
        back.setOnAction(action -> {
            showScene2();
        });

        VBox vBox = new VBox(label, label2, input1, label3, input2, label4, input3, konversi, clear, back);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setSpacing(20);

        Scene scene3 = new Scene(vBox, 400, 600);
        scene3.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}