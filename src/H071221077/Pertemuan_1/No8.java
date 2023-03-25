package H071221077.Pertemuan_1;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input satu bilangan
        try {
            System.out.print("Masukkan satu bilangan : ");
            int bilangan = scanner.nextInt();
            scanner.close();

            int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            // boolean found = false;

            for (int i = 0; i < array2D.length; i++) { // i untuk indeks yg per kurung kurawal warna ungu
                for (int j = 0; j < array2D[i].length; j++) { // j untuk indeks bilangan yg didalam kurung kurawal warna
                                                              // ungu
                    if (array2D[i][j] == bilangan) {
                        System.out.println("Bilangan " + bilangan + " ditemukan pada indeks [" + i + "][" + j + "]");
                        // found = true;
                        return; // langsung menghentikan method
                    }

                    System.out.println("Indeks sekarang " + i + " " + j);
                }
            }
            // if (!found) {
            // System.out.println("Bilangan " + bilangan + " tidak ditemukan pada array
            // 2D");
            // }
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");

        }
    }
}