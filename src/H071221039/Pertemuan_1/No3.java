package H071221039.Pertemuan_1;

import java.util.Scanner; // import library untuk menginput
public class No3 { // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main (String[] args){ // main method tempat untuk mengeksekusi program
        try{  // digunakan untuk menangkap error
        Scanner sc = new Scanner (System.in);  // deklarasi variabel yang digunakan untuk menginput
        String name, hobby; // deklarasi variabel
        System.out.print("Nama : "); // menampilkan output tempat menginput nama dengan print biasa
        name = sc.nextLine(); // mengisi variabel menginput string dengan perintah print baris baru agar dapat menampilkan semua inputan ketika lebih dari 1 kata
        System.out.print("Umur : "); // menampilkan output tempat menginput nama dengan print biasa
        int umur = sc.nextInt(); // mengisi variabel dengan menginput integer
        sc.nextLine(); // dilakukan pemisah karena sebelumnya kita menginput int kemudian dibawah kita akan menginput println agar program tidak kacau
        System.out.print("Hobby : "); // menampilkan output tempat menginput nama dengan print biasa
        hobby = sc.nextLine();// mengisi variabel menginput string dengan perintah print baris baru agar dapat menampilkan semua inputan ketika lebih dari 1 kata
        System.out.printf("Nama saya %s, %d tahun, hobby %s",name, umur, hobby); // menampilkan output dengan print format
        sc.close(); // menutup inputan
        } catch (Exception e){ // digunakan untuk menangkap error
            System.out.println("Inputan untuk umur bukan angka"); // jika terdapat error maka baris ini yang akan menjadi outputnya
        }
    }
}
