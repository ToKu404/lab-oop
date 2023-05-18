package H071221039.Pertemuan_7;
public class Main1 {
    public static void printAttack(Character character) {
        if (character instanceof Fighter){
            System.out.printf("Saat melee, %s menyerang dengan %s power.%n",character.name,character.attack(AttackType.MELE));
            System.out.printf("Saat ranged, %s menyerang dengan %s power.%n%n",character.name,character.attack(AttackType.RANGE));
        } if (character instanceof Mage){
            System.out.printf("Saat fire, %s menyerang dengan %s power.%n",character.name,character.attack(AttackType.FIRE));
            System.out.printf("Saat frost, %s menyerang dengan %s power.%n%n",character.name,character.attack(AttackType.FROST));
        }
}

    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Terizla", 8);
        characters[1] = new Mage("Parsha", 20);
        characters[2] = new Fighter("Masha", 18);
        characters[3] = new Fighter("Edith", 12);
        characters[4] = new Mage("Lunox", 18);
        // Mage mage = (Mage)characters[1];
        // mage.showDetail();
        
        for (Character character : characters) {
            printAttack(character);
        }
    }
}

