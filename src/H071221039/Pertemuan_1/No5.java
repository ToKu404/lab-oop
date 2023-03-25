package H071221039.Pertemuan_1;

import java.util.Scanner; // import library untuk menginput
public class No5 { // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main(String[] args) { // main method tempat untuk mengeksekusi program
        Scanner sc = new Scanner (System.in);  // deklarasi variabel yang digunakan untuk menginput
        String kalender = sc.nextLine(); // mengisi variabel dengan menginput string
        sc.close(); // menutup inputan
        String[] arrKalender = kalender.split("-"); // menghilangkan strip(-) dari isi kalimat lalu menyimpan dalam array
        konversi(arrKalender); // memanggil method

    }
    public static void konversi(String[] arrKalender){ // membuat method dengan parameter array yang telah dibuat
            String strTanggal = arrKalender[0]; // mengambil index 0 sebagai tanggal
            int intTanggal = Integer.parseInt(strTanggal); // mengubah tanggal menjadi integer
            
            String strBulan = arrKalender[1]; // mengambil index 1 sebagai bulan
            int intBulan = Integer.parseInt(strBulan); // mengubah bulan menjadi integer
            
            String [] namaBulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli",
            "Agustus","September","Oktober","November","Desember"}; // membat array daftar nama bulan tipe string
            
            String strTahun = arrKalender[2]; // mengambil index 2 sebagai tahun 
            int intTahun = Integer.parseInt(strTahun); // mengubah tahun menjadi integer

            if (intTahun > -1 && intTahun < 24){ // jika tahun yang diinput lebih dari -1 dan kurang dari 24 
                int tahunFix = intTahun + 2000; // maka akan ditambah 2000, patokan tahun ini
                System.out.println(intTanggal + " " +  namaBulan[intBulan-1] + " " + tahunFix); // menampilkan output dengan array namaBulan - 1 disebabkan index mulai dari 0
                return;
            } else if (intTahun > 23 && intTahun < 100); // jika tahun yang diinput lebih dari 23 dan kurang dari 100
                int tahunFix = intTahun + 1900; // maka akan ditambah 1900
                System.out.println(intTanggal + " " + namaBulan[intBulan-1] + " " + tahunFix); // menampilkan output dengan array namaBulan - 1 disebabkan index mulai dari 0
        }

    }

           


