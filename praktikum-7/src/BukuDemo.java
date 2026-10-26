public class BukuDemo {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);

        System.out.println("Data buku awal:");
        buku.tampilkanData();

        buku.setJudul("Sang Pemimpi");
        buku.setPengarang("Andrea Hirata");

        System.out.println("Data buku setelah diubah:");
        buku.tampilkanData();
    }
}
