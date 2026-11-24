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

        System.out.println("Daftar mahasiswa yang lulus");
        int no =1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS"; 
            System.out.println("Mahasiswa ke-" + no + ": " + nilai+ " (" + status + ")"); 
            no++;
        }
    }
    
}
