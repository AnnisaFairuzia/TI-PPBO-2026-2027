public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank(
                "001", "Budi", 100000, "Tabungan");

        RekeningBank rek2 = new RekeningBank(
                "002", "Siti", 50000, "Giro");

        System.out.println("=== TRANSAKSI REKENING BUDI ===");
        rek1.setor(50000);
        rek1.tarik(20000);

        System.out.println("\n=== TRANSAKSI REKENING SITI ===");
        rek2.setor(25000);
        rek2.tarik(10000);

        System.out.println("\n=== TRANSFER BUDI KE SITI ===");
        rek1.transferKe(rek2, 30000);

        System.out.println("\n=== UJI TRANSFER GAGAL ===");
        rek1.transferKe(rek2, 500000);

        System.out.println("\n=== MUTASI REKENING BUDI ===");
        rek1.cetakMutasi();

        System.out.println("\n=== MUTASI REKENING SITI ===");
        rek2.cetakMutasi();
    }
}
