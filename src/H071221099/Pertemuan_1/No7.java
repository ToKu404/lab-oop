package H071221099.Pertemuan_1;

import java.util.Scanner;

public class No7 {
    static String[] hewan = { "Singa", "Monyet", "Kucing", "Cheetah", "Anjing", "Semut", "Cicak", "Gajah",
            "Kerbau", "Burung", "Kambing" };

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Kata Kunci: ");
        String inputHewan = inp.next();
        int indexHewan = findIndex(inputHewan);
        System.out.println(indexHewan);
        inp.close();
    }

    static int findIndex(String inputHewan) {
        // inputHewan = inputHewan.toLowerCase();
        int result = -1;
        for (int i = 0; i < hewan.length; i++) {
            String hewan1 = hewan[i];
            // hewan1 = hewan1.toLowerCase();
            if (hewan1.equalsIgnoreCase(inputHewan)) {
                result = i ;
            }
        }
        return result;
    }

}
