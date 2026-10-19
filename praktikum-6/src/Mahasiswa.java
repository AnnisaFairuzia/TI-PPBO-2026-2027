public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

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