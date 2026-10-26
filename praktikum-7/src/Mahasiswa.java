public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    // Constructor dengan parameter menggunakan this
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter untuk mengambil nama
    public String getNama() {
        return nama;
    }

    // Getter untuk mengambil NIM
    public String getNim() {
        return nim;
    }

    // Getter untuk mengambil IPK
    public double getIpk() {
        return ipk;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
    }

    // Method untuk mengecek cumlaude
    public boolean isCumlaude() {
        return ipk >= 3.5;
    }
}
