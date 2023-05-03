package H071221028.Pertemuan_3.No3;
class Event {
    String nama; 
    String tipe;
    boolean isPaid;
    double hargaTiket;

    public Event(String nama, String tipe, boolean isPaid, double hargaTiket) {
        this.nama = nama;
        this.tipe = tipe;
        this.isPaid = isPaid;
        if (isPaid == true) {
            this.hargaTiket = hargaTiket;
        }
        else {
            this.hargaTiket = 0;
        }
    }
    public void beliTiket (){
        System.out.printf("Selamat anda telah berhasil membeli tiket %s %s", nama, isPaid? "Seharga " + hargaTiket: "Secara Gratis");
    }

    
}

public class no1 {
    public static void main(String[] args) {
        Event event = new Event ("UNHAS CUP", "OLAHRAGA", true, 10.000);
        System.out.println("Nama Event: " + event.nama);
        System.out.println("Tipe Event: " + event.tipe);
        System.out.println("Pembayaran: " + event.isPaid);
        System.out.println("Harga tiket: " + event.hargaTiket);
    }
}
