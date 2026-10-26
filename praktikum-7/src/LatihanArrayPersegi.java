public class LatihanArrayPersegi {
    public static void main(String[] args) {
        Persegi[] daftarPersegi = new Persegi[4];

        daftarPersegi[0] = new Persegi(3);
        daftarPersegi[1] = new Persegi(5);
        daftarPersegi[2] = new Persegi(7);
        daftarPersegi[3] = new Persegi(4);

        Persegi terbesar = daftarPersegi[0];

        for (Persegi p : daftarPersegi) {
            if (p.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = p;
            }
        }

        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas: " + terbesar.hitungLuas());
    }
}
