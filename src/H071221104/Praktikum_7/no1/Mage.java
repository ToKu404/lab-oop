public class Mage extends Character{
    private int attackPower;
    private String type;
    public String getType() {
        return type;
    }

    public Mage(int attackPower,String name, String type){
        super(name);
        this.attackPower = attackPower;
        this.type = type;

    }

    @Override
    public int attack(){
        return this.attackPower;
    }
    @Override
    public int attack(String type){
        if(getType().equals("frost")){
            return this.attackPower*2;
        } else if (getType().equals("fire")){
            return this.attackPower*3;
        } else {
            return this.attackPower;
        }
    }

    @Override
    void printAttack(Character character) {
        System.out.println(character.getName() + " attacked with power " + character.attack(getType()));
    }
}
