package H071221066.Pertemuan_2;

//NO 2

class Personn {
    private String name;
    private int age;
    private boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        this.isMale = gender == "Male";
    }

    public String getGender() {
        return this.isMale ? "Male" : "Female";
    }
}
public class No2 {
    public static void main(String[] args) {
        Personn person = new Personn();

        person.setName("Din");
        person.setAge(19);
        person.setGender("female");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}

