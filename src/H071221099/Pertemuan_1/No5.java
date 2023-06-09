package H071221099.Pertemuan_1;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String hari, angkaBulan, tahun, tanggal, angkaTahun;
        String namaBulan="";
        System.out.print("Input: ");
        tanggal = inp.nextLine();
        hari = tanggal.substring(0, 1);
        angkaBulan = tanggal.substring(3, 5);
        tahun = tanggal.substring(6, 8);

        if (Integer.parseInt(tahun) > 23) {
            angkaTahun = "19"+tahun;
        }else {
            angkaTahun = "20"+tahun;
        }
        inp.close();
        
        
        switch (Integer.parseInt(angkaBulan)) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "July";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;   
            case 10:
                namaBulan = "Oktober";
                break; 
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak valid");
                break;
        }
        System.out.println(Integer.parseInt(hari)+" "+namaBulan+" "+angkaTahun);
    }
}