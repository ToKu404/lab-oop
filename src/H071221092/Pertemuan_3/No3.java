public class No3{
    public static void main(String[] args) {
        ObjekWisata objek = new ObjekWisata ("Dufan", "Jakarta", 120);
        System.out.println(objek.nama);
        System.out.println(objek.lokasi);
        if (objek.isPopular()){
            System.out.println("Populer");
        }
        else {
            System.out.println("Tidak Populer");
        }
    }
}

class ObjekWisata{
    String nama;
    String lokasi;
    int pengunjung;

    public ObjekWisata () {}
    public ObjekWisata (String nama, String lokasi, int pengunjung){
        this.nama = nama;
        this.lokasi = lokasi;
        this.pengunjung = 120;

    }
    public boolean isPopular(){
        if (pengunjung >= 100){
            return true;
        }
        else {
            return false;
        }
    }
}

