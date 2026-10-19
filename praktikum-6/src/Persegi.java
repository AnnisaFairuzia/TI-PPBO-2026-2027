public class Persegi {
    double sisi;

    // Constructor dengan parameter
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
