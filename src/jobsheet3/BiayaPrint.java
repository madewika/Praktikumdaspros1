package jobsheet3;
import java.util.Scanner;
public class BiayaPrint {
    public static void main(String[] args) {
    int banyakLembar;
    int hargaPerLembar=500;
    int biayaJilid=5000;
    int total;

    Scanner wika = new Scanner(System.in);

    System.out.print("Masukan Banyaknya lembar ");
    banyakLembar = wika.nextInt();

    total = banyakLembar*hargaPerLembar + biayaJilid;

    System.out.println("Harga total anda adalah " + total);
    wika.close();
    }
    
}
