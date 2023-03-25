package H071221088.Pertemuan_1;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double r = input.nextDouble();
            double luas = Math.PI * (r*r);
            System.out.printf("Luas lingkaran adalah: %.2f", luas);
         } catch (Exception e) {
            System.out.println("Hanya menerima angka");
         }
         input.close();
    }
}
