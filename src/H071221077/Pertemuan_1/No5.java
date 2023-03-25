package H071221077.Pertemuan_1;

import java.util.HashMap;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        HashMap<String, String> bulan = new HashMap<>();
        bulan.put("01", "Januari");
        bulan.put("02", "Februari");
        bulan.put("03", "Maret");
        bulan.put("04", "April");
        bulan.put("05", "Mei");
        bulan.put("06", "Juli");
        bulan.put("07", "Juni");
        bulan.put("08", "Agustus");
        bulan.put("09", "September");
        bulan.put("10", "Oktober");
        bulan.put("11", "November");
        bulan.put("12", "Desember");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal : ");

        String tanggal = input.next();
        String day = tanggal.substring(0, 2); // substring untuk mengambil bbrp karakter dlm str (index)
        System.out.print(Integer.parseInt(day) + " ");
        String bln = tanggal.substring(3, 5);
        // int month = Integer.parseInt(bl); //parseInt untuk mengubah str menjadi int
        System.out.print("" + bulan.get(bln) + " ");
        String thn = tanggal.substring(6, 8);
        int year = Integer.parseInt(thn);
        if (year <= 23) {
            System.out.print("20" + thn + "\n");
        } else {
            System.out.print("19" + thn + "\n");
        }

        input.close();
    }
}
