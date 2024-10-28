/**
 * Kelas yang merepresentasikan sebuah transaksi pembelian oleh seorang pelanggan.
 */
class Transaksi {
    private Pelanggan pelanggan;

    /**
     * Konstruktor untuk membuat objek Transaksi baru.
     *
     * @param pelanggan Objek Pelanggan yang melakukan transaksi.
     */
    public Transaksi(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    /**
     * Memproses transaksi dengan mencetak informasi pelanggan, daftar belanja, dan total harga.
     */
    public void prosesTransaksi() {
        cetakInfoPelanggan();
        cetakDaftarBelanja();
        double total = hitungTotalHarga();
        System.out.println("Total Harga: Rp " + total);
    }

    /**
     * Mencetak informasi pelanggan.
     */
    private void cetakInfoPelanggan() {
        System.out.println("Pelanggan: " + pelanggan.getNama());
    }

    /**
     * Mencetak daftar belanja pelanggan.
     */
    private void cetakDaftarBelanja() {
        System.out.println("Daftar Belanja:");
        for (Gundam g : pelanggan.getKeranjang()) {
            System.out.println(g.getNama() + " - Rp " + g.getHarga());
        }
    }

    /**
     * Menghitung total harga semua barang di keranjang belanja.
     *
     * @return Total harga semua barang di keranjang.
     */
    private double hitungTotalHarga() {
        double total = 0;
        for (Gundam g : pelanggan.getKeranjang()) {
            total += g.getHarga();
        }
        return total;
    }
}
