public class PengurusInti extends Anggota{
        private String jabatan;

        public PengurusInti(String nama, int umur, String alamat,String jabatan) {
            super(nama, umur, alamat);
            this.jabatan = jabatan;
        }       
        public String getJabatan() {
            return jabatan;
        }
        public void setJabatan(String jabatan) {
            this.jabatan = jabatan;
    }
}
