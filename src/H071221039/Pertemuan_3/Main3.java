package H071221039.Pertemuan_3;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        User user = new User ("Khaekal", 10000);
        ArrayList<Product> produk =new ArrayList<>();
        produk.add(new Product("Asus Vivobook", 10000,1));
        produk.add(new Product("Asus Vivobook Oled", "6k",8));
        produk.add(new Product("Asus TUF Gaming", 7000,10));
        Store computerStore = new Store("Computer Store", produk);
        computerStore.addProduct(new Product("Mac","10k",12));

        while (true){
            user.showUser();
            computerStore.listProduct();
            System.out.print("> ");
            int pilihan = sc.nextInt();

            if (pilihan > computerStore.getProduct().size()) {
                System.out.println("-".repeat(40));
                System.out.println("Tidak ada dalam pilihan");
            } else if (1 <= pilihan && pilihan <= produk.size()){
                System.out.println("-".repeat(40));
                System.out.println("Apakah anda yakin ingin membeli : ");
                System.out.printf("%s, dengan harga $%d%n", computerStore.getProduct().get(pilihan - 1).getName(), computerStore.getProduct().get(pilihan - 1).getPrice());
                System.out.println("-".repeat(40));

                while (true){
                    System.out.printf("1. Konfirmasi %n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = sc.nextInt();

                    if (konfirmasi == 1 && user.getBalance() >= computerStore.getProduct().get(pilihan - 1).getPrice()){
                    System.out.println("-".repeat(40));
                    computerStore.getProduct().get(pilihan - 1).produkLaku(computerStore);
                    user.setBalance(computerStore.getProduct().get(pilihan - 1).getPrice());
                    
                    System.out.printf("%s berhasil membeli %s.%n", user.getName(), computerStore.getProduct().get(pilihan - 1).getName() );
                    System.out.println("-".repeat(40));
                    System.out.printf("Lanjutkan Transaksi%n1. Lanjut%n2. Tidak%n");
                    System.out.print(("> "));
                    int pilihan2 = sc.nextInt();

                        if (pilihan2 == 1){
                            break;
                        } else {
                            System.out.println("Terima Kasih Telahh Berkunjung");
                            System.exit(0);
                        }

                    } else if (konfirmasi == 2){
                        break;
                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Informasi : Balance Anda = $%d | harga laptop $%d | %s%n", user.getBalance(), computerStore.getProduct().get(pilihan - 1).getPrice(), (user.getBalance() < computerStore.getProduct().get(pilihan - 1).getPrice()) ? "Silahkan Batalkan Pesanan, Balance anda tidak cukup" : "Masukkan Peintah dengan Benar!");
                    }
                }
            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }
        }
        sc.close();
    }
}