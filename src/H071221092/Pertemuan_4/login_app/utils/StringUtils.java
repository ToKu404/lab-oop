package login_app.utils;

public class StringUtils {
    public static String generateNickName(String fullName){ //method static
        String[] nameParts = fullName.split(" "); //memecah fullname menjadi beberapa bagian menggunakan split

        if (nameParts.length ==1) { //memeriksa apakah hanya satu elemen jika iya langsung return fullname
            return fullName;
        }else{
            return nameParts[1];
        }
    }
}
    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */