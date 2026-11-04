package jobsheet8_pertemuan10;
import java.util.Scanner;
public class tugas213 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        int total=0;
        int n;

        do {
            System.out.print("Masukan nilai n : ");
            n = wika.nextInt();
            if (n<3) {
                System.out.println("Nilai n minimal 3");
            } 
            
        } while (n<3);
        
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j<=n;j++){
                    int hasil = i*j;
                    System.out.printf("%4d", hasil);
                    total+=hasil;
                }
                System.out.println();
            }

            System.out.print("Jumlah seluruh angka; "+ total);
        

    }
}
