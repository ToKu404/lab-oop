class Alamat {
    String jalan;
    String kota;

    public String getAlamatLengkap(){
        return this.jalan + "," + this.kota;
    }
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    public Alamat getAlamat  () {
        return this.alamat;
    }

    public String getName() {
        return this.nama;
    }
    
    public String getNim () {
        return this.nim;
    }
}

public class No5 {
    public static void main(String[] args) {
        try{
            Alamat alamat = new Alamat () ;
            alamat.jalan = "Minasa Upa";
            alamat.kota = "Kota Makassar";
        

            Mahasiswa mahasiswa = new Mahasiswa ();
            mahasiswa.alamat = alamat;
            mahasiswa.nama = "Nadjwa Amalia";
            mahasiswa.nim = "H071221028";    

            System.out.println("Nama: " + mahasiswa.getName());
            System.out.println("Nim: " + mahasiswa.getNim());
            System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
}

