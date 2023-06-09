package H071221099.Pertemuan_1;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = inp.nextLine(); // kucing
        String[] kata = kalimat.toLowerCase().split(" ");
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) {
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1).toLowerCase() + " ";
        }
        // 'kata' adalah sebuah string yang berisi beberapa kata yang dipisahkan oleh
        // spasi.
        // 'i' adalah sebuah variabel yang digunakan untuk mengakses setiap kata pada
        // string 'kata' satu per satu, dimulai dari indeks ke-0.
        // 'substring(0, 1)' digunakan untuk memilih karakter pertama dari setiap kata
        // pada string 'kata'.
        // 'toUpperCase()' digunakan untuk mengubah karakter pertama menjadi huruf
        // kapital.
        // 'substring(1)' digunakan untuk memilih karakter-karakter setelah karakter
        // pertama pada setiap kata.
        // '+ " "' digunakan untuk menambahkan spasi setelah setiap kata yang sudah
        // diubah huruf kapital pada string 'Baru'.
        // Hasil akhir dari perintah ini adalah sebuah string baru 'Baru' yang berisi
        // setiap kata pada string 'kata' dengan huruf pertama yang diubah menjadi huruf
        // kapital dan dipisahkan oleh spasi.

        System.out.println(kalimatBaru);
        inp.close();
    }
}
