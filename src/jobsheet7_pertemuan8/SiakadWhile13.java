package jobsheet7_pertemuan8;
import java.util.Scanner;
public class SiakadWhile13 {
   public static void main(String[] args) {
    Scanner wika = new Scanner(System.in);
    int nilai, jumlah=5;

    System.out.print("Masukan jumlah mahasiswa ");
    jumlah = wika.nextInt();
    int i = 0;
    while (i<jumlah) {
        System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + ": ");
        nilai= wika.nextInt();

        if (nilai <0 || nilai >100) {
            System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid");
        }

        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + "adalah A");
        }else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + "adalah A");
        }else if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + "adalah A");
        }else if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + "adalah A");
         }else if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + "adalah A");
         }else if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + "adalah A");
         }else {
            System.out.println("Nilai mahaiswa ke-" + (i+1) + "adalah A");
        
        
        
    }
   } 
}
