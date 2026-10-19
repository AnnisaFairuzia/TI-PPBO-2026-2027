public class LatihanProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Laptop", 7500000, 5);
        Produk p2 = new Produk("P002", "Mouse", 150000, 10);

        System.out.println("Produk: " + p1.namaProduk);
        System.out.println("Harga: Rp" + p1.harga);
        System.out.println("Mahal? " + p1.isMahal(5000000));

        System.out.println("--------------------");

        System.out.println("Produk: " + p2.namaProduk);
        System.out.println("Harga: Rp" + p2.harga);
        System.out.println("Mahal? " + p2.isMahal(5000000));
    }
}
