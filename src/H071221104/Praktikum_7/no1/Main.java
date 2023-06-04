public class Main{
    public static void main(String[] args) {
        Character fighter1 = new Fighter(100, "Udin", "attack");
        Character fighter2 = new Fighter(100, "Salma", "melee");
        Fighter fighter3 = new Fighter(100, "Jamal", "ranged");
        Mage mage1 = new Mage(300, "Nabila", "frost");
        Mage mage2 = new Mage(300, "Vina", "fire");

        Character[] characters = new Character[5];
        characters[0] = fighter1;
        characters[1] = mage1;
        characters[2] = fighter2;
        characters[3] = fighter3;
        characters[4] = mage2;
        System.out.println("=".repeat(25));
        for (Character character : characters) {
            character.printAttack(character);
        }
    }
}