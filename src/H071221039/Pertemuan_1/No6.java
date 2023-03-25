package H071221039.Pertemuan_1;

import java.util.Scanner; // import library untuk menginput
public class No6 { // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main(String[] args){ // main method tempat untuk mengeksekusi program
        try{ // menangkap error
            Scanner sc = new Scanner (System.in); // deklarasi variabel yang digunakan untuk menginput
            System.out.print("Input Jari-Jari Lingkaran : "); // manampilkan output sebagai tempat inputan
            double r,phi,hasil; // deklarasi variabel
            phi = 3.14; // nilai phi
            r = sc.nextFloat(); // menginput jari-jari
            hasil = phi * r * r; // rumus lingkaran
            System.out.printf("%.2f",hasil); // menampilkan output dgn print format kemudia membatasi 2 angka dibelakang koma
            sc.close(); // menutup inputan
        } catch (Exception e){ // menangkap error
            System.out.println("Inputan bukan angka"); // jika terdapat error maka baris ini yang akan menjadi outputnya
        }
    }
}
