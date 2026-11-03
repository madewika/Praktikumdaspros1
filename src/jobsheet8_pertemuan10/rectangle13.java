package jobsheet8_pertemuan10;
import java.util.Scanner;
public class rectangle13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner (System.in);

        System.out.print("Masukan jumlah baris : ");
        int baris = wika.nextInt();
    
        System.out.print("Masukan jumlah kolom : ");
        int kolom = wika.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1 ; j <= kolom; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
