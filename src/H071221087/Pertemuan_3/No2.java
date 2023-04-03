package H071221087.Pertemuan_3;

class Player{
        private String nama;
        private int hp;
        private int attackPower;
        private int defense;
        public Player(){}
        
        public void getDamage(Player enemy) {
            hp= hp-Math.abs(enemy.getAttackPower()-defense);
            }

        // Lengkapi
        public void setAttackPower(int attackPower){
            this.attackPower = attackPower;
            }       
        public Player(String nama,int attackPower,int defense){
            this.hp = 100;
            this.nama = nama;
            this.attackPower = attackPower;
            this.defense = defense; 
            }
        public Player(String nama,int defense){
            this.hp = 100;
            this.nama = nama;
            this.defense = defense; 
            }

        public void status() {
            System.out.println(nama + " Status");
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
        Player player1= new Player("Mino", 30, 15);
        Player player2= new Player("Hilda", 10);
        player2.setAttackPower(35);
        player1.getDamage(player2);
        player1.status();
        player2.status();
        }
    }
