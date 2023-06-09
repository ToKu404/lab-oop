package H071221099.Pertemuan_1;

import java.util.Scanner;

class No1 {
    public static void main(String[] args) {
        String nim;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Masukkan NIM: ");
        nim = keyboard.next();
        String inp = nim.substring(nim.length()-3);

        int angka = Integer.parseInt(inp);

        if (angka % 7 == 0) {
            System.out.println("Soal: no 7");
        } else {
            System.out.printf("Soal: no %d\n", angka % 7);
        }
        keyboard.close();
    }
}