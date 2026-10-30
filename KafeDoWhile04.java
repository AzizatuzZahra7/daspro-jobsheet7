import java.util.Scanner;

public class KafeDoWhile04 { 
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;

        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik batal untuk berhenti): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dihentikan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi)
                       + (teh * hargaTeh)
                       + (roti * hargaRoti);

            System.out.println("Nama pelanggan: " + namaPelanggan);
            System.out.println("Total harga: Rp" + totalHarga);

            sc.nextLine();

        } while (true);

        sc.close();
    }
}