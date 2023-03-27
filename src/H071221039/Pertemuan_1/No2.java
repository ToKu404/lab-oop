package H071221039.Pertemuan_1;

import java.util.Scanner; // import library untuk menginput
public class No2 { // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main(String[] args){ // main method tempat untuk mengeksekusi program
        try{ // digunakan untuk menangkap error
            Scanner sc = new Scanner(System.in); // deklarasi variabel yang digunakan untuk menginput
            int n = sc.nextInt(); // mengisi variabel dengan menginput
            Double[] nums = new Double[n]; // deklarasi array dengan panjang sesuai inputan
            int panjangBulat,panjangDesimal; // deklarasi variabel
            panjangBulat = 0; // mengisi nilai variabel 
            panjangDesimal = 0; // mengisi nilai variabel

            for (int i = 0; i<n;i++){ // melakukan perulangan untuk array
                nums[i]= sc.nextDouble(); // mengisi nilai array dengan 1 baris
                
                if (nums[i] % 1 != 0){ // jika nilai array dalam index i tidak sama dengan nol maka itu adalah desimal
                    panjangDesimal += 1; // menambah 1 setiap kali nilai array yang didapat adalah desimal
                } else { // jika nilai array dalam index i sama dengan nol maka itu adalah bulat
                    panjangBulat += 1; // menambah 1 setiap kali nilai array yang didapat adalah bulat
                }
        
            }
            System.out.printf("%d Bilangan Bulat \n%d Bilangan Desimal",panjangDesimal,panjangBulat); // menampilkan output dengan print format
            sc.close();
         }  catch (Exception e) { // menangkap error
            System.out.println("Inputan Bukan angka"); // jika terdapat error maka baris ini yang akan menjadi outputnya
         }
    }
    
}
