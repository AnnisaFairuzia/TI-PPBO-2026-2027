public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Constructor dengan parameter
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter judul
    public String getJudul() {
        return judul;
    }

    // Getter pengarang
    public String getPengarang() {
        return pengarang;
    }

    // Getter tahun terbit (read-only)
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Setter pengarang
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    // Method untuk menampilkan data buku
    public void tampilkanData() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("--------------------");
    }
}
