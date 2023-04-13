package H071221077.Pertemuan_1;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Menghitung Luas Lingkaran ");
            System.out.println("Masukkan Jari-jari Lingkaran");
            double r = input.nextDouble();

            // String luas = String.format ("%.2f" , (Math.PI * r *r)) ; //angka blkg koma 2
            System.out.printf("Luas Lingkaran = %.2f\n", (Math.PI * r * r));
            // System.out.println("Luas Lingkaran = " + luas);

        } catch (Exception e) {
            System.out.println("Input Harus Berupa Angka");

        }
        input.close();
    }

}