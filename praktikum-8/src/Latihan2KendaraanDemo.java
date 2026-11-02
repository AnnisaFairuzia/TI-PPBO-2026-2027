public class Latihan2KendaraanDemo {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", 180, 4);
        Motor motorku = new Motor("Honda", 120, "Matic");

        mobilku.tampilkanInfo();

        System.out.println("Merek Motor: " + motorku.merek);
        System.out.println("Kecepatan Maksimal Motor: " + motorku.kecepatanMaks);
    }
}