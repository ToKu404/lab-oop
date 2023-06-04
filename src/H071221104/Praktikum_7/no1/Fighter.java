public class Fighter extends Character{
    private int attackPower;
    private String type;

        public String getType() {
        return type;
    }
        public Fighter(int attackPower,String name, String type){
            super(name);
            this.attackPower = attackPower;
            this.type = type;
        }
    @Override
    public int attack() {
        return this.attackPower;  
    }
    @Override
    public int attack(String type){
        if(getType().equals("melee")){
            return this.attackPower*2;
        } else if (getType().equals("ranged")){
            return this.attackPower;
        } else {
            return this.attackPower;
        }
    }
    @Override
    void printAttack(Character character) {
        System.out.println(character.getName() + " attacked with power " + character.attack(getType()));
    }
}
