abstract public class Character {
    private String name;

    public Character (String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    abstract int attack();
    abstract int attack(String type);
    abstract void printAttack(Character character);
}
