package jobsheet10_pertemuan13;
import java.util.Scanner;
public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String [][] penonton = new String [4][2];

        while (true) {
            System.out.print("Masukan nama : ");
            nama = wika.nextLine();
            System.out.print("Masukan baris : ");
            baris = wika.nextInt();
            System.out.print("Masukan kolom : ");
            kolom = wika.nextInt();
            wika.nextLine();

            penonton [baris-1][kolom-1]=nama;

            System.out.print("Input penonton lainnya (y/n) : ");
            pilihan = wika.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
