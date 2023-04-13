package H071221066.Pertemuan_5;
//NO2
public class MainKomunitas {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("An", 19, "Perempuan", "Ketua");
        System.out.println("Nama : " + pengurusInti.getName());
        System.out.println("Umur : " + pengurusInti.getAge());
        System.out.println("Gender : " + pengurusInti.getGender());
        System.out.println("Jabatan : " + pengurusInti.getJabatan());

        KordinatorBidangStaff koordinasiBidangStaff = new KordinatorBidangStaff("Din", 19," Perempuan", "Sarana Prasarana");
        System.out.println("Nama : " + koordinasiBidangStaff.getName());
        System.out.println("Umur : " + koordinasiBidangStaff.getAge());
        System.out.println("Gender : " + koordinasiBidangStaff.getGender());
        System.out.println("Bidang : " + koordinasiBidangStaff.getBidang());
    }
}