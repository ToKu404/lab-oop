package H071221066.Pertemuan_1;
//import scanner 
import java.util.Scanner;                                                      
public class No1 {
    public static void main(String[] args){
//buat scanner baru 
        Scanner input = new Scanner(System.in);   
//deklarasi variabel NIM dengan string dan var soal dengan int                          
        String nim;                                                          
        int soal;
//buat inputan 
        System.out.print("NIM : ");                                        
        nim = input.next();  
//mengambil NIM dengan indeks ke 7 lalu dimasukkan ke variabel soal                                             
        soal = Integer.parseInt(nim.substring(nim.length()-3));    

//membuat kondisi
        if (soal % 7 == 0) {                                                   
            System.out.println("Soal : No 7");
        }else {                                                               
            System.out.println("Soal : No " + soal%7);
        input.close();
        }   
    }
}
