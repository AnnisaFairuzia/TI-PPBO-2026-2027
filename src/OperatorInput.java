import java.util.Scanner;

public class OperatorInput {
    public static void main(String[] args) {

        // Latihan 5: Operator aritmatika dan perbandingan
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat pertama: ");
        int bil1 = sc.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int bil2 = sc.nextInt();

        System.out.println("Jumlah (+): " + (bil1 + bil2));
        System.out.println("Selisih (-): " + (bil1 - bil2));
        System.out.println("Kali (*): " + (bil1 * bil2));
        System.out.println("Bagi (/): " + (bil1 / bil2));
        System.out.println("Sisa Bagi (%): " + (bil1 % bil2));

        System.out.println("Lebih besar (>): " + (bil1 > bil2));
        System.out.println("Lebih kecil (<): " + (bil1 < bil2));
        System.out.println("Sama dengan (==): " + (bil1 == bil2));

        sc.close();
    }
}
