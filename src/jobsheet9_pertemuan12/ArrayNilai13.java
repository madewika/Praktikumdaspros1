package jobsheet9_pertemuan12;
import java.util.Scanner;
public class ArrayNilai13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);

        int nilaiAkhir[] = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiAkhir[i] = wika.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS"; 
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");  
        }
    }
    
}
