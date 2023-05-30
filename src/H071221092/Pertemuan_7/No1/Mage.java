package No1;

public class Mage extends Character {
    public Mage(String name, int attackPower){
        super(name, attackPower);
    }

    @Override
    int attack(){
        return attackPower;
    }
    
    int attack (String attackType){
        int ap = attackPower;
        if (attackType.equals("Fire")){
            ap = attackPower*3;
        }
        else if(attackType.equals("Frost")){
            ap = attackPower*2;
        }
        return ap;
    }
}

