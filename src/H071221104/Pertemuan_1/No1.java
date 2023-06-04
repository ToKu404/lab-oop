package H071221104.Pertemuan_1;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        int nim;
        Scanner key = new Scanner(System.in);
        System.out.print("Masukkan angka terakhir NIM: ");
        nim = key.nextInt();
        if (nim % 7 == 0){System.out.print("Soal no:7");}
        else {System.out.println("soal nomor :"+ nim % 7);}
        // else if (nim % 7 == 1){System.out.print("Soal no:1");}
        // else if(nim % 7 == 2){System.out.print("Soal no:2");}
        // else if(nim % 7 == 3){System.out.print("Soal no:3");}
        // else if(nim % 7 == 4){System.out.print("Soal no:4");}
        // else if(nim % 7 == 5){System.out.print("Soal no:5");}
        // else if(nim % 7 == 6){System.out.print("Soal no:6");}

        key.close();
    }
}
