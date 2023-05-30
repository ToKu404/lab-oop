package H071221028.Pertemuan_3.No1;
class Taekwondo {
   
    private String serangan;
    private int skor;
    private Atlet atlet;
    

    public Taekwondo ( String serangan, int skor){
        this.serangan = serangan;
        this.skor = skor;
    }
    public Taekwondo ( Atlet atlet, String serangan, int skor){
        this.atlet = atlet;
        this.serangan = serangan;
        this.skor = skor;
    }
    public Taekwondo(){}

    public Atlet getAtlet() {
        return atlet;
    }

    public void setAtlet (Atlet atlet){
        this.atlet = atlet;
    }

    public String getSerangan() {
        return serangan;
    }

    public void setSerangan( String serangan) {
        this.serangan = serangan;
    }

    public int getSkor(){
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int hitungSkor(){
        if (serangan == "kepala"){
            return 4;
        } else if (serangan == "badan"){
            return 2;
        } else if (serangan == "pukulan"){
            return 1;
        } else {
            return -1;
        }

    }
    public void tampilkanDataAtlet(){
        System.out.println("nama: " + atlet.getNama());
        System.out.println("Ranking: " + atlet.getRangking());
    }
}
class Atlet {
    String nama;
    int rangking;

    public Atlet (String nama, int rangking){
        this.nama = nama;
        this.rangking = rangking;
    }
    public String getNama(){
        return nama;
    }
    public int getRangking(){
        return rangking;
    }
}

class Main {
    public static void main(String[] args) {
        Atlet atlet = new Atlet("awa",17);
        atlet.nama = "awa";
        atlet.rangking = 17;

        Taekwondo tkd = new Taekwondo();

        tkd.setAtlet(atlet);

        tkd.tampilkanDataAtlet();
        System.out.println("serangan : " + tkd.getSerangan());
        System.out.println("Skor: " + tkd.hitungSkor());
    }
}