public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    // Constructor
    public Waktu(int jam, int menit, int detik) {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }

    // Getter jam
    public int getJam() {
        return jam;
    }

    // Setter jam dengan validasi 0-23
    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("Jam tidak valid, harus 0-23");
        }
    }

    // Getter menit
    public int getMenit() {
        return menit;
    }

    // Setter menit dengan validasi 0-59
    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("Menit tidak valid, harus 0-59");
        }
    }

    // Getter detik
    public int getDetik() {
        return detik;
    }

    // Setter detik dengan validasi 0-59
    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("Detik tidak valid, harus 0-59");
        }
    }

    // Menampilkan waktu
    public void tampilkanWaktu() {
        System.out.printf("%02d:%02d:%02d%n", jam, menit, detik);
    }
}
