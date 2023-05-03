package H071221088.Pertemuan_4.login_app.utils;

public class StringUtils {
    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan parts yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static String getNickName(String fullName) {
        String [] parts = fullName.split("");
        if (parts.length == 1) {
            return fullName;
        } else {
            return parts[1];
        }
    }
}
