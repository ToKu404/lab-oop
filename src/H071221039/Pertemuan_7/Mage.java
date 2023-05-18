package H071221039.Pertemuan_7;
public class Mage extends Character {
    Mage(String name, double attackPower){
        super(name, attackPower);
    }

    @Override
    double attack(){
        return attackPower;
    }

    @Override
    double attack(AttackType attackType){
        if(attackType == AttackType.FROST){
            return attackPower * 2;
        } else if(attackType == AttackType.FIRE){
            return attackPower * 3;
        } else {
            return 0;
        }
    }

    void showDetail(){
        System.out.println("Ini mage");
    }


}
