package H071221039.Pertemuan_1;

import java.util.Scanner; // import library untuk menginput

public class No1 { // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main (String[] args){ // main method tempat untuk mengeksekusi program
        Scanner sc = new Scanner (System.in); // deklarasi variabel yang digunakan untuk menginput
        int jumlahSoal,hasil; // deklarasi variabel
        String nim = sc.next(); // mengisi variabel dengan menginput string
        nim = nim.substring(nim.length()-3); // memotong string atau mengakses string berdasarkan index untuk memperoleh angka terkahir NIM
        System.out.println(nim); // menampilkan output
        int nimInt = Integer.parseInt(nim); // mengubah tipe variabel string menjadi variabel
        jumlahSoal = 7; // mengisi jumlah soal sesuai dengan soal
        hasil = nimInt % jumlahSoal; // 3 angka terkahir nim dimodulokan dgn jumlah soal
        if (hasil == 0 ){ // jika hasilnya = 0 maka outputnya adalah jumlah soal sendiri
            System.out.println(jumlahSoal);   
        } else { // jika tidak maka outputnya adalah hasilnya sendiri
            System.out.println(hasil);
        }
        sc.close(); // menutup inputan setelah digunakan
    }
    
}