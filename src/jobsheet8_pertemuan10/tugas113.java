package jobsheet8_pertemuan10;
import java.util.Scanner;
public class tugas113 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        int total = 0;
        System.out.print("Masukan nilai n : ");
        int n = wika.nextInt();

        if (n<1) {
            System.out.println("nilai n minimal 1");
        } else {
            for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
                if (j<i) {
                    System.out.print(" ");
                } 
                total++;
            }

            System.out.println();
        }
            
        }

        System.out.println("Total angka tercetak " + total);

        
    }
}
