package jobsheet8_pertemuan10;
import java.util.Scanner;
public class triangle13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);

        System.out.print("Masukan nilai n : ");
        int n = wika.nextInt();

        int i = 0;
        while (i<n) {
            int j = 0;
            while (j<=i) {
                System.out.print("*");
                j++;
            }

            System.out.println();

            i++;
        }
        System.out.println();
        
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

    }
    
}
