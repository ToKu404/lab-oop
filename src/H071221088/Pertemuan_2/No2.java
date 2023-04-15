package H071221088.Pertemuan_2;

class Person {
    
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

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        if (gender.equals("Male")) {
            isMale = true;
        }

        else {
            isMale = false;
        }
    }

    public String getGender() {
        if (isMale) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Fauzan Baihaqi");
        person1.setAge(19);
        person1.setGender("Male");

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
    }
}

public class No2{}