public class Mainn {
    public static void main(String[] args) { //method yang dapat dipakai tanpa harus mendeklarasikan suatu class 
        System.out.println("===== PENGURUS INTI =====");
        PengurusInti pengurusInti = new PengurusInti("Ayya", 18, "Wanita", "Ketua");
        System.out.println("Nama : " + pengurusInti.getNama());
        System.out.println("Umur : " + pengurusInti.getUmur());
        System.out.println("Alamat  : " + pengurusInti.getAlamat());
        System.out.println("Jabatan : " + pengurusInti.getJabatan());
        System.out.println("====== KOORDINATOR ======");
        Koordinator koordinasiBidangStaff = new Koordinator("Fara", 18,"Wanita", "Humas");
        System.out.println("Nama : " + koordinasiBidangStaff.getNama());
        System.out.println("Umur : " + koordinasiBidangStaff.getUmur());
        System.out.println("Alamat : " + koordinasiBidangStaff.getAlamat());
        System.out.println("Bidang : " + koordinasiBidangStaff.getBidangstaf());
    }
}
