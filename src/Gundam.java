
/**
 * Kelas yang merepresentasikan sebuah model Gundam dengan atribut nama, harga, dan stok.
 */
class Gundam {
    private String nama;
    private double harga;
    private int stok;

    /**
     * Konstruktor untuk membuat objek Gundam baru.
     *
     * @param nama Nama model Gundam.
     * @param harga Harga Gundam.
     * @param stok Jumlah stok yang tersedia.
     */
    public Gundam(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    /**
     * Mengambil nama Gundam.
     *
     * @return Nama model Gundam.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil harga Gundam.
     *
     * @return Harga Gundam.
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Mengambil jumlah stok Gundam.
     *
     * @return Jumlah stok yang tersedia.
     */
    public int getStok() {
        return stok;
    }
}






