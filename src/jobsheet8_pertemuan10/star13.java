package jobsheet8_pertemuan10;
import java.util.Scanner;
public class star13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner (System.in);
        System.out.print("Masukan Nilai n : ");
        int n = wika.nextInt();

        for (int i= 1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println();

    }
}
