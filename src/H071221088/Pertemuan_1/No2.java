package H071221088.Pertemuan_1;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        System.out.print("Masukkan angka : ");
        Scanner input = new Scanner(System.in);
        try{
            int a = input.nextInt();
            int desimal = 0;
            int bulat = 0;
            for (int i = 0; i < a; i++) {
                System.out.print("Masukkan bilangan ke " + (i+1) + " : ");
                double bilangan = input.nextDouble();
                if (bilangan%1 == 0) {
                    bulat++;
                }
                else {
                    desimal++;
                }
            }
        System.out.println(bulat + (" Bilangan Bulat"));
        System.out.println(desimal + (" Bilangan Desimal"));
        input.close();
        }
        catch (Exception e) {
            System.out.println("Inputan hanya berupa angka");
        }
    }
}
    