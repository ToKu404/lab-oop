package No1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
    private static final int DATA_SOURCES = 4;
    private static final int THREAD_POOLS = 3;

    private static int successLoadData = 0;
    private static int failedLoadData = 0;
    private static boolean isFinished = false;

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d Data", DATA_SOURCES));

        // Background Thread
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOLS);

        for (int i = 0; i < DATA_SOURCES; i++) {
            // Membuat Thread sebagai anonymous class
            executor.execute(() -> {
                int executionTime = TaskTimeHelper.getRandomNumber();
                // Karena permintaan soal mengatakan jika waktu eksekusi data sources lebih dari
                // 4 detik, maka dianggap gagal

                for (int j = 0; j < executionTime; j++) {
                    try {
                        Thread.sleep(1000);
                        if (j == 3) {
                            System.out.println("Request Timeout");
                            incrementFailedLoadData();
                            return;
                        }
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
                incrementSuccessLoadData();
                checkDataLoadingStatus();
            });
        }
        // Ketika semua Thread sudah selesai menjalankan tugas, maka executor akan
        // di-shutdown
        executor.shutdown();

        // UI Thread
        int loadingTime = 1;
        while (true) {
            if (isFinished) {
                System.out.println("\nTask Finished.");
                // Dikurang satu supaya pas print out hasil itu pas dengan hitungan detik
                // terakhir sebelum semua Thread selesai bekerja
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                if (successLoadData == DATA_SOURCES) {
                    System.out.println("All data is successfully loaded");
                    break;
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load",
                            successLoadData, failedLoadData));
                    break;
                }
            } else {
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }

    // synchronized ditambahkan untuk menjaga method agar dalam 1 waktu, hanya 1
    // Thread yang bisa mengaksesnya. Ini untuk menghindari adanya race condition
    // maupun deadlock
    public static void incrementSuccessLoadData() {
        successLoadData++;
    }

    public static void incrementFailedLoadData() {
        failedLoadData++;
    }

    public static void checkDataLoadingStatus() {
        if (successLoadData + failedLoadData == DATA_SOURCES) {
            isFinished = true;
        }
    }
}
