package H071221039.Pertemuan_1;

import java.util.Scanner; // import library untuk menginput
public class No4 { // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main (String[] args){ // main method tempat untuk mengeksekusi program
        Scanner sc = new Scanner(System.in);  // deklarasi variabel yang digunakan untuk menginput
        String kalimat = sc.nextLine().toLowerCase(); // mengisi variabel dengan menginput string kemudian merubahnya jadi huruf kecil semua
        sc.close(); // menutup inputan
        String[] hasil = kalimat.split(" "); // menghilangkan spasi dari isi kalimat lalu menyimpan dalam array
        upper(hasil); // memanggil method
            }



    public static void upper(String[]hasil) { // membuat method dengan parameter array yang telah dibuat
        for (int i = 0; i < hasil.length;i++){ // melakukan perulangan untuk mengakses isi array
            String hurufAwal = hasil[i].substring(0, 1); // mengambil huruf pertama dari setiap index
            hurufAwal = hurufAwal.toUpperCase(); // mengubah huruf awal menjadi huruf kapital
            String sisaKata = hasil[i].substring(1, hasil[i].length()); // mengambil sisa huruf setiap index
            String fix = hurufAwal + sisaKata; // menambahkan kembali huruf pertama dengan sisa kata
            System.out.print(fix+" "); // menambahkan kembali spasi
        
        }
               

           
    }
}
