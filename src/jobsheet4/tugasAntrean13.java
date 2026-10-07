package jobsheet4;
import java.util.Scanner;
public class tugasAntrean13 {
public static void main(String[] args) {
    Scanner wika = new Scanner (System.in);

    System.out.print("Masukan kode layanan ");
    int kode = wika.nextInt();

    switch (kode) {
        case 1 :
            System.out.println("Layanan legalisir ijasah");
            System.out.println("Loket : A");
            break;
        case 2 :
            System.out.println("Layanan Surat Keterangan aktif kuliah");
            System.out.println("Loket : B");
            break;
        case 3 :
            System.out.println("Layanan Pembayaran UKT");
            System.out.println("Loket : C");
            break;
        case 4 :
            System.out.println("Layanan Pengajuan Cuti Akademik");
            System.out.println("Loket : D");
            break;
        default:
            System.out.println("Kode layanan tidak tersedia");
            break;
    }
}
}
