package H071221092.Pertemuan_1;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        int nim;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = keyboard.nextInt();

        if (nim % 7 == 0) {
            System.out.println("Soal: no 7");
        } else if (nim % 7 == 1) {
            System.out.println("Soal: no 1");
        } else if (nim % 7 == 2) {
            System.out.println("Soal: no 2");
        } else if (nim % 7 == 3) {
            System.out.println("Soal: no 3");
        } else if (nim % 7 == 4) {
            System.out.println("Soal: no 4");
        } else if (nim % 7 == 5) {
            System.out.println("Soal: no 5");
        } else if (nim % 7 == 6) {
            System.out.println("Soal: no 6");
        }
        keyboard.close();
    }

}
