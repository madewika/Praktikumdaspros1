package jobsheet7_pertemuan8;
import java.util.Scanner;
public class SiakadFor13 {
    public static void main(String[] args) {

    double nilai, tertinggi=0, terendah=100;

    Scanner wika= new Scanner(System.in);

    for (int i = 1; i <= 11 ; i++) {
        System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
        nilai=wika.nextDouble();

        if (nilai > tertinggi) {
            tertinggi = nilai; 
        }

        if (nilai < terendah) {
            terendah = nilai;
        }
    }

    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);

    }

}
