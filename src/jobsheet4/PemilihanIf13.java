package jobsheet4;
import java.util.Scanner;
public class PemilihanIf13 {
    public static void main(String[] args) {
    boolean uktLunas;
    Scanner wika = new Scanner(System.in);
    
    System.out.println("---CETAK KRS SIAKAD---");
    System.out.print("Apakah UKT sudah lunas ? (true/false) : ");
    uktLunas = wika.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverivikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");

    } else {
        System.out.println("Regristasi di tolak");
        System.out.println("Silakan lunasi UKT terlebih dahulu");
    }
wika.close();
}
}

    
