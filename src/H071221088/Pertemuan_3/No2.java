package H071221088.Pertemuan_3;

class Player { 
    private String name; 
    private int hp; 
    private int attackPower; 
    private int defense;
    
    public Player(String name, int hp, int attackPower, int defense) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = defense;
    }
    
    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    
    
    public void getDamage(Player enemy) { 
        hp = hp - Math.abs(enemy.getAttackPower() - defense); 
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void sethp(int hp) {
        this.hp = hp;
    }

    public void setdefense(int defense) {
        this.defense = defense;
    }

    public void status() { 
        System.out.println(name + " status"); 
        System.out.println("HP = " + hp); 
        System.out.println("Defense = " + defense); 
        System.out.println("Attack = " + attackPower + "\n"); 
    } 
    
    int getAttackPower() { 
        return attackPower; 
    } 
} 

public class No2 { 
    public static void main(String [] args) { 
        Player player1 = new Player("Mino", 30, 15, 10); 
        Player player2 = new Player("Hilda", 10);
        player1.sethp(100);
        player1.setdefense(15);
        player1.setAttackPower(30);
        player2.sethp(100);
        player2.setdefense(10);
        player2.setAttackPower(35); 
        player1.getDamage(player2);
        player1.status(); 
        player2.status(); 
    } 
}