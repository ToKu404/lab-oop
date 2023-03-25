package H071221087.Pertemuan_1;

import java.util.Scanner;                                               

public class No2 {
    
    public static void main(String[] args) {
        try{ 
            Scanner sc = new Scanner(System.in);                          
            System.out.print("Masukkan jumlah bilangan: ");
            int nilai = sc.nextInt();
            int desimal = 0;
            int bulat = 0;
            
            for (int i = 0; i < nilai; i++) {
                double angka = sc.nextDouble();
                
                if (angka % 1 == 0) {
                    bulat++;
                } else {
                    desimal++;
                }
            }
            
            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");
            sc.close();

        }catch (Exception e) {
            System.out.println("Hanya bisa menerima angka");
        }
    }
}

