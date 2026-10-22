package jobsheet7_pertemuan8;
import java.util.Scanner;
public class KafeDoWhile13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner (System.in);
        Scanner string =new Scanner (System.in);
        int kopi, teh, roti, total;
        int hargaKopi = 13000;
        int hargaTeh = 6000;
        int hargaRoti = 16000;
        String nama;

        do {
            System.out.print("Masukan nama pelanggan (Ketik 'batal' untuk keluar) ");
            nama = string.nextLine();
            if (nama.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah Kopi : ");
            kopi = wika.nextInt();
            System.out.print("Jumlah Teh : ");
            teh = wika.nextInt();
            System.out.print("Jumlah Roti : ");
            roti = wika.nextInt();

            total = (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total yang harus dibayar adalah "+ total);

        } while (true);

        System.out.println("Semua Transaksi Selesai");
    }
    
}
