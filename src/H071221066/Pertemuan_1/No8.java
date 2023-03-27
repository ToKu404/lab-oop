package H071221066.Pertemuan_1;
//import scanner
import java.util.Scanner;                                                                   

public class No8 {
    public static void main(String[] args) {
//menggunakan try catch untuk penanganan error 
        try {
//membuat array 2d
            int[][] nums = {{1, 2, 3}, {4, 5, 6, 10}, {7, 8, 9}};                              
            Scanner inp = new Scanner(System.in);                                   
            int angka = inp.nextInt();
            inp.close();

//menggunakan 2 perulangan untuk mencari letak baris dan kolom dari inputan yang dimasukkan 
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i] [j] == angka ) {
                        System.out.println("Found " + angka + " at " + i + " " + j);
                        return;
                        }
                    }
                }
//catch akan dijalankan apabila inputan yang dimasukkan bukan angka
        }catch(Exception e) {    
            System.out.println("Hanya bisa menerima angka"); 
        }
    } 
}
