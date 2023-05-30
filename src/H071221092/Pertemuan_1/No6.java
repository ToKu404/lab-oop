package H071221092.Pertemuan_1;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       //Deklarasi variabel
       double luas, phi=3.14;
       double r;
    try {
       //Input nilai jari-jari
       System.out.print("Masukan Jari-jari : ");
       r = input.nextDouble();

       //Menghitung luas lingkaran
       luas = phi*r*r;

       //untuk menampilkan  hasil
       System.out.printf("Luas Lingkaran = %.2f",luas);
       input.close();
    } catch(Exception a) {
        System.out.println("Inputan bukan angka");
    }
    } 
}
