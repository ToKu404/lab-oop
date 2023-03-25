package H071221087.Pertemuan_1;

import java.util.Scanner;

public class No7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zoo = sc.nextLine();
        int taman = findIndex(zoo);
        System.out.println(taman);

        sc.close();
    }

    public static int findIndex(String teks) {
        String binatang[] = { "Singa", "gajah", "ayam", "bebek", "masbro" };
        for (int i = 0; i < binatang.length; i += 1) {
            if (binatang[i].equalsIgnoreCase(teks)) {
                return i;

            }
        }
        return -1;
    }

}