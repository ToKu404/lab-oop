package H071221028.Pertemuan_1;

import java.util.Scanner;

public class No6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input jari-jari: ");
    double jariJari = scanner.nextDouble();

    double area = (22.0 / 7.0) * jariJari * jariJari;

    System.out.printf("Luas lingkaran: %.2f\n", area); // pakai %.2f untuk 2 angka dibelakang koma

    scanner.close();
  }
}
