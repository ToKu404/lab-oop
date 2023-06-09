public class Laptop {
    String merek;
    String os;
    int ram;
    String processor;
    int slotRamKosong;

    public Laptop(String merek, String os, int ram, String processor, int slotRamKosong) {
        this.merek = merek;
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.slotRamKosong = slotRamKosong;
    }

    public void upgradeRam(int ukuran) {
        if (slotRamKosong > 0) {
            ram += ukuran;
            slotRamKosong--;
            System.out.println("RAM berhasil diupgrade menjadi " + ram + " GB");
        } else {
            System.out.println("Tidak ada slot kosong untuk menambah RAM");
        }
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Asus", "Windows 10", 8, "Intel Core i5",1);
        System.out.println("Merek: " + laptop.merek);
        System.out.println("OS: " + laptop.os);
        System.out.println("RAM: " + laptop.ram + " GB");
        System.out.println("Processor: " + laptop.processor);
        System.out.println("Slot kosong: " + laptop.slotRamKosong);
        laptop.upgradeRam(4);
        System.out.println("Slot kosong setelah upgrade: " + laptop.slotRamKosong);
    }
}

