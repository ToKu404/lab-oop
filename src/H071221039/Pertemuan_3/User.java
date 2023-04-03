package H071221039.Pertemuan_3;
public class User {
    String name;
    int balance;

    public User(){
    }

    public User(String nama, int balance){
        this.name = nama;
        this.balance = balance;
    }

    public void setNama(String nama) {
        this.name = nama;
    }
    public void setBalance(int balance) {
        this.balance = this.balance - balance;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void showUser(){
        System.out.println("----------CARD----------");
        System.out.println(this.name);
        System.out.println(this.balance);
        System.out.println("------------------------");
    }
}
