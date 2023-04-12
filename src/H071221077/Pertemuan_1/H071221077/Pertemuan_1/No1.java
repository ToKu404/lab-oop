package H071221077.Pertemuan_1;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        String nim;
        Scanner keyboard = new Scanner(System.in);      // untuk menginput
        System.out.print("Masukkan NIM: ");
        nim = keyboard.next();      //tipe data
        String inp = nim.substring(nim.length()-3);     // inputan utk mengambil 3 angka dblkg nim
        
        int angka = Integer.parseInt(inp);      //mengubah str menjadi int

        if (angka % 7 == 0) {
            System.out.println("Soal: no 7");       // kalau angka % 7 = 0 muncul no 7
            } else{
                System.out.printf("Soal : no %d\n" , angka % 7 );       //kalau angka % 7 = selain 0, muncul
            } 
        
        keyboard.close();
    }

}