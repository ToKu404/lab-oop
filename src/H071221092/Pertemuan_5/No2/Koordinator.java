public class Koordinator extends Anggota{
    private String bidangstaf;
    public Koordinator(String nama, int umur, String alamat,String bidangstaf) {
        super(nama, umur, alamat);
        this.bidangstaf = bidangstaf;
    }
    public String getBidangstaf() {
        return bidangstaf;
    }
    public void setBidangstaf(String bidangstaf) {
        this.bidangstaf = bidangstaf;
    }
}
