
package H071221092.Pertemuan_1;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        String kalimat;

        System.out.print("Masukkan Judul Film : ");
        kalimat = inputan.nextLine();

        String kalimatBaru = new String();

        String[] array = kalimat.split(" ");
        for (int index = 0; index < array.length; index=index+1) {
            // System.out.print(array[index] + " ");
            String kataBaru = array[index].toUpperCase().charAt(0) + array[index].substring(1).toLowerCase();
            System.out.print(kataBaru + " ") ;
        }
        // Split kalimat menjadi beberapa kata:
        // // for (String kata : kalimat.split(" ")) {

        //     String kataBaru = kata.toUpperCase().charAt(0) + kata.substring(1).toLowerCase();

        //     // kalimatBaru.append(kataBaru).append(" ");
        //     kalimatBaru += kataBaru + (" ");
        // }
        //  System.out.println(kalimatBaru);
        //  inputan.close();
    }
}
