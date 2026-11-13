
public class TugasInheritanceDemo {
    public static void main(String[] args) {

        Manager manager = new Manager(
                "Budi", "M001", 8000000, 2000000
        );

        Staff staff = new Staff(
                "Andi", "S001", 5000000, 1000000
        );

        Direktur direktur = new Direktur(
                "Rina", "D001", 15000000,
                5000000, 3000000
        );

        System.out.println("=== DATA MANAGER ===");
        manager.tampilkanData();
        manager.tampilkanRingkasan();
        System.out.println("Tunjangan Jabatan: "
                + manager.getTunjanganJabatan());

        System.out.println("\n=== DATA STAFF ===");
        staff.tampilkanData();
        System.out.println("Tunjangan Kinerja: "
                + staff.getTunjanganKinerja());

        System.out.println("\n=== DATA DIREKTUR ===");
        direktur.tampilkanData();
        System.out.println("Tunjangan Jabatan: "
                + direktur.getTunjanganJabatan());
        System.out.println("Tunjangan Saham: "
                + direktur.getTunjanganSaham());

        System.out.println("\n=== UJI VALIDASI GAJI ===");
        Manager managerUji = new Manager(
                "Doni", "M002", -1000000, 1500000
        );
        managerUji.tampilkanData();
    }
}
