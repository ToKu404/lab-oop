package H071221092.Pertemuan_1;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input satu bilangan
        try {
            System.out.print("Masukkan satu bilangan : ");
            int bil = scanner.nextInt();

            int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            boolean found = false;

            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (array2D[i][j] == bil) {
                        System.out.println("Bilangan " + bil + " ditemukan pada indeks [" + i + "][" + j + "]");
                        found = true;
                        return;
                    }
                }
            }
            if (!found) {
                System.out.println("Bilangan " + bil + " tidak ditemukan pada array 2D");
            }
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");

        }
        scanner.close();
    }
}