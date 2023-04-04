package H071221028.Pertemuan_1;

import java.util.Scanner;

public class No1 { // nama file classnya
    public static void main(String[] args) {
        String nim; // variable
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = keyboard.next();
        String inp = nim.substring(nim.length() - 3); // memasukkan index yang diminta, -3 untuk 3 angka terakkhir

        int angka = Integer.parseInt(inp); // modifikasi tipedata

        if (angka % 7 == 0) {
            System.out.println("soal: no 7");
        } else {
            System.out.printf("soal : no %d\n", angka % 7); // %d untuk angka int
        }

        keyboard.close();
    }

}
