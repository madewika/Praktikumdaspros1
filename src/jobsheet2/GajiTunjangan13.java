package jobsheet2;
import java.util.Scanner;
public class GajiTunjangan13 {
    public static void main(String[] args) {
    Scanner wika = new Scanner(System.in);
    int gajiPokok;
    int tunjangan;
    int jmlh_anak;
    double pensiunan = 0.1;
    double gajiBersih;

    System.out.print ("Masukan gaji pokok anda ");
    gajiPokok = wika.nextInt();

    System.out.print ("Masukan besar tunjangan anda ");
    tunjangan = wika.nextInt();

    System.out.print ("Masukan jumlah anak anda ");
    jmlh_anak = wika.nextInt();

    gajiBersih = gajiPokok - (gajiPokok*pensiunan) + (tunjangan*jmlh_anak);
    System.out.println("Gaji Bersih anda adalah " + gajiBersih);
    wika.close();
}
}