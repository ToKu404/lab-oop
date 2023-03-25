package H071221066.Pertemuan_1;

//import scanner
import java.util.Scanner;                                                   

public class No7 {
    public static void main(String[] args){
//membuat scanner baru dan meminta inputan 
        Scanner inp = new Scanner(System.in);    
        System.out.print("input bunga : ");
        String flower = inp.nextLine();                                      
        int hasil = findIndex(flower);                                         
        System.out.println("ditemukan di indeks " + hasil);                                          

        inp.close();
    }
//membuat method findIndex u/ mengecek indeks teks yang diinput
    public static int findIndex(String teks) {    
//membuat array dengan tipe string                              
        String bunga[] = {"Mawar", "melati", "kamboja", "matahari", "anggrek"};     
        int indeks= 0;
//membuat perulangan kemudian mengembalikan indeks 
        for (String b : bunga) {
            if (b.equalsIgnoreCase(teks)){
                return indeks;
            }
            indeks++;
        }
//mengembalikan -1 jika inputan tidak terdaftar dalam array 
        return -1;                                                               
    } 
}

