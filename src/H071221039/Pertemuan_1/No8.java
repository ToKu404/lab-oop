import java.util.Scanner; // import library untuk menginput
public class No8 {  // bagian kelas, dimana nama kelas disesuaikan dengan nama file
    public static void main(String[] args) { // main method tempat untuk mengeksekusi program
        try{ // menangkap error
            Scanner sc = new Scanner(System.in); // manampilkan output sebagai tempat inputan
            int[][] num = { // membuat array 2d dengan tipe integer
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        boolean isFound = false; // membuat boolean untuk menghentikan program
        int n = sc.nextInt(); // input angka yang akan dicari tipe integer
        sc.close();// menutup inputan
        for (int i = 0; i < num.length; i++ ){ // melakukan perulangan pertama untuk mengakses index pertama array
            for (int j = 0 ; j < num[i].length; j++){ // melakukan perulangan kedua untuk mengakses index kedua array
                if (num[i][j]==n){ // jika nilai dari index sama dengan inputan
                    System.out.printf("Found %d at [%d][%d]\n",n,i,j); // maka akan menampilkan angka yang diinput dan dia berada pada index keberapa
                    isFound = true; // boolean berubah jadi true
                    break; // ketika boolean true atau sudah mendapat output yang sesuai maka perulangan berhenti
                } 
            } 
            if(isFound){
                break; // jika belum menemukan maka akan break pada perulangan pertama
            }  
        }
        
        } catch(Exception e){ // menangkap error
            System.out.println("Inputan Bukan Angka"); //  // jika terdapat error maka baris ini yang akan menjadi outputnya
        }
    }  
    
}
