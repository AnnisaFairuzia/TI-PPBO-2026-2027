public class WaktuDemo {
    public static void main(String[] args) {
        Waktu waktu = new Waktu(10, 30, 45);

        System.out.print("Waktu awal: ");
        waktu.tampilkanWaktu();

        waktu.setJam(25);
        waktu.setMenit(70);
        waktu.setDetik(50);

        System.out.print("Waktu setelah pengujian: ");
        waktu.tampilkanWaktu();
    }
}
