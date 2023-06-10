abstract class Character {
    protected String name ;
    protected int attackPower;

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
    
    abstract int attack(); // bertujuan untuk mengatur serangan karakter

    abstract int attack(String attackType); // bertujuan untuk mengatur serangan karakter dengan jenis serangan tertentu, yang ditentukan oleh parameter attackType.
}

class Fighter extends Character {

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        int AP = attackPower;
        if (attackType.equals("melee")) {
            AP = attackPower * 2; 
        } else if (attackType.equals("ranged")) {
            AP = attackPower;
        }
        return AP;
    }
    
}

class Mage extends Character {

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
      return attackPower;
    }

    @Override
    int attack(String attackType) {
      int kekuatanSerangan = attackPower;
      if (attackType.equals("fire")) {
        kekuatanSerangan = attackPower * 3 ;
      } else if (attackType.equals("frost")) {
        kekuatanSerangan = attackPower* 2 ;
      }
      return kekuatanSerangan;
    }
    
}

public class No1 {
    public static void printAttack(Character character) {
        System.out.println("Nama : " + character.getName());
        System.out.println("ATTAC INFORMATION");
        System.out.println("Attack Power : " + character.attackPower);
        if (character instanceof Fighter) {
            System.out.println("Melee : " + character.attack("Melee"));
            System.out.println("Ranged : " + character.attack("Ranged"));
        } else if (character instanceof Mage) {
            System.out.println("Fire : " + character.attack("Fire"));
            System.out.println("Frost : " + character.attack("Frost"));
        } 
    }
    public static void main(String[] args) {
        Fighter fighter = new Fighter("Ocang", 10);
        Mage mage = new Mage("Fikry", 100);
        Fighter faikter = new Fighter("Mayko", 1000);
        Fighter petarung = new Fighter("Fylo", 10000);
        Mage magee = new Mage("Delfa", 100000);

        Character[] hero = new Character[5];
        hero[0] = fighter;
        hero[1] = mage;
        hero[2] = faikter;
        hero[3] = petarung;
        hero[4] = magee;


        for (Character i : hero) { // membuat perulangan untuk mengeluarkan objek2 yang ada pada list hero. objek2 tsb mau d print informasi ttg attack powernya, jdi dipanggil method print attack.
            printAttack(i);// main, karena method static itu menempel pada kelasnya.
            System.out.println("");
        }
    }
}
