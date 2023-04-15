package H071221039.Pertemuan_5;
public class MainNo2 {
    public static void main(String[] args) {
        // create objects
        PengurusInti pengurusInti = new PengurusInti("Mega", "Perempuan", "PK7", "0812345678", "Ketua","5 Tahun");
        KoordinatorBidangDanStaff koordinatorBidang = new KoordinatorBidangDanStaff("Wati", "Perempuan", "BTP", "0876543210", "Anak Ketua", "Menjadi Kepercayaan Rakyat");
        
        // display info
        pengurusInti.displayInfo();
        System.out.println();
        System.out.println();
        koordinatorBidang.displayInfo();
    }
}
