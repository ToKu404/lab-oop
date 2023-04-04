import java.util.ArrayList;
import java.util.List;

class KonserMusik {
    private String nama;
    private String status;
    private List<String> penyanyi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPenyanyi(List<String> penyanyi) {
        this.penyanyi = penyanyi;
    }


    public KonserMusik(String nama, String status) {
        this.nama = nama;
        this.status = status;
        this.penyanyi = new ArrayList<>();
    }

    public void displayPenyanyi() {
        for (String p : penyanyi) {
            System.out.println(p);
        }
    }
    
}