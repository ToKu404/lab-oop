package H071221077.Pertemuan_1;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner judul = new Scanner(System.in);
        String inp;

        System.out.print("Masukkan Judul Film : ");
        inp = judul.nextLine();

        String kalimatBaru = new String();

        // Split kalimat menjadi beberapa kata:
        // ["halo", "apa", "kabar", "semua"]
        for (String kata : inp.split(" ")) {

            // kata.substring(0, 1) untuk mengambil huruf pertama pada kata
            // toUpperCase() untuk mengubah character pertama jadi huruf kapital
            // kata.substring(1), mengambil character kedua sampai terakhir pada kata
            String kataBaru = kata.toUpperCase().charAt(0) + kata.substring(1).toLowerCase();

            // kalimatBaru.append(kataBaru).append(" ");
            kalimatBaru += kataBaru + " ";
        }
        System.out.println(kalimatBaru);
        judul.close();
    }
}