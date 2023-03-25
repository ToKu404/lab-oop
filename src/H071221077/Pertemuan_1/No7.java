package H071221077.Pertemuan_1;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        String[] namaNegara = { "Indonesia", "Malaysia", "Jepang", "Cina", "Thailand" };
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama negara yang dicari : ");
        String cari = input.nextLine(); // untuk membaca semua inputan
        input.close();

        System.out.println(findIndex(namaNegara, cari));
    }

    public static int findIndex(String[] array, String teks) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(teks)) { // untuk membandingkan dua str dgn mengabaikan besar-kecilnya
                return i;
            }
        }
        return -1;
    }
}
