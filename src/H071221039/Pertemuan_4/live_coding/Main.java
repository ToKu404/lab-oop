package H071221039.Pertemuan4.live_coding;
public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("Indonesia");
        country.setCapital("Jakarta");
        country.setHeadOfState("Jokowi");
        country.setPopulation(2_000_000);
        country.setLanguage("Bahasa Indonesia");
        
        country.displayInfo();
        System.out.println();
        Country country1 = new Country("Korea Utara","Pyongyang","Kim Jong Un",500_000,"Bahasa Korea");
        System.out.println("Nama : " + country1.getName());
        System.out.println("Capital : " + country1.getCapital());
        System.out.println("Head of State : " + country1.getHeadOfState());
        System.out.println("Population : " + country1.getPopulation());
        System.out.println("Language : " + country1.getLanguage());
        System.out.println();
        SelfUtils.displaySelfData();
    }
}
