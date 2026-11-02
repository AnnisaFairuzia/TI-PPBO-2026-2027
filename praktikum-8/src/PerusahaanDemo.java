public class PerusahaanDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        Staff staf = new Staff("Ani", "S001", 4000000, 500000);

        Direktur direktur = new Direktur(
                "Andi", "D001", 15000000, 5000000, 3000000
        );

        System.out.println("=== DATA MANAGER ===");
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + mgr.getTunjanganJabatan());

        System.out.println("\n=== DATA STAFF ===");
        staf.tampilkanData();
        System.out.println("Tunjangan Kinerja: " + staf.getTunjanganKinerja());

        System.out.println("\n=== DATA DIREKTUR ===");
        direktur.tampilkanData();
    }
}