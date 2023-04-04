package login_App.models;

public class Profile {
    /*
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas profile
     */
    private String fullName;
    private String nickname;
    private int age;
    private String hobby;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

