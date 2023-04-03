package H071221087.Pertemuan_3;
// Novel Bumi
class NovelBumi{
    String authorName;
    String genre;
    int rating;
    Karakter[] karakter;

    public NovelBumi(String authorName, String genre, int rating, int jumlahKarakter){
        this.authorName = authorName;
        this.genre = genre;
        this.rating = rating;
        this.karakter = new Karakter[jumlahKarakter];
    }

    public NovelBumi (){
        this.karakter = new Karakter[2];
    }

    public void addKarakter (Karakter karakter, int index){
        this.karakter[index-1] = karakter;
    }

    public void setAuthorName(String author){
        authorName = author;
    }
    public void setGenre(String genreString){
        genre = genreString;
    }    
    public void setRating(int rating){
        this.rating = rating;
    }
    public void displayDetail() {
        System.out.println("Novel Bumi");
        System.out.println("==========");
        System.out.printf("Author : %s\nGenre : %s\nRating : %s\n" , authorName, genre, rating);
        for (int i = 0; i < karakter.length; i++) {
            System.out.println("\n");
            System.out.printf("Karakter %d\n", i+1);
            System.out.println("==========");
            System.out.println("Nama : "+ karakter[i].nama);
            System.out.println("Klan : "+ karakter[i].klan);
            System.out.println("Skill : "+ karakter[i].skill);
        }
}
}

class Karakter{
    String nama;
    String klan;
    String skill;

    public Karakter(String nama, String klan, String skill){
        this.nama = nama;
        this.klan = klan;
        this.skill = skill;
    }

    public void setName(String nama){
        this.nama = nama; 
    }
    public void setKlan(String klan ){
        this.klan = klan;
    }
    public void setSkill(String skill){
        this.skill = skill;
    }
}


public class No1 {
    public static void main(String[] args) {
        Karakter karakter1 = new Karakter("Raib", "Bulan", "Menghilang");
        Karakter karakter2 = new Karakter("Seli", "Matahari", "Telekinesis");
        NovelBumi novelBumi = new NovelBumi();
        novelBumi.setAuthorName("TereLiye");
        novelBumi.setGenre("Fantasi");
        novelBumi.setRating(5);
        novelBumi.addKarakter(karakter1,1);
        novelBumi.addKarakter(karakter2,2);
        novelBumi.displayDetail();
    }
}
