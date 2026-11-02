public class Latihan1HewanDemo {
    public static void main(String[] args) {
        Kucing kucingku = new Kucing();
        kucingku.nama = "Mimi";

        System.out.println("Nama Kucing: " + kucingku.nama);
        kucingku.bersuara();

        Anjing anjingku = new Anjing();
        anjingku.nama = "Bob";

        System.out.println("Nama Anjing: " + anjingku.nama);
        anjingku.bersuara();
    }
}