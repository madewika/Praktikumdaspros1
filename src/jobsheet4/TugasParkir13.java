package jobsheet4;
import java.util.Scanner;
public class TugasParkir13 {
public static void main(String[] args) {
    int lamaParkir;
    int hargaParkirAwal=2000;
    int hargaPerJam=1000;
    int total;

    Scanner wika = new Scanner(System.in);

    System.out.print("Berapa lama anda parkir ? (dalam jam) : ");
    lamaParkir=wika.nextInt();

    if (lamaParkir <= 2) {
        total = hargaParkirAwal;
    }else{
        total = hargaParkirAwal + (lamaParkir-2)*hargaPerJam;
    }
System.out.println(String.format ("Harga Parkir Rp%,d", total));
}
}
