package jobsheet7_pertemuan8;
import java.util.Scanner;
public class SiakadWhile13 {
   public static void main(String[] args) {
    Scanner wika = new Scanner(System.in);
    int nilai, jumlah;

    System.out.print("Masukan jumlah Mahasiswa ");
    jumlah = wika.nextInt();

    int i = 0;
    while (i<jumlah) {
        System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + ": ");
        nilai= wika.nextInt();

        if (nilai <0 || nilai >100) {
            System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid");
            continue;
        }
        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + " adalah A");
        }else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + " adalah B+");
        }else if (nilai > 65 && nilai <= 73) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + " adalah B");
        }else if (nilai > 60 && nilai <= 65) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + " adalah C+");
         }else if (nilai > 50 && nilai <= 60) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + " adalah C");
         }else if (nilai > 39 && nilai <= 50) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + " adalah D");
         }else if(nilai>=0 && nilai <=39) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + " adalah E"); 
         }
         i++;
         
    } 
    }
}
