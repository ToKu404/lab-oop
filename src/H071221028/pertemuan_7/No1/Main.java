// abstract class Character{
//     protected String name;
//     protected int attackPower;

//     public Character(String name, int attackPower) {
//         this.name = name;
//         this.attackPower = attackPower;
//     }

//     public String getName(){
//         return name;
//     }
//     public int getAttackPower(){
//         return attackPower;

//     }
//     abstract int attack();
//     abstract int attack(String attackType);
// }

// class Fighter extends Character{

//     public Fighter(String name, int attackPower) {
//         super(name, attackPower);
       
//     }

//     @Override
//     int attack() {
//         return this.attackPower;
//     }

//     @Override
//     int attack(String attackType) {
//         if (attackType.equalsIgnoreCase("melee")){
//             return 2*this.attackPower;
//         }
//         else if (attackType.equalsIgnoreCase("ranged")){
//             return this.attackPower;
//         }
//         return this.attackPower;
//     }


// }
// class Mage extends Character{

//     public Mage(String name, int attackPower) {
//         super(name, attackPower);
        
//     }

//     @Override
//     int attack() {
    
//         return this.attackPower;
//     }

//     @Override
//     int attack(String attackType) {
//         if (attackType.equalsIgnoreCase("fire")){
//             return 3*attackPower;
//         }
//         else if (attackType.equalsIgnoreCase("frost")){
//             return 2*attackPower;
//         }
//         return this.attackPower;
//     }

// }

// public class Main {
//     public static void main(String[] args) {
        
//         Character[] character = new Character[5];
//         character[0]= new Fighter("alucard", 90);
//         character[1]= new Mage("odette", 99);
//         character[2]= new Fighter("Zilong", 80);
//         character[3]= new Fighter("lancelot", 70);
//         character[4]= new Mage("nana", 91);

        
//         for (int i = 0; i < character.length; i++) {
//             printAttack(character[i]);
//         }
//     }
//     public static void printAttack(Character character) {
//         if (character instanceof Fighter){
//             System.out.println("Attack power " + character.getName() + ":" + character.attack("ranged"));
//         }
//         if (character instanceof Mage){
//             System.out.println("Attack power " + character.getName() + ":" + character.attack("frost"));
//         }
//     }


// }
