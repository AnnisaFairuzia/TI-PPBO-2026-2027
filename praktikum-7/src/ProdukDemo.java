public class ProdukDemo {
    public static void main(String[] args) {
        Produk produk = new Produk("P001", "Keyboard", 150000, 10);

        System.out.println("Data produk awal:");
        produk.tampilkanData();

        System.out.println("Total harga 2 produk: "
                + produk.hitungTotalHarga(2));

        produk.tambahStok(5);
        produk.kurangiStok(3);

        produk.setHarga(-5000);
        produk.kurangiStok(20);

        System.out.println("\nData produk akhir:");
        produk.tampilkanData();
    }
}
