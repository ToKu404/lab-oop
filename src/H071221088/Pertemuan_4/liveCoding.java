package H071221088.Pertemuan_4;

class Employee {
    String name;
    int id;
    int age;
    int salery;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public int getSalery() {
        return salery;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalery(int salery) {
        this.salery = salery;
    }
    public Employee() {
    }
    public Employee(String name, int id, int age, int salery) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salery = salery;
    }
    void displayinfo() {
        System.out.println("Nama: " + name);
        System.out.println("Id: " + id);
        System.out.println("Umur: " + age);
        System.out.println("Gaji: " + salery);
    }
}

public class liveCoding {
    public static void main(String[] args) {
        SelfUtils.displaySelfData();
        
        System.out.println();
        
        Employee employee = new Employee();
        employee.setName("Rijal");
        employee.setId(1432);
        employee.setAge(20);
        employee.setSalery(1000);
        System.out.println("Nama: " + employee.getName());
        System.out.println("Id: " + employee.getId());
        System.out.println("Umur: " + employee.getAge());
        System.out.println("Gaji: " + employee.getSalery());

        System.out.println();

        Employee employee2 = new Employee("Jamal", 1234, 22, 15000);
        employee2.displayinfo();
    }
}