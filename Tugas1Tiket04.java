import java.util.Scanner;

public class Tugas1Tiket04 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        double diskon, totalHarga, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan ulang!");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalHarga = totalHarga - (totalHarga * diskon);

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga: Rp" + totalHarga);
        }

        System.out.println("\nTotal tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        sc.close();
    }
}