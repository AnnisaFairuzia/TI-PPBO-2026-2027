public class SiswaDemo {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa(90);
        System.out.println("Nilai: " + siswa1.getNilai());
        System.out.println("Nilai huruf: " + siswa1.getNilaiHuruf());

        Siswa siswa2 = new Siswa(70);
        System.out.println("Nilai: " + siswa2.getNilai());
        System.out.println("Nilai huruf: " + siswa2.getNilaiHuruf());

        siswa2.setNilai(110);
        System.out.println("Nilai setelah pengujian: " + siswa2.getNilai());
    }
}
