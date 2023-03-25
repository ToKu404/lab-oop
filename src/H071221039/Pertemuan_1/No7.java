package H071221039.Pertemuan_1;

import java.util.Scanner; // import library untuk menginput

public class No7 { // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main(String[] args) { // main method tempat untuk mengeksekusi program
        Scanner sc = new Scanner(System.in); // deklarasi variabel yang digunakan untuk menginput
        String buah = sc.next(); // manampilkan output sebagai tempat inputan
        sc.close(); // menutp inputan
        System.out.println(findIndex(buah)); // memanggil method dengan print karena method yang mengembalikan nilai

    }

    public static int findIndex(String buah) { // membuat method dengan paramater inputan
        String[] arrBuah = { "Coconut", "Apple", "Banana", "Strawberry" }; // membuat array tipe string
        int index = -1; // membuat variabel dengan nilai -1 untuk dikembalikan jika inputan tidak ada
                        // dalam array
        for (int i = 0; i < arrBuah.length; i++) { // melakukan perulangan untuk mengakses nilai array
            if (buah.equalsIgnoreCase(arrBuah[i])) { // membandingkan inputan dengan nilai yang ada disetiap index tanpa
                                                     // memandang kapital
                index = i; // mengubah nilai index menjadi i jika sesuai dengan isi array
                return index; // mengembalikan index
            }
        }
        return index; // jika tidak terdapat maka mengembalikan index -1
    }
}
