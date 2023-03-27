// pembuatan class
class Person {
    // attribute
    String nama;
    int age;
    Boolean isMale;

    // setter dan getter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama; // this berguna untuk menunjukkan variable attribute
    }
    public String getNama() {
        return nama;
    }
    
    // setter dan getter untuk atribut age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // setter dan getter untuk atribut isMale
    public void setGender(String gender) {
        this.isMale = gender.equalsIgnoreCase("Laki-laki");
    } 
    public String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    }
}
// pembuatan class utama
public class No2 {
    // pembuatan class main untuk memanggil objek person
    public static void main(String[] args) {
        // pemanggilan objek person
        Person person = new Person();
        person.setNama("ekal");
        person.setAge(19);
        person.setGender("Laki-laki");

        System.out.println("Nama : " + person.getNama());
        System.out.println("Umur : " + person.getAge());
        System.out.println("Gender : " + person.getGender());
    }
}


