package H071221039.Pertemuan_7;
public class Fighter extends Character {
    
    Fighter(){
    }
    Fighter(String name, double attackPower){
        super(name, attackPower);

    }
  
    @Override
    double attack(){
        return attackPower;
    }
    @Override
    double attack(AttackType attackType){
        if(attackType == AttackType.MELE){
            return attackPower * 2;
        } else if(attackType == AttackType.RANGE){
            return attackPower;
        } else {
            return 0;
        }
    }
}


