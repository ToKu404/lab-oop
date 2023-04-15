package H071221088.Pertemuan_1;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        int [][] angka = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}, {10, 11}, {12}, {13, 14, 15, 16}};
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input angka yang ingin di cari : ");
            int inputAngka = input.nextInt();

            if (inputAngka > 16) {
                System.out.println("Angka yang di input di ada dalam array");
            }
            for (int i = 0; i < angka.length; i++) {
                for(int j = 0; j < angka[i].length; j++) {
                    int angka1 = angka[i][j];
                    if (angka1 == inputAngka) {
                        System.out.println("Found " + inputAngka + " at [" + i +"][" + j + "]");
                        break;
                    }
                }    
            }
        } 
        catch (Exception e) {
            System.out.println("Input harus berupa data integer (angka)");
        }
        input.close();
    }
}