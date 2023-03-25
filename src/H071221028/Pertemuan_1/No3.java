package H071221028.Pertemuan_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class No3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Name  : ");
      String name = scanner.nextLine();

      System.out.print("Umur  : ");
      int age = scanner.nextInt();

      scanner.nextLine(); // hapus \n yang masih tersisa di aliran input
      

      System.out.print("Hobby : ");
      String hobby = scanner.nextLine();

      System.out.printf("Nama saya %s, %d tahun, hobby %s.\n", name, age, hobby); 

    } catch (InputMismatchException e) {
      System.out.println("Please input with proper data format!");
      
    }

    scanner.close();
  }
}
