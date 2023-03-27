package H071221087.Pertemuan_1;

import java.util.Scanner;

public class No6 {
    public static void main (String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
        double jarijari;
        double luas;
        final double pi = 3.14;
        System.out.print("Masukkan jari-jari : ");
        jarijari = sc.nextDouble();
        luas = pi * jarijari * jarijari;
        sc.close();

        String hasil = String.format("%.2f", luas);
        System.out.println(hasil);
        } catch (Exception e) {
            
        }
    } 
}