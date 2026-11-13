public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok,
                   double tunjanganJabatan) {
        super(nama, nip, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // TAMBAHKAN METHOD DI SINI
    public void tampilkanRingkasan() {
        System.out.println("Manager: " + nama);
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }
}