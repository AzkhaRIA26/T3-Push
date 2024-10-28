import java.util.ArrayList;

/**
 * Kelas yang merepresentasikan seorang pelanggan dengan atribut nama dan keranjang belanja.
 */
class Pelanggan {
    private String nama;
    private ArrayList<Gundam> keranjang = new ArrayList<>();

    /**
     * Konstruktor untuk membuat objek Pelanggan baru.
     *
     * @param nama Nama pelanggan.
     */
    public Pelanggan(String nama) {
        this.nama = nama;
    }

    /**
     * Menambahkan Gundam ke keranjang belanja pelanggan.
     *
     * @param gundam Objek Gundam yang akan ditambahkan ke keranjang.
     */
    public void tambahKeKeranjang(Gundam gundam) {
        keranjang.add(gundam);
    }

    /**
     * Mengambil nama pelanggan.
     *
     * @return Nama pelanggan.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil keranjang belanja pelanggan.
     *
     * @return Daftar Gundam yang ada di keranjang belanja.
     */
    public ArrayList<Gundam> getKeranjang() {
        return keranjang;
    }
}
