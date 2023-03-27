package H071221087.Pertemuan_1;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        try {
            int[][] nilai = { { 1, 2, 3 }, { 4, 5, 6, 10 }, { 7, 8, 9 } };
            Scanner sc = new Scanner(System.in);
            int angka = sc.nextInt();
            for (int i = 0; i < nilai.length; i++) {
                for (int j = 0; j < nilai[i].length; j++) {
                    if (nilai[i][j] == angka) {
                        System.out.println(i + " " + j);
                        return;
                    }
                }
                sc.close();
            }
        } catch (Exception e) {

        }
    }
}
