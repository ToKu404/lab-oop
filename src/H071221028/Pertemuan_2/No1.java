// class Event {
//     String namaEvent;
//     String peserta;
//     int jumlahPeserta;

//     public String getnama(){
//         return namaEvent;
//     }

//     public String getpeserta(){
//         return peserta;
//     }

//     public int getjumlah(){
//         return jumlahPeserta;
//     }
// }

// public class No1 {
//     public static void main(String[] args) {
//         Event event = new Event();
    
//         event.namaEvent = "Mathematic Event";
//         event.peserta = "SD";
//         event.jumlahPeserta = 560;

//         System.out.println("Nama event: " + event.getnama() + ".");
//         System.out.println("Jenjang Peserta: " + event.getpeserta()+ ".");
//         System.out.println("Jumlah Peserta: " + event.getjumlah()+".");

//     }

// }
// Parent class
class Sepatu {
    protected String brand = "Sport";
    public void running() {
       System.out.println("fastest");
    }
 }
 
 // Child class
 class Shoe extends Sepatu {
    private String model = "Sport";
    public static void main(String[] args) {
       Shoe mynike = new Shoe();
       mynike.brand = "Nike";
       mynike.model = "Running";
       System.out.println("Brand: " + mynike.brand + ", Model: " + mynike.model);
       mynike.running();
    }
 }
 
