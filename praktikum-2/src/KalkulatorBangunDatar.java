import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Perhitungan luas dan keliling persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();

        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        // mengecek apakah luas persegi panjang lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;
        System.out.println("Apakah luas > 100 (luasBesar): " + luasBesar);

        // Hitung luas dan keliling lingkaran menggunakan Math.PI
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();

        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        sc.close();
    }
}