public class Produk {
    String namaProduk;
    double harga;

    // Constructor dengan parameter
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method untuk mengecek apakah produk mahal
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
