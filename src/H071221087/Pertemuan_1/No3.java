package H071221087.Pertemuan_1;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Umur : ");
        String usia = sc.nextLine(); //jika di sini Nextint atau nextdouble atau next, lalu dibawahnya ada nextline maka harus ada nextLine diantanya
        sc.nextLine();
        System.out.print("Hobby : ");
        String hobby = sc.nextLine();
        sc.close();

        System.out.print("Nama saya " + nama + ", "  + usia + " Tahun, " + "Hobby " + hobby);
    } catch(Exception e) {
        System.out.println("Masukkan Umur berupa angka!!");
    }
    
}
}
