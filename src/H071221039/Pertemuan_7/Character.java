package H071221039.Pertemuan_7;
public abstract class Character {
   protected String name;
   protected double attackPower;

   Character(){}

    Character(String name, double attackPower){
       this.name = name;
       this.attackPower = attackPower;
    }


    public String getName() {
        return name;
    }
 
    abstract double attack();
    abstract double attack(AttackType attackType);
}
