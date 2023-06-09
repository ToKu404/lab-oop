class No2Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
                                                //penggunaan this ialah untuk merujuk pada objek saat ini dari kelas yang sama.
    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Pria" : "Wanita";
    }
}

public class No2{
    
    public static void main(String[] args) {
        No2Person people = new No2Person();
        people.setName("thancos");
        people.setAge(19);
        people.setGender(true);

        System.out.println("Name: " + people.getName());
        System.out.println("Umur: " + people.getAge());
        System.out.println("Jenis Kelamin: " + people.getGender());
        
    }
}
