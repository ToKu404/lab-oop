package kalkulator2;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.text.Font;
import javafx.scene.image.Image;

public class App extends Application {

    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setResizable(false);
        stage.setTitle("Kalkulator");
        Image icon = new Image("resource//img//calcu.png");
        stage.getIcons().add(icon);
        page1();

    }

    private void page1() {
        ImageView imageView = new ImageView();
        String imagePath = "resource//img//calcu.png";
        Image image = new Image(imagePath);
        imageView.setImage(image);
        imageView.setFitHeight(140);
        imageView.setFitWidth(125);

        Label label = new Label("KALKULATOR");
        label.setFont(new Font(15));
        label.setStyle("-fx-font-weight: bold; -fx-font-family: Verdana; -fx-text-fill: #171986; -left: 100px; -right: 10px");

        Button button = new Button("MULAI");
        // button.setStyle("-fx-background-color: #171986; -fx-font-weight: bold; -fx-text-fill: white; -fx-padding: 8px 36px; -fx-background-radius: 20; -fx-cursor: hand;");
        button.setOnAction(e -> page2());
        button.setStyle("-fx-background-color: #171986; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: #e3f8fb; -fx-padding: 8px 36px; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
        button.setOnMouseEntered(e -> {
            button.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-background-radius: 20; -fx-cursor: hand; -fx-padding: 8px 36px; -fx-alignment: center;");
        });
        button.setOnMouseExited(e -> {
            button.setStyle("-fx-background-color: #171986; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: #e3f8fb; -fx-padding: 8px 36px; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
        });
        button.setOnAction(e -> page2());

        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox layout = new VBox(20);
        
        Image backgroundImage = new Image("img/bg.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImg);

        layout.setBackground(background);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(imageView, label, button);
    
        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
        Image imagecrs = new Image("resource//img//cursor.png"); // Ganti dengan path resource/imgmbar kursor Anda
        ImageCursor imageCursor = new ImageCursor(imagecrs);
        scene.setCursor(imageCursor);
        // Mengatur scene ke dalam stage
        stage.setScene(scene);
        
        // Menampilkan stage
        stage.show();
    }

    private void page2() {
        // membuat label dan tombol
        Label label = new Label("PILIH MENU");
        label.setFont(new Font(20));
        label.setStyle("-fx-font-weight: bold; -fx-font-family: Kollektive; -fx-text-fill: white; -fx-text-fill: #171986;");
        Label label1 = new Label(" ");
        label1.setFont(new Font(5));

        Button button1 = new Button("KALKULATOR");;
        button1.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-padding: 20px 85px; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
        button1.setOnMouseEntered(e -> {
            button1.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-background-radius: 20; -fx-cursor: hand; -fx-padding: 20px 85px; -fx-alignment: center;");
        });
        button1.setOnMouseExited(e -> {
            button1.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-padding: 20px 85px; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
        });
        button1.setOnAction(e -> kalkulator());

        Button button2 = new Button("KONVERSI UANG");
        button2.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-padding: 20px 75px; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
        button2.setOnMouseEntered(e -> {
            button2.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-background-radius: 20; -fx-cursor: hand; -fx-padding: 20px 75px; -fx-alignment: center;");
        });
        button2.setOnMouseExited(e -> {
            button2.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-padding: 20px 75px; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
        });
        button2.setOnAction(e -> convertS());

        // Membuat layout dan menambahkan komponen ke dalamnya
        VBox layout = new VBox(15);
        Image backgroundImage = new Image("img/bg.jpg");
        BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT,
        BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImg);

        layout.setBackground(background);
        layout.setAlignment(Pos.TOP_CENTER);
        layout.getChildren().addAll(label1, label, button1, button2);
    
        // Membuat scene dengan layout sebagai root
        Scene scene = new Scene(layout, 300, 500);
        Image imagecrs = new Image("resource//img//cursor.png"); // Ganti dengan path resource/imgmbar kursor Anda
        ImageCursor imageCursor = new ImageCursor(imagecrs);
        scene.setCursor(imageCursor);
        // Mengatur scene ke dalam stage
        stage.setScene(scene);
    
        // Menampilkan stage
        stage.show();
    }
    
    private void kalkulator() {
           // membuat Label
           Label label1 = new Label(" ");
           Label label2 = new Label("Kalkulator");
           Label label3 = new Label(" Hasil");
           Label label4 = new Label(" Result : ");
           Label label5 = new Label(" ");
           Label label6 = new Label(" ");
   
           label2.setFont(new Font(20));
           label2.setStyle("-fx-font-weight: bold; -fx-font-family: Kollektive; -fx-text-fill: white; -fx-text-fill: #171986;");
           label3.setFont(new Font(18));
           label3.setStyle("-fx-font-weight: bold; -fx-font-family: Kollektive; -fx-text-fill: white; -fx-text-fill: #171986;");  
           label4.setFont(new Font(20));
           label4.setStyle("-fx-font-weight: bold; -fx-font-family: Kollektive; -fx-text-fill: white; -fx-text-fill: #171986;");  
           label5.setFont(new Font(20));
           label5.setStyle("-fx-font-family: Verdana;");
           label6.setFont(new Font(5));
   
           // membuat TextField
           TextField input1 = new TextField();
           input1.setPromptText("Input 1");
           TextField input2 = new TextField();
           input2.setPromptText("Input 2");
   
           // membuat Button
           Button button1 = new Button("Clear");
           button1.setFont(new Font(20));
           button1.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 10px 25px; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
           button1.setOnMouseEntered(e -> {
           button1.setStyle("-fx-background-color: #e3f8fb; -fx-text-fill: #171986; -fx-background-radius: 20; -fx-cursor: hand; -fx-padding: 10px 25px; -fx-alignment: center;");
           });
           button1.setOnMouseExited(e -> {
           button1.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 10px 25px; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
           });
           button1.setOnAction(e -> {
               input1.clear();
               input2.clear();
               label5.setText("");;
           });
   
           Button buttona = new Button("+");
           buttona.setFont(new Font(15));
           buttona.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           buttona.setOnMouseEntered(e -> {
           buttona.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-cursor: hand; -fx-alignment: center;");
           });
           buttona.setOnMouseExited(e -> {
           buttona.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           });
           buttona.setOnAction(e -> {
               String input1text = input1.getText();
               String input2text = input2.getText();
               int angka1 = Integer.parseInt(input1text);
               int angka2 = Integer.parseInt(input2text);
               int hasil = angka1 + angka2;
               String hasilText = String.valueOf(hasil);
               label5.setText(hasilText);
           });
   
           Button buttonb = new Button("-");
           buttonb.setFont(new Font(15));
           buttonb.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           buttonb.setOnMouseEntered(e -> {
           buttonb.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-cursor: hand; -fx-alignment: center;");
           });
           buttonb.setOnMouseExited(e -> {
           buttonb.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           });
           buttonb.setOnAction(e -> {
               String input1text = input1.getText();
               String input2text = input2.getText();
               int angka1 = Integer.parseInt(input1text);
               int angka2 = Integer.parseInt(input2text);
               int hasil = angka1 - angka2;
               String hasilText = String.valueOf(hasil);
               label5.setText(hasilText);
           });
   
           Button buttonc = new Button("*");
           buttonc.setFont(new Font(15));
           buttonc.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           buttonc.setOnMouseEntered(e -> {
                buttonc.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-cursor: hand; -fx-alignment: center;");
           });
           buttonc.setOnMouseExited(e -> {
                buttonc.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           });
           buttonc.setOnAction(e -> {
               String input1text = input1.getText();
               String input2text = input2.getText();
               int angka1 = Integer.parseInt(input1text);
               int angka2 = Integer.parseInt(input2text);
               int hasil = angka1 * angka2;
               String hasilText = String.valueOf(hasil);
               label5.setText(hasilText);
           });
   
           Button buttond = new Button("/");
           buttond.setFont(new Font(15));
           buttond.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           buttond.setOnMouseEntered(e -> {
           buttond.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-cursor: hand; -fx-alignment: center;");
           });
           buttond.setOnMouseExited(e -> {
           buttond.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           });
           buttond.setOnAction(e -> {
               String input1text = input1.getText();
               String input2text = input2.getText();
               double angka1 = Double.parseDouble(input1text);
               double angka2 = Double.parseDouble(input2text);
               double hasil = angka1 / angka2;
               if (hasil % 1 == 0) {
                   // Bilangan bulat (integer)
                   int hasilInt = (int) hasil;
                   String hasilText = String.valueOf(hasilInt);
                   label5.setText(hasilText);
               } else {
                   // Bukan bilangan bulat (double)
                   String hasilText = String.valueOf(hasil);
                   label5.setText(hasilText);
               }
               // String hasilText = String.valueOf(hasil);
               // label5.setText(hasilText);
           });
   
           Button button3 = new Button("Back to Home");
           button3.setFont(new Font(20));
           button3.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 8px 26px;; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
           button3.setOnMouseEntered(e -> {
           button3.setStyle("-fx-background-color: #e3f8fb; -fx-text-fill: #171986; -fx-background-radius: 20; -fx-cursor: hand; -fx-padding: 8px 26px;; -fx-alignment: center;");
           });
           button3.setOnMouseExited(e -> {
           button3.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 8px 26px;; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
           });
           button3.setOnAction(e -> page2());
   
           // Membuat layout dan menambahkan komponen ke dalamnya
           VBox vBox1 = new VBox(5, label1, label2);
           vBox1.setAlignment(Pos.CENTER);
   
           VBox vBox2 = new VBox(5, label3);
   
           HBox hBox1 = new HBox(10, label4, label5);
           
           HBox hBox2 = new HBox(10, buttona, buttonb, buttonc, buttond);
           hBox2.setAlignment(Pos.CENTER);

           HBox hBox4 = new HBox(10, label6);
           hBox4.setAlignment(Pos.CENTER);
   
           HBox hBox3 = new HBox(10, button1);
           hBox3.setAlignment(Pos.CENTER);
   
           VBox layout = new VBox(10);
           Image backgroundImage = new Image("img/bg.jpg");
           BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT,
           BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
           Background background = new Background(backgroundImg);
           layout.setBackground(background);
           layout.setAlignment(Pos.TOP_CENTER);
           layout.setPadding(new Insets(0, 20, 0, 20));
           layout.getChildren().addAll(vBox1, input1, input2, vBox2, hBox1, hBox2, hBox4, hBox3, button3);
   
           // Membuat scene dengan layout sebagai root
           Scene scene = new Scene(layout, 300, 500);
           Image imagecrs = new Image("resource//img//cursor.png"); // Ganti dengan path resource/imgmbar kursor Anda
           ImageCursor imageCursor = new ImageCursor(imagecrs);
           scene.setCursor(imageCursor);
           // Mengatur scene ke dalam stage
           stage.setScene(scene);
       
           // Menampilkan stage
           stage.show();
       }

    private void convertS() {
           Label label2 = new Label(" ");
           Label label1 = new Label("KONVERSI UANG");
           label1.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-font-family: Kollektive; -fx-text-fill: white; -fx-text-fill: #171986;");
           Label label3 = new Label(" Hasil");
           Label label4 = new Label(" Result : ");
           Label label5 = new Label(" ");
           Label label6 = new Label(" ");

           label3.setFont(new Font(18));
           label3.setStyle("-fx-font-weight: bold; -fx-font-family: Kollektive; -fx-text-fill: white; -fx-text-fill: #171986;");  
           label4.setFont(new Font(20));
           label4.setStyle("-fx-font-weight: bold; -fx-font-family: Kollektive; -fx-text-fill: white; -fx-text-fill: #171986;");  
           label5.setFont(new Font(20));
           label5.setStyle("-fx-font-family: Verdana;");
           label6.setFont(new Font(5));

           TextField input1 = new TextField();
           input1.setPromptText("Input jumlah uang");
           TextField input2 = new TextField();
           input2.setPromptText("Masukkan nilai kurs dollar");

           Button button1 = new Button("Clear");
           button1.setFont(new Font(20));
           button1.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 10px 25px; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
           button1.setOnMouseEntered(e -> {
           button1.setStyle("-fx-background-color: #e3f8fb; -fx-text-fill: #171986; -fx-background-radius: 20; -fx-cursor: hand; -fx-padding: 10px 25px; -fx-alignment: center;");
           });
           button1.setOnMouseExited(e -> {
           button1.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 10px 25px; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
           });
           button1.setOnAction(e -> {
               input1.clear();
               input2.clear();
               label5.setText("");;
           });

           Button buttona = new Button("Rp. -> $");
           buttona.setFont(new Font(15));
           buttona.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           buttona.setOnMouseEntered(e -> {
           buttona.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-cursor: hand; -fx-alignment: center;");
           });
           buttona.setOnMouseExited(e -> {
           buttona.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           });
           buttona.setOnAction(e -> {
                String input1text = input1.getText();
                String input2text = input2.getText();
                double angka1 = Double.parseDouble(input1text);
                double angka2 = Double.parseDouble(input2text);
                double hasil = angka1 / angka2;
               DecimalFormat decimalFormat = new DecimalFormat("#.###");
               if (hasil % 1 == 0) {
                // Bilangan bulat (integer)
                int hasilInt = (int) hasil;
                String formattedNumber = decimalFormat.format(hasilInt);
                String hasilText = String.valueOf(formattedNumber);
                label5.setText("$" + hasilText);

            } else {
                // Bukan bilangan bulat (double)
               String formattedNumber = decimalFormat.format(hasil);
               String hasilText = String.valueOf(formattedNumber);
               label5.setText("$"+hasilText);
            }
            //    String formattedNumber = decimalFormat.format(hasil);
            //    String hasilText = String.valueOf(formattedNumber);
            //    label5.setText(hasilText);
           });
   
           Button buttonb = new Button("$ -> Rp");
           buttonb.setFont(new Font(15));
           buttonb.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           buttonb.setOnMouseEntered(e -> {
           buttonb.setStyle("-fx-background-color: #e3f8fb; -fx-font-weight: bold; -fx-text-fill: #171986; -fx-cursor: hand; -fx-alignment: center;");
           });
           buttonb.setOnMouseExited(e -> {
           buttonb.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-font-weight: bold; -fx-border-color: transparent; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-cursor: hand;");
           });
           buttonb.setOnAction(e -> {
                String input1text = input1.getText();
                String input2text = input2.getText();
                double angka1 = Double.parseDouble(input1text);
                double angka2 = Double.parseDouble(input2text);
                double hasil = angka1*angka2;
                DecimalFormat decimalFormat = new DecimalFormat("#,###");
                String formattedNumber = decimalFormat.format(hasil);
                String hasilText = String.valueOf(formattedNumber);
                label5.setText("Rp."+hasilText);
           });

                Button button3 = new Button("Back to Home");
                button3.setFont(new Font(20));
                button3.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 8px 26px;; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
                button3.setOnMouseEntered(e -> {
                button3.setStyle("-fx-background-color: #e3f8fb; -fx-text-fill: #171986; -fx-background-radius: 20; -fx-cursor: hand; -fx-padding: 8px 26px;; -fx-alignment: center;");
                });
                button3.setOnMouseExited(e -> {
                button3.setStyle("-fx-background-color: #171986; -fx-font-family: Kollektive; -fx-border-color: transparent; -fx-padding: 8px 26px;; -fx-background-radius: 20; -fx-text-fill: white; -fx-alignment: center; -fx-transition-duration: 0.3s; -fx-background-radius: 20; -fx-cursor: hand;");
                });
                button3.setOnAction(e -> page2());

           VBox vBox1 = new VBox(5, label2, label1);
           vBox1.setAlignment(Pos.CENTER);
   
           VBox vBox2 = new VBox(5, label3);
   
           HBox hBox1 = new HBox(10, label4, label5);
           
           HBox hBox2 = new HBox(10, buttona, buttonb);
           hBox2.setAlignment(Pos.CENTER);

           HBox hBox4 = new HBox(10, label6);
           hBox4.setAlignment(Pos.CENTER);
   
           HBox hBox3 = new HBox(10, button1);
           hBox3.setAlignment(Pos.CENTER);
           

           VBox layout = new VBox(10);
           Image backgroundImage = new Image("img/bg.jpg");
           BackgroundImage backgroundImg = new BackgroundImage(backgroundImage,BackgroundRepeat.NO_REPEAT,
           BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
           Background background = new Background(backgroundImg);
           layout.setBackground(background);
           layout.setAlignment(Pos.TOP_CENTER);
           layout.setPadding(new Insets(0, 20, 0, 20));
           layout.getChildren().addAll(vBox1, input1, input2, vBox2, hBox1, hBox2, hBox4, hBox3, button3);

           Scene scene = new Scene(layout, 300, 500);
           Image imagecrs = new Image("resource//img//cursor.png"); // Ganti dengan path resource/imgmbar kursor Anda
           ImageCursor imageCursor = new ImageCursor(imagecrs);
           scene.setCursor(imageCursor);
           // Mengatur scene ke dalam stage
           stage.setScene(scene);
       
           // Menampilkan stage
           stage.show();




    }

    public static void main(String[] args) {
        launch(args);
    }
}