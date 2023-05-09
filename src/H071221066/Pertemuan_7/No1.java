abstract class Character {
    protected String name;

    Character(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
    abstract int attack();
    abstract int attack(AttackType attackType);
}

class Fighter extends Character {
    protected int attackPower;

    Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    int attack() {
        return this.attackPower;
    }

    int attack(AttackType attackType) {
        if (attackType == AttackType.melee) {
            return this.attackPower * 2;
        } else if (attackType == AttackType.ranged) {
            return this.attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    protected int attackPower;

    Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    int attack() {
        return this.attackPower;
    }

    int attack(AttackType attackType) {
        if (attackType == AttackType.fire) {
            return this.attackPower * 3;
        } else if (attackType == AttackType.frost) {
            return this.attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class No1 {
    public static void main(String[] args) {
        // Fighter f = new Fighter(null, 0);
        // f.attack();
        // // upcastng
        // //downcasting
        // Character  c = new Fighter(null, 0);
        // Fighter f2 = (Fighter) c;
        // f2.attack();

        // polimorfisme object
        Character[] karakter = new Character[5];
        karakter[0] = new Fighter("DK", 10);
        karakter[1] = new Mage("DINO", 15);
        karakter[2] = new Fighter("JUN", 15);
        karakter[3] = new Fighter("SCOUPS", 20);
        karakter[4] = new Mage("MINGYU", 30);

        for (Character character : karakter) {
            printAttack(character);
        }
    }

    public static void printAttack(Character character) {
        System.out.println("Name                : " + character.getName());
        System.out.println("Attack Power        : " + character.attack());

        if (character instanceof Fighter) {
            System.out.println("FIGHTER");
            System.out.println("Melee Attack Power  : " + character.attack(AttackType.melee));
            System.out.println("Ranged Attack Power : " + character.attack(AttackType.ranged));
        }

        if (character instanceof Mage) {
            System.out.println("MAGE");
            System.out.println("Frost Attack Power  : " + character.attack(AttackType.fire));
            System.out.println("Fire Attack Power   : " + character.attack(AttackType.frost));
        }
        System.out.println();
    }
}

enum AttackType {
    melee, ranged, fire, frost
}
