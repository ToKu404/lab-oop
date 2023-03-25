package H071221087.Pertemuan_1;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Judul Film: ");
        String nama = sc.nextLine();
        String hasil = kapitalKata(nama);
        System.out.println(hasil);
        sc.close();
    }

    public static String kapitalKata(String namaString) {
        String[] kata = namaString.split(" ");
        for (int i = 0; i < kata.length; i++) {
            if (kata[i].length() > 1) {
                String kapital = kata[i].substring(0, 1).toUpperCase();
                String tidakKapital = kata[i].substring(1).toLowerCase();
                kata[i] = kapital + tidakKapital;
            } else {
                kata[i] = kata[i].toUpperCase();
            }
        }

        String outputString = String.join(" ", kata);

        return outputString;
    }
}