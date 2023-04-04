package H071221092.Pertemuan_1;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        String [] Makanan = {"KFC" , "MCD" , "Shilin" , "Pangsit" , "Bakso"} ;
        Scanner input = new Scanner (System.in) ;
        System.out.println("Masukkan nama makanan:");
        String search = input.nextLine() ;
        input.close() ; //

        System.out.println(findIndex(Makanan, search));
    }
    public static int findIndex (String[] array, String teks) {
        for (int i = 0; i < array.length; i=i+1) {
            if (array[i].toLowerCase().equals(teks.toLowerCase())) {   // method untuk digunakan untuk mengabaikan case sensitive contohnya hurufbesar kecil pada inputan   //cara lain gunakan tolowercase
                return i ;
            }
        }
        return -1 ;  
    }
}