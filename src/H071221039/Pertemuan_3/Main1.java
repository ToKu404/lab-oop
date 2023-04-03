package H071221039.Pertemuan_3;
public class Main1 {
    public static void main(String[] args) {;
        Person person1 = new Person("Undertaker", "Man");
        Person person2 = new Person("Randy Orton", "Man");
        WWE player1 = new WWE(person1, "Tombstone Piledriver", 3000, 5000);
        WWE player2 = new WWE(person2, "RKO", 2000, 5000);
        System.out.println("===== PLAYER 1 =====");
        player1.identitasPegulat();
        System.out.println("===== PLAYER 2 =====");
        player2.identitasPegulat();
        System.out.println("====== SMACK =====");
        player2.smack(player1);
        System.out.println("");
        player1.smack(player2);
        
    }
}
