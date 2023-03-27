package H071221066.Pertemuan_1;
//mengimport scanner
import java.util.Scanner;                                                           

public class No4 {
    public static void main(String[] args) {
//membuat scanner baru 
        Scanner inputKalimat = new Scanner(System.in);                              
//meminta inputan ke user 
        System.out.print("Masukkan kalimat: ");                                  
        String kalimat = inputKalimat.nextLine();                                   
//mengambil variabel string kalimat lalu mengubah menjadi huruf kecil dan membagi string dengan spasi 
        String[] kata = kalimat.toLowerCase().split(" ");                   
        String kalimatBaru = "";       
//membuat perulangan untuk menambah huruf selanjutnya setelah indeks pertama dari kaata di ubah menjadi kapital               
        for (int i = 0; i < kata.length; i++) {                                   
            kalimatBaru += kata[i].toUpperCase().charAt(0) + kata[i].substring(1) + " ";
        }
        
//menampilkan output
        System.out.println("Kalimat setelah diubah: " + kalimatBaru);      
        inputKalimat.close();
    }
}