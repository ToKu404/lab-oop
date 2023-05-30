package H071221092.Pertemuan_1;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        try{
            System.out.print("Name  : ");
            String name = input.nextLine();

            System.out.print("Age   : ");
            int age = input.nextInt();
            input.nextLine();  //baris 

            System.out.print("Hobby : ");  
            String hobby = input.nextLine();

            System.out.print("Nama saya " + name + ", " + age + " Tahun, hobby " + hobby + ".");
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka");
        }
        input.close() ;
    }
}