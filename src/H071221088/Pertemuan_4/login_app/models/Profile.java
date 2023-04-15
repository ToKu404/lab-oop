package H071221088.Pertemuan_4.login_app.models;

public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    String namaLengkap;
    int umur;
    String hobby;
    String panggilan;

    public Profile() {
    }
    public Profile(String namaLengkap, int umur, String hobby, String panggilan) {
        this.namaLengkap = namaLengkap;
        this.umur = umur;
        this.hobby = hobby;
        this.panggilan = panggilan;
    }
    public String getNamaLengkap() {
        return namaLengkap;
    }
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getPanggilan() {
        return panggilan;
    }
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }
    

}
