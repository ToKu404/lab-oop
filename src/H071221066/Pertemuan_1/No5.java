package H071221066.Pertemuan_1;
//import Scanner
import java.util.Scanner;                                               

public class No5 {
    public static void main(String[] args){
//membuat scanner baru
        Scanner input = new Scanner (System.in);                        
        String x = input.next();                                        
              
//.substring digunakan u/ mengambil beberapa karakter dari kalimat yang diinput menggunakan index 
        String hari = x.substring(0,2); 
//Integer.parseInt digunkan untuk mengonversi string ke int            
        System.out.print(Integer.parseInt(hari));                       
        
        String bulan = x.substring(3, 5);
        int month = Integer.parseInt(bulan);
//menggunakan array 
        String months[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.print(" " + months[month-1]+" ");
                                                                    
        String tahun = x.substring(6, 8);        
        int year = Integer.parseInt(tahun);

//membuat kondisi untuk menentukan tahun 
        if (year <= 23) {                                                  
            System.out.println("20" + tahun);                             
        }else {
            System.out.println("19" + tahun);
        }
        input.close();
    }
}
