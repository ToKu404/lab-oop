abstract class Character{
    protected String name;
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

    abstract int attack();
    abstract int attack(AttackType attackType);
}

class Fighter extends Character{

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(AttackType attackType) {
        int aP = attackPower;
        if (attackType == AttackType.melee){
            aP = attackPower * 2;
        }else if (attackType == AttackType.ranged){
            aP = attackPower;
        }
        return aP;
    }
}

class Mage extends Character{

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(AttackType attackType) {
        int serangan = attackPower;
        if (attackType == AttackType.fire){
            serangan = attackPower * 3;
        }else if (attackType == AttackType.frost){
            serangan = attackPower * 2;
        }
        return serangan;
    }
}

public class No1{
    public static void printAttack(Character character){
        System.out.println("Nama : "+ character.getName());
        System.out.println("---Attack Information---");
        System.out.println("Attack Power : "+ character.getAttackPower());
        if (character instanceof Fighter){
            System.out.println("Melee : " + character.attack(AttackType.melee));
            System.out.println("Ranged : "+ character.attack(AttackType.ranged));
        }else if (character instanceof Mage){
            System.out.println("Fire : "+ character.attack(AttackType.fire));
            System.out.println("Frost : "+ character.attack(AttackType.frost));
        }
    }
    public static void main(String[] args) {
        Fighter fighter = new Fighter("Cheryl", 100);
        Mage mage = new Mage("Dipa", 80);
        Fighter fighter2 = new Fighter("Salsa", 50);
        Fighter fighter3 = new Fighter("Awa", 70);
        Mage mage2 = new Mage("Nakita", 60);

        Character[] hero = new Character[5];
        hero[0] = fighter;
        hero[1] = mage;
        hero[2] = fighter2;
        hero[3] = fighter3;
        hero[4] = mage2;

        for (Character i : hero){ //perulangan utk panggil objek yg ada pada hero trs mau diprint attackPowernya
            printAttack(i);
            System.out.println("");
        }
    }
}

enum AttackType{
    melee, frost, fire, ranged
}


