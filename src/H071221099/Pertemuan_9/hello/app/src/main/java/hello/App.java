package hello;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class App extends Application {
    private Stage stage;
    public void start(Stage primaryStage) throws Exception{
        
        stage = primaryStage;
        stage.getIcons().add(new Image("D:\\javafx\\hello\\app\\src\\main\\resources\\image\\kal.jpg"));
        stage.setResizable(false);
        showFirstScene();
        stage.show();
    }


    private void showFirstScene(){
        Label label = new Label("  TUNGITUNG  ");
        label.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 20px; -fx-text-fill: #020201;-fx-background-color: GREEN; -fx-background-radius: 90;");
        VBox vbox1 =new VBox(50,label);
        vbox1.setStyle("-fx-background-color: ");
        vbox1.setAlignment(Pos.TOP_CENTER);
        

        // ImageView imageView = new ImageView();
        // imageView.setFitHeight(180);
        // imageView.setFitWidth(180);
        // VBox vbox2 = new VBox(15, imageView);
        // vbox2.setAlignment(Pos.CENTER);

        Button button = new Button("Click To Start");
        button.setFont(new Font(40));
        button.setStyle("-fx-font-weight: bold;-fx-font: 30 The Northern;-fx-background-color: GREEN;-fx-text-fill: #020201;-fx-background-radius: 100");

        VBox vbox3=new VBox(15, button);
        vbox3.setAlignment(Pos.TOP_CENTER);
        vbox3.setStyle("-fx-background-color: ");

        VBox asli = new VBox(45,vbox1,vbox3);
        asli.setAlignment(Pos.CENTER);
        asli.setStyle("D:\\javafx\\hello\\app\\src\\main\\resources\\image\\278a5d3f73002382ad3a3f6baebb5e43.jpg");
        // asli.getChildren().addAll(vbox1,vbox2,vbox3);
        
        Image backgroundImage = new Image("image/back.jpg");
        BackgroundImage background = new BackgroundImage(backgroundImage,
        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background backg = new Background(background);
        asli.setBackground(backg);
        
        Scene scene1 = new Scene(asli,500,500);
        stage.setTitle("CALCULATORMU");
        stage.setScene(scene1);

  
        button.setOnAction(e -> showSecondscene());

    }

    private void showSecondscene(){

        Label menu = new Label("  PILIH MENU  ");
        menu.setAlignment(Pos.TOP_CENTER);
        menu.setStyle("-fx-font-weight: bold;-fx-background-color: #2494b0e5;-fx-text-fill: BLACK;-fx-background-radius: 10;-fx-border-color: BLACK");               
        menu.setFont(Font.font("Comic Sans MS", 26));
        VBox vbox1 = new VBox(40, menu);
        vbox1.setAlignment(Pos.TOP_CENTER);



        Button button1 = new Button("Hitung Luas & Keliling Persegi");
        button1.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 10px; -fx-font-weight: bold; -fx-background-color: #a38d20; -fx-text-fill: #020201; -fx-background-radius: 100;");
       
        ImageView imageView = new ImageView();
        String foto = "file:D:/persegi1.jpg";
        Image image = new Image(foto);
        imageView.setImage(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        Button button2 = new Button("Hitung Luas & Keliling PersegiPanjang");
        button2.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 10px; -fx-font-weight: bold; -fx-background-color: #a38d20; -fx-text-fill: #020201; -fx-background-radius: 100;");

        ImageView imageView2 = new ImageView();
        String foto2 = "file:D:/prsegipanjang.png";
        Image image2 = new Image(foto2);
        imageView2.setImage(image2);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);

        Button button3 = new Button("Kalkulator");
        button3.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 10px; -fx-font-weight: bold; -fx-background-color: #a38d20; -fx-text-fill: #020201; -fx-background-radius: 100;");

        ImageView imageView3 = new ImageView();
        String foto3 = "file:D:/lope.png";
        Image image3 = new Image(foto3);
        imageView3.setImage(image3);
        imageView3.setFitHeight(150);
        imageView3.setFitWidth(150);

        VBox vbox2 = new VBox(20, imageView,button1) ;
        vbox2.setAlignment(Pos.TOP_CENTER);
        VBox vbox3 = new VBox(20, imageView2,button2) ;
        vbox3.setAlignment(Pos.TOP_CENTER);
        VBox vbox4 = new VBox(5, imageView3,button3);
        vbox4.setAlignment(Pos.TOP_CENTER);

        HBox hbox = new HBox(15,vbox2,vbox3);
        hbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox2 = new HBox(15,vbox4);
        hbox2.setAlignment(Pos.TOP_CENTER);


        VBox vbox = new VBox(10,vbox1,hbox,hbox2);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: #202922;");
        Scene scene2 = new Scene((vbox),500,500);
        button1.setOnAction(e -> KalkulatorPersegi());
        button2.setOnAction(e -> KalkulatorPersegipanjang());
        button3.setOnAction(e->kalkulatorcuy()  );
        stage.setScene(scene2);    
    }


    private void KalkulatorPersegi(){
        Button luaspersegi = new Button("Hitung Luas");
        Button kelilingpersegi = new Button("Hitung Keliling");
        Button clear= new Button("CLEAR");
        Button balikmenu = new Button("KEMBALI KE MENU");
        TextField sisipersegi = new TextField();
        sisipersegi.setPromptText("masukin sisi");
        Label labelsisipersegi = new Label("MASUKKAN PANJANG SISI");
        labelsisipersegi.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 10; -fx-border-color: WHITE;");
        Label labelhasilpersegi = new Label("Persegi = ");
        labelhasilpersegi.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 10; -fx-border-color: WHITE;");
        VBox vboxpersegi = new VBox(labelsisipersegi,sisipersegi,labelhasilpersegi,luaspersegi,kelilingpersegi,clear,balikmenu);
        vboxpersegi.setAlignment(Pos.CENTER);
        vboxpersegi.setStyle("-fx-background-color: #202922;");
        Scene scene3 = new Scene(vboxpersegi,500,500);
        
        stage.setScene(scene3);

        luaspersegi.setOnAction(event ->{
            int angkapersegi= Integer.parseInt(sisipersegi.getText());
            int luaspersegihasil= angkapersegi*angkapersegi;
            labelhasilpersegi.setText("Luas Persegi = "+luaspersegihasil);});
        kelilingpersegi.setOnAction(event ->{
            int angkapersegi= Integer.parseInt(sisipersegi.getText());
            int kelilingpersegihasil= angkapersegi*4;
            labelhasilpersegi.setText("Keliling Persegi = "+kelilingpersegihasil);});
        clear.setOnAction(event->{
            sisipersegi.clear();
            labelhasilpersegi.setText("");});
        balikmenu.setOnAction(event->{
            showSecondscene();
        });
            
    }
    private void KalkulatorPersegipanjang(){
        Button luaspersegipanjang = new Button("Hitung Luas");
        Button kelilingpersegipanjang = new Button("Hitung Keliling");
        Button clear2= new Button("CLEAR");
        Button balikmenu = new Button("KEMBALI KE MENU");
        TextField sisipersegipanjang = new TextField();
        sisipersegipanjang.setPromptText("masukin panjang");
        TextField lebarpersegipanjang = new TextField();
        lebarpersegipanjang.setPromptText("masukin lebar");
        Label labelsisipersegipanjang = new Label("MASUKKAN PANJANG SISI");
        labelsisipersegipanjang.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 10; -fx-border-color: WHITE;");
        Label labelsisipersegipanjang2 = new Label("MASUKKAN LEBAR SISI");
        labelsisipersegipanjang2.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 10; -fx-border-color: WHITE;");
        Label labelhasilpersegipanjang = new Label("PersegiPanjang =");
        labelhasilpersegipanjang.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 10; -fx-border-color: WHITE;");
        VBox vboxpersegi = new VBox(labelsisipersegipanjang,sisipersegipanjang,labelsisipersegipanjang2,lebarpersegipanjang,labelhasilpersegipanjang,luaspersegipanjang,kelilingpersegipanjang,clear2,balikmenu);
        vboxpersegi.setAlignment(Pos.CENTER);
        vboxpersegi.setStyle("-fx-background-color: #202922;");
       
        Scene scene3 = new Scene(vboxpersegi,500,500);
        stage.setScene(scene3);

        luaspersegipanjang.setOnAction(event ->{
            int panjangpersegipanjang= Integer.parseInt(sisipersegipanjang.getText());
            int lebarintpersegipanjang= Integer.parseInt(lebarpersegipanjang.getText());
            int luaspersegipanjanghasil= panjangpersegipanjang*lebarintpersegipanjang;
            labelhasilpersegipanjang.setText("Luas Persegi Panjang = "+luaspersegipanjanghasil);});
        kelilingpersegipanjang.setOnAction(event ->{
            int panjangpersegipanjang= Integer.parseInt(sisipersegipanjang.getText());
            int lebarintpersegipanjang= Integer.parseInt(lebarpersegipanjang.getText());
            int kelilingpersegipanjanghasil= panjangpersegipanjang+panjangpersegipanjang+lebarintpersegipanjang+lebarintpersegipanjang;
            labelhasilpersegipanjang.setText("Keliling Persegi Panjang = "+kelilingpersegipanjanghasil);});
        clear2.setOnAction(event->{
            sisipersegipanjang.clear();
            lebarpersegipanjang.clear();
            labelhasilpersegipanjang.setText("");});
        balikmenu.setOnAction(event->{
            showSecondscene();
        });
            
    }

    private void kalkulatorcuy(){
        Label label = new Label("  CALCULATORKITA ");
        label.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 60; -fx-border-color: WHITE;");
       
        VBox vbox1 =new VBox(10,label);
        vbox1.setAlignment(Pos.TOP_CENTER);
        

        TextField imput1 = new TextField();
        imput1.setPromptText("masukin angka");
        TextField imput2 = new TextField();
        imput2.setPromptText("masukin angka");

        GridPane gridpane = new GridPane();
        gridpane.setVgap(10);
        gridpane.add(imput1,0,0);
        gridpane.add(imput2,0,1);
        gridpane.setAlignment(Pos.CENTER);

        // VBox vbox2 = new VBox(10, imput1,imput2);
        // vbox2.setAlignment(Pos.TOP_CENTER);


        Label labelhasil1 = new Label(" HASIL =  ");
        labelhasil1.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 60");
        Label labelhasil2 = new Label();
        labelhasil2.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 20px; -fx-background-color: #93aa14; -fx-text-fill: #020201; -fx-background-radius: 60");
        
        HBox hbox1 = new HBox(10, labelhasil1,labelhasil2);
        hbox1.setAlignment(Pos.CENTER);
        
        Button button1 = new Button("+");
        button1.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 15px; -fx-font-weight: bold; -fx-background-color: #db6e02; -fx-text-fill: #020201; -fx-background-radius: 100;");
        Button button2 = new Button("-");
        button2.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 15px; -fx-font-weight: bold; -fx-background-color: #db6e02; -fx-text-fill: #020201; -fx-background-radius: 100;");
        Button button3 = new Button("X");
        button3.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 15px; -fx-font-weight: bold; -fx-background-color: #db6e02; -fx-text-fill: #020201; -fx-background-radius: 100;");
        Button button4 = new Button("/");
        button4.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 15px; -fx-font-weight: bold; -fx-background-color: #db6e02; -fx-text-fill: #020201; -fx-background-radius: 100;");

        HBox hbox2= new HBox(10,button1,button2,button3,button4 );
        hbox2.setAlignment(Pos.TOP_CENTER);


        Button button5 = new Button("CLEAR");
        button5.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 10px; -fx-font-weight: bold; -fx-background-color: #a38d20; -fx-text-fill: #020201; -fx-background-radius: 100;");
        Button button6 = new Button("BACK TO HOME");
        button6.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-size: 10px; -fx-font-weight: bold; -fx-background-color: #a38d20; -fx-text-fill: #020201; -fx-background-radius: 100;");

        VBox vbox3 = new VBox(10,button5,button6);
        vbox3.setAlignment(Pos.TOP_CENTER);

        VBox vboxasli = new VBox(10, vbox1,gridpane,hbox1,hbox2,vbox3);
        vboxasli.setAlignment(Pos.CENTER);
        vboxasli.setStyle("-fx-background-color: #202922;");


        Scene scene4 = new Scene(vboxasli,500,500);
        stage.setScene(scene4);

        button1.setOnAction(a->{
            double angka1=Double.parseDouble(imput1.getText());
            double angka2=Double.parseDouble(imput2.getText());
            double hasil = angka1+angka2;
            if(hasil%1==0){
                int hasilInt=(int)hasil;
                // String hasilText = String.valueOf(hasilInt);
                labelhasil2.setText(""+hasilInt);
                 }
            else{
                labelhasil2.setText(""+hasil);
            }
        });
        button2.setOnAction(a->{
            double angka1=Double.parseDouble(imput1.getText());
            double angka2=Double.parseDouble(imput2.getText());
            double hasil = angka1-angka2;
            if(hasil%1==0){
                int hasilInt=(int)hasil;
                // String hasilText = String.valueOf(hasilInt);
                labelhasil2.setText(""+hasilInt);
                 }
            else{
                labelhasil2.setText(""+hasil);
            }
        });
        button3.setOnAction(a->{
            double angka1=Double.parseDouble(imput1.getText());
            double angka2=Double.parseDouble(imput2.getText());
            double hasil = angka1*angka2;
            if(hasil%1==0){
                int hasilInt=(int)hasil;
                // String hasilText = String.valueOf(hasilInt);
                labelhasil2.setText(""+hasilInt);
                 }
            else{
                labelhasil2.setText(""+hasil);
            }
        });
        button4.setOnAction(a->{
            double angka1=Double.parseDouble(imput1.getText());
            double angka2=Double.parseDouble(imput2.getText());
            double hasil = angka1/angka2;
            if(hasil%1==0){
                int hasilInt=(int)hasil;
                // String hasilText = String.valueOf(hasilInt);
                labelhasil2.setText(""+hasilInt);
                 }
            else{
                labelhasil2.setText(""+hasil);
            }
        });
        button5.setOnAction(event->{
            imput1.clear();
            imput2.clear();
            labelhasil2.setText("");});
        button6.setOnAction(a->{showSecondscene();});
        


    }




        public static void main(String[] args) {
            launch(args);
        }
        }


