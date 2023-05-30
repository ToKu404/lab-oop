public class No2{
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("========== PLAYER 1 ==========");
        player.setName("Miya"); //memberi nilai ke objek menggunakan setter
        player.setLevel(2);
        player.setHealth(250);
        player.setMana(350);
        player.setExp(450);
        player.displayinfo();
        System.out.println("========== PLAYER 2 ==========");
        Player player2 = new Player("Lancelot", 3, 200, 300, 400);
        System.out.println("Nama   : " + player2.getName()); //Mengambil nilai objek menggunakan getter
        System.out.println("Level  : " + player2.getLevel());
        System.out.println("Health : " + player2.getHealth());
        System.out.println("Mana   :" + player2.getMana());
        System.out.println("Exp    : " + player2.getExp());
        System.out.println("============ DATA ============");
        Utils.displaySelfData(); //Mamanggil method static tanpa instance objek
        // Utils utils = new Utils ();
        // utils.displaySelfData();
    }
}

class Player{
    private String name;
    private int level;
    private int health;
    private int mana;
    private int exp;

    public Player (){} //constroctur kosong
    public Player (String name, int level, int health, int mana, int exp){
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.exp = exp;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLevel (int level){
        this.level = level;
    }
    public int getLevel (){
        return level;
    }
    public void setHealth (int health){
        this.health = health;
    }
    public int getHealth (){
        return health;
    }
    public void setMana (int mana){
        this.mana = mana;
    }
    public int getMana (){
        return mana;
    }
    public void setExp (int exp){
        this.exp = exp;
    }
    public int getExp (){
        return exp;
    }

    //behavior
    public void displayinfo(){
        System.out.println("Name   : " + name);
        System.out.println("Level  : " + level);
        System.out.println("Health : " + health);
        System.out.println("Mana   : " + mana);
        System.out.println("Exp    : " + exp);
    }
}

class Utils{ //static method
    public static void displaySelfData() {
        System.out.println("Nama  : Fara Aulia Al Aini Syam");
        System.out.println("NIm   : H071221092");
    }
}
