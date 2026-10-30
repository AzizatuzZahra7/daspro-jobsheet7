import java.util.Scanner;

public class Tugas2Parkir04 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan;
        int jamParkir;
        int totalPembayaran = 0;

        while (true) {
            System.out.println("Jenis kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Selesai");

            System.out.print("Masukkan jenis kendaraan: ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            System.out.print("Masukkan lama parkir (jam): ");
            jamParkir = sc.nextInt();

            if (jamParkir < 0) {
                System.out.println("Jam parkir tidak valid!");
                continue;
            }

            int pembayaran;

            if (jenisKendaraan == 1) {
                pembayaran = jamParkir * 3000;
                System.out.println("Jenis kendaraan: Mobil");
            } else {
                pembayaran = jamParkir * 2000;
                System.out.println("Jenis kendaraan: Motor");
            }

            totalPembayaran += pembayaran;

            System.out.println("Pembayaran: Rp" + pembayaran);
        }

        System.out.println("Total pembayaran parkir: Rp" + totalPembayaran);

        sc.close();
    }
}