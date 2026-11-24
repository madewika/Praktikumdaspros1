package jobsheet9_pertemuan12;
import java.util.Scanner;
public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);

        System.out.print("Masukan banyaknya bilangan : ");
        int n = wika.nextInt();

        int nilai[]=new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai ke-" + (i+1) + ", indeks ke-" + i + " : ");
            nilai[i] = wika.nextInt();
        }

        System.out.print("Masukan nilai yang ingin di cari : ");
        int key = wika.nextInt();

       boolean ditemukan = false;

       for (int i = 0; i < nilai.length; i++) {
        if (nilai[i]== key) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" +i);
            ditemukan = true;
            break;
        } 
       }
       if (!ditemukan) {
        System.out.println("Nilai " + key + " tidak ditemukan.");

       } 

    }
    
}

