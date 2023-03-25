package H071221088.Pertemuan_1;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nama = ");
            String a = input.nextLine();
            System.out.print("Umur = ");
            int b = input.nextInt();
            input.nextLine();
            System.out.print("Hobby = ");
            String c = input.nextLine();
            System.out.println("Nama saya " + a + ", " + b + " tahun, hobby " + c);
        }
        catch (Exception e) {
            System.out.println("Inputan umur harus berupa angka");
        }
        input.close();
    }
}
