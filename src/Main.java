/**
 * Kelas utama untuk menjalankan program simulasi transaksi pembelian Gundam.
 */
public class Main {
    public static void main(String[] args) {
        // Daftar produk
        Gundam gundam1 = new Gundam("Gundam RX-78-2", 500000, 10);
        Gundam gundam2 = new Gundam("Gundam Barbatos", 750000, 5);

        // Membuat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Andi");

        // Pelanggan membeli gundam
        pelanggan1.tambahKeKeranjang(gundam1);
        pelanggan1.tambahKeKeranjang(gundam2);

        // Proses transaksi
        Transaksi transaksi1 = new Transaksi(pelanggan1);
        transaksi1.prosesTransaksi();
    }
}