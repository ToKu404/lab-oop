package H071221066.Pertemuan_1;
//mengimport scanner 
import java.util.Scanner;                                                     

public class No6 {
    public static void main (String[] args){
//menggunakann try catch untuk menangani jika terjadi error pada program
        try {                                                                 
            Scanner inputLingkaran = new Scanner(System.in); 
//deklarasi variabel r sebagai jari-jari, luas, dan juga nilai phi                 
            double r, luas, phi = 3.14;                                       
//input nilai jari-jari
            System.out.print("Jari-jari lingkaran : ");                    
            r = inputLingkaran.nextDouble();   

//rumus menghitung luas lingkaran  
            luas = phi*Math.pow(r, 2);  

//program dijalankan dengan print format, karena pada soal harus menampilkan output 2 angka dibelakang koma
            System.out.printf("Luas lingkaran adalah: %.2f", luas);   
            inputLingkaran.close();

//catch dijalankan apabila inputan yang dimasukkan bukan angka 
        }catch (Exception e) {                                                
            System.out.print("input yang dimasukkan bukan angka");        
        }
    }
}
