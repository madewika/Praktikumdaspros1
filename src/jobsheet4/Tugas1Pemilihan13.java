package jobsheet4;
import java.util.Scanner;
public class Tugas1Pemilihan13 {
   public static void main(String[] args) {
    boolean uktLunas;
    Scanner wika = new Scanner(System.in);
    
    System.out.println("---CETAK KRS SIAKAD---");
    System.out.print("Apakah UKT sudah lunas ? (true/false) : ");
    uktLunas = wika.nextBoolean();

    String pesan  = (uktLunas==true) ? "Pembayaran UKT terverifikasi \nSilakan cetak KRS dan minta tanda tangan DPA" : "Regristasi di tolak \nSilakan lunasi UKt terlebih dahulu";
    System.out.println(pesan);
    } 
}
