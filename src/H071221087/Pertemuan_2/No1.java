package H071221087.Pertemuan_2;
class Novel {
    String judul;
    String mc;
    String author;
    
    public void setJudul(String judulNovel) {
        judul = judulNovel;
    }
    public void setMc(String mcNovel) {
        mc = mcNovel;
    }
    public void setAuthor(String authorNovel) {
        author = authorNovel;
    }
    public void displayDetail() {
        System.out.printf("Judul : %s\nMC : %s\nAuthor : %s\n" , judul, mc, author );
    }
}

public class No1 {
    public static void main(String[] args) {
        Novel objekNovel = new Novel();
        objekNovel.setJudul("Hujan");
        objekNovel.setMc("Lail");
        objekNovel.setAuthor("Tere Liye");
        objekNovel.displayDetail();
    }
}

