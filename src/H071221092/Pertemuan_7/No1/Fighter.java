package No1;

public class Fighter extends Character{
    public Fighter(String name, int attackPower){
        super(name, attackPower);
    }
    int attack(){
        return attackPower;
    }
    int attack (String attackType) {
        int ap = attackPower;
        if (attackType.equals("Male")){
            ap = attackPower*2;
        }
        else if (attackType.equals("Ranged")){
            ap = attackPower;
        }
        return ap;
    }
}