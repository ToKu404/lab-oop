package H071221028.Pertemuan_1;

import java.util.Scanner;

public class No4 {
  public static String capitalizeFirstCharacter(String sentence) {
    String words[] = sentence.split("\\s");

    String returnSentence = "";

    // for (int i = 0; i < words.length; i++) {
    //   words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();

    //   returnSentence += words[i];
    //   if (i < words.length - 1) {
    //     returnSentence += " ";
    //   }
    // } 
    for (String word : words ){
      word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

      returnSentence += word;
        returnSentence += " ";
      
      
    }

    return returnSentence;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan Judul Film :\n> ");
    String sentence = scanner.nextLine();

    System.out.println(capitalizeFirstCharacter(sentence));

    scanner.close();
  }
}
