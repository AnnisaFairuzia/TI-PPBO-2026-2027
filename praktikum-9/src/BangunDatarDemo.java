public class BangunDatarDemo {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new Lingkaran(3)
        };

        double totalLuas = 0;

        for (BangunDatar bangun : daftarBangun) {
            double luas = bangun.hitungLuas();

            System.out.println("Luas: " + luas);

            totalLuas += luas;
        }

        System.out.println("Total luas: " + totalLuas);
    }
}