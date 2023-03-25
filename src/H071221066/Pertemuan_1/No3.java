package H071221066.Pertemuan_1;
//mengimport Scanner
import java.util.Scanner;                                                        

public class No3 {
    public static void main(String[] args){
//menggunakann try catch untuk menangani jika terjadi error pada program
        try {  
//membuat scanner baru                                                                  
            Scanner input = new Scanner(System.in);  
//mendeklarasikan variabel nama dan hobby menggunakan string, sedangkan umur menggunakan int                           
            String name, hobby;                                                 
            int umur;

//meminta inputan ke user
            System.out.print("Nama : ");                                     
            name = input.nextLine();                                           

            System.out.print("Umur : ");
            umur = input.nextInt();

//.nextLine() perlu ditambahkan karena jika .nextInt berada dibawah .nextLine maka baris selanjutnya akan dilewati
            input.nextLine();                                                  
            System.out.print("Hobby : ");
            hobby = input.nextLine();

//menampilkan output 
            input.close();
            System.out.print("Nama saya " + name + ", " + umur + " tahun, " + "hobby " + hobby);   

//catch akan dijalankan apabila umur yang dimasukkan bukan angka 
        }catch (Exception e) {                                     
            System.out.print("Umur yang diinput bukan angka");         
        }
    }
}
