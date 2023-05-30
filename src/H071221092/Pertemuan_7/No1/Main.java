package No1;

public class Main {
    public static void printAttack(Character character) {
        System.out.println("Nama : " + character.getName());
        System.out.println("<==ATTACK INFORMATION==>");
        System.out.println("Attack Power : " + character.attackPower);
        if (character instanceof Fighter) {
            System.out.println("Mele : " + character.attack("Mele"));
            System.out.println("Ranged : " + character.attack("Ranged"));
        } else if (character instanceof Mage) { //instanceof untuk cek tipe objek atau karakter
            System.out.println("Fire : " + character.attack("Fire"));
            System.out.println("Frost : " + character.attack("Frost"));
        } 
    }
    public static void main(String[] args) {

        Character[] hero = new Character[5];
        hero[0] = new Fighter("Fara", 10);
        hero[1] = new Mage("Aulia", 20);
        hero[2] = new Fighter("Al Aini", 30);
        hero[3] = new Fighter("Syam", 40);
        hero[4] = new Mage("Ayya", 50);

        
        // for (Character i : hero) { 
        //     printAttack(i);
        //     System.out.println("");
        // }

        for (int i = 0; i<hero.length;i++){
            printAttack(hero[i]);
        }
    }
}