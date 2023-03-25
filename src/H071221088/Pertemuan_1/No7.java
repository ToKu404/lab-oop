package H071221088.Pertemuan_1;

import java.util.Scanner;
public class No7 {
    static String[] serangga = {"Tawon", "Nyamuk", "Lalat", "Ngengat", "Rayap", "Lipan", "Ulat", "Belatung", "Laron",
"Kumbang", "Belalang"};
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Key: ");
    String inputSerangga = input.next();
    int indexSerangga = findIndex(inputSerangga);
    System.out.println(indexSerangga);
    input.close();
}
static int findIndex(String inputserangga){
    inputserangga = inputserangga.toLowerCase();
    int result = -1;
    for (int i = 0; i < serangga.length; i++) {
        String serangga1 = serangga[i];
        serangga1 = serangga1.toLowerCase();
        if (serangga1.equals(inputserangga)){
            result = i;
        }
    }
    return result;
}
}