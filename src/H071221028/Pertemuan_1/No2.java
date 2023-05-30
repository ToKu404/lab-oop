package H071221028.Pertemuan_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class No2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int n = scanner.nextInt();

      int countDecimal = 0;
      int countInteger = 0;

      for (int i = 0; i < n; i++) {
        float number = scanner.nextFloat();

        if (number - (int)number > 0) {  // angka - angka, jika agka menyisakan angka dibelakang koma akan masuk ke bilangan desimal
          countDecimal++;
        } else {
          countInteger++;
        }
      }

      System.out.printf("%d Bilangan Bulat\n", countInteger);
      System.out.printf("%d Bilangan Desimal\n", countDecimal);
    } catch (InputMismatchException e) {
      System.out.println("Please input a number!");
      e.printStackTrace();
    }

    scanner.close();
  }
}


// import java.util.Scanner;

// public class Dua {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Masukkan jumlah bilangan: ");
//         int n = scanner.nextInt();
//         int decimals = 0;
//         int integers = 0;

//         for (int i = 0; i < n; i++) {
//             System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
//             double num = scanner.nextDouble();
//             if (num == (int) num) {
//                 integers++;
//             } else {
//                 decimals++;
//             }
//         }

//         System.out.println("Jumlah bilangan decimal: " + decimals);
//         System.out.println("Jumlah bilangan bulat: " + integers);
//     }
// }
