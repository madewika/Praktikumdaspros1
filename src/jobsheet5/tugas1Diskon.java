package jobsheet5;
import java.util.Scanner;
public class tugas1Diskon {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        String buku;
        String pesan;
        int jumlahBuku;
        boolean isRabu;

        System.out.print("apakah sekarang hari Rabu? (True/False) ");
        isRabu = wika.nextBoolean();

        System.out.print("Masukan jumlah buku ");
        jumlahBuku = wika.nextInt();

        wika.nextLine();

        System.out.print("Masukan jenis buku ");
        buku = wika.nextLine();

        if (isRabu) {
            if (buku.equalsIgnoreCase("kamus")&&jumlahBuku>3) {
                pesan = "Mendapatkan diskon 13%";
            } else if (buku.equalsIgnoreCase("kamus")) {
                pesan = "Mendapatkan diskon 11%";
            } else if (buku.equalsIgnoreCase("novel")&&jumlahBuku>4){
                pesan = "Mendapatkan diskon 8%";
            } else if (buku.equalsIgnoreCase("novel")&&jumlahBuku<=4) {
                pesan = "Mendapatkan diskon 7%";
            } else if (jumlahBuku>4) {
                pesan = "Mendapatkan diskon 4%";
            } else {
                pesan = "Tidak mendapat diskon";
            }
        } else {
            pesan = "Tidak mendapatkan diskon";
            
        }
        System.out.println(pesan);

    }
}
