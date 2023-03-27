package H071221066.Pertemuan_1;
//import module scanner 
import java.util.Scanner;                                                     

public class No2 {                                                      
    
    public static void main(String[] args) {
//menggunakann try catch untuk menangani jika terjadi error pada program
        try{    
//mendeklarasi variabel bilangan desimal dan bilangan bulat dengan int                                                                        
            int desimal = 0;                                                            
            int bulat = 0;
//membuat scanner baru untuk mengambil input user 
            Scanner inp = new Scanner(System.in); 
//memasukkan inputan                                      
            System.out.print("Masukkan jumlah bilangan: ");                          
            int n = inp.nextInt();                                                     
            
//membuat perulangan yang menentukan panjang angka yang diinput
            for (int i = 0; i < n; i++) {                                               
                double num = inp.nextDouble();                              
                
//kemudian num-nya dibuatkan kondisi 
                if (num % 1 == 0) {                                                     
                    bulat++;
                } else {
                    desimal++;
                }
            }
//menampilkan output  
            System.out.println(bulat + " Bilangan Bulat");                              
            System.out.println(desimal + " Bilangan Desimal");
            inp.close();

//catch akan dijalankan apabila umur yang dimasukkan bukan angka 
        }catch (Exception e) {                                                          
            System.out.println("Hanya bisa menerima angka");                           
        }
    }
}
