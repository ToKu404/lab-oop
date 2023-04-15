package H071221088.Pertemuan_3;

class User {
    String nama;
    int uang;

    public User (String nama, int uang) {
        this.nama = nama;
        this.uang = uang;
    }

    public String getnama() {
        return nama;
    }

    public int getuang() {
        return uang;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setuang(int uang) {

        this.uang = this.uang - uang;
    }
    public void kartu() {
        System.out.println("-".repeat(18)+"kartu"+"-".repeat(18));
        System.out.println(this.getnama());
        System.out.println(this.getuang());
        System.out.println("-".repeat(40));
    }
}
public class No4 {}
