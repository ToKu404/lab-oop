package H071221104.Pertemuan_1;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = inp.nextInt();

            int desimal = 0;
            int bulat = 0;

            for (int i = 0; i < n; i++) {
                // for (int i = 0; i < n; i++) adalah sebuah perulangan dalam bahasa pemrograman
                // java.
                // Arti dari perulangan ini adalah "untuk nilai awal i sama dengan 0; lakukan
                // perintah-perintah di dalam blok perulangan ini selama i kurang dari nilai n;
                // setiap kali perintah-perintah di dalam blok perulangan selesai dieksekusi,
                // tambahkan 1 ke nilai i".
                // Dalam konteks ini, n adalah sebuah variabel atau konstanta yang menyatakan
                // jumlah iterasi atau pengulangan yang ingin dilakukan.

                // System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                double num = inp.nextDouble();

                if (num % 1 == 0) {
                    bulat++;
                } else {
                    desimal++;
                }
            }

            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");
            inp.close();
        } catch (Exception e) {
            System.out.println("Hanya bisa menerima angka");
        }
    }
}
