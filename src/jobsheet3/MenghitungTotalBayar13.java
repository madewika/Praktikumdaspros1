package jobsheet3;
import java.util.Scanner;
public class MenghitungTotalBayar13 {
    
    public static void main(String[] args) {
    double harga;
    double potongan;
    double jmlh_bayar;
    double diskon = 0.15;

    Scanner wika = new Scanner (System.in);

    System.out.print("Masukan harga ");
    harga = wika.nextDouble();

    potongan = harga * diskon;
    jmlh_bayar = harga - potongan;

    System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jmlh_bayar);
    wika.close();


    }
}
