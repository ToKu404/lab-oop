package H071221066.Pertemuan_2;

//NO.1

class Negara {
    //atribut
    String nama;
    String ibuKota;
    int jumlahProvinsi;

    //behavior
    public String getNama() {
        return nama;
    }
    public String getIbuKota() {
        return ibuKota;
    }
    public int getJumlahProv() {
        return jumlahProvinsi;
    }
    public void tambahProv(int jumlah) {
        jumlahProvinsi += jumlah;
    }   
}

    public class No1 {
        public static void main(String[] args) {
            Negara negara = new Negara();
            negara.nama = "Indonesia";
            negara.ibuKota = "Jakarta";
            negara.jumlahProvinsi = 37;
        
            //menambah nilai pada atribut
            negara.tambahProv(1);

            System.out.println("Nama negara : " + negara.getNama());
            System.out.println("Ibu kota : " + negara.getIbuKota());
            System.out.println("Jumlah Provinsi : " + negara.getJumlahProv());
        }
    }

