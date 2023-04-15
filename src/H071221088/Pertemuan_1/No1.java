package H071221088.Pertemuan_1;

import java.util.Scanner;
public class No1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nim = ");
        String a = input.nextLine();
        System.out.print("Soal : no ");
        int angka = Integer.parseInt(a.substring(a.length()-3));
        if (angka%7 == 0) {
            System.out.println(7);
        }
        else {
            System.out.println(angka%7);
        }
        input.close();
    }
}


