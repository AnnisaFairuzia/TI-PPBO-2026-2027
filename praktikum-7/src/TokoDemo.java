public class TokoDemo {
    public static void main(String[] args) {

        Produk[] daftarProduk = {
                new Produk("P001", "Laptop", 7500000, 5),
                new Produk("P002", "Mouse", 150000, 10),
                new Produk("P003", "Keyboard", 300000, 8),
                new Produk("P004", "Monitor", 2000000, 4),
                new Produk("P005", "Printer", 1800000, 3)
        };

        System.out.println("=== DAFTAR PRODUK ===");
        for (Produk p : daftarProduk) {
            p.tampilkanData();
        }

        System.out.println("\n=== SIMULASI PEMBELIAN ===");

        // Pembelian pertama: 2 mouse
        Produk mouse = daftarProduk[1];
        int jumlahBeli = 2;

        System.out.println("Membeli " + jumlahBeli + " "
                + mouse.getNamaProduk());
        System.out.println("Total harga: Rp"
                + mouse.hitungTotalHarga(jumlahBeli));
        mouse.kurangiStok(jumlahBeli);
        System.out.println("Stok tersisa: " + mouse.getStok());

        // Pembelian kedua: 10 laptop, stok tidak mencukupi
        Produk laptop = daftarProduk[0];
        jumlahBeli = 10;

        System.out.println("\nMembeli " + jumlahBeli + " "
                + laptop.getNamaProduk());
        System.out.println("Total harga: Rp"
                + laptop.hitungTotalHarga(jumlahBeli));
        laptop.kurangiStok(jumlahBeli);
        System.out.println("Stok tersisa: " + laptop.getStok());

        // Mencari produk dengan harga paling mahal
        Produk termahal = daftarProduk[0];

        for (Produk p : daftarProduk) {
            if (p.getHarga() > termahal.getHarga()) {
                termahal = p;
            }
        }

        System.out.println("\n=== PRODUK TERMAHAL ===");
        termahal.tampilkanData();
    }
}
