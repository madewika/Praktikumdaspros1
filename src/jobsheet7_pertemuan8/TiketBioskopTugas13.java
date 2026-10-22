package jobsheet7_pertemuan8;
import java.util.Scanner;
public class TiketBioskopTugas13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner (System.in);
        Scanner string = new Scanner (System.in);
        int jumlahTiket;
        int tiket = 60000;
        String nama;
        int totalPenjualan=0, totalTiketTerjual=0;
        int hargaTotal, hargaFix, diskon;

        do {
            System.out.println("-------------------------WELCOME TO XXI FOR CASHIER------------------------- ");
            System.out.print("Masukan Nama Pembeli (Ketik 'Selesai' jika toko sudah tutup pada hari itu) : ");
            nama = string.nextLine();
            if (nama.equalsIgnoreCase("Selesai")) {
                System.out.print("Transaksi Selesai");
                break;
            }
             System.out.print("Masukan jumlah tiket : ");
            jumlahTiket=wika.nextInt();

            if (jumlahTiket <0) {
                System.out.println(" Jumlah Tiket tidak boleh negatif"); 
                continue;
            }

            if (jumlahTiket > 9) {
                hargaTotal=jumlahTiket*tiket;
                diskon=jumlahTiket*tiket*16/100;
                hargaFix = hargaTotal-diskon;
            } else if (jumlahTiket>4) {
                hargaTotal=jumlahTiket*tiket;
                diskon=jumlahTiket*tiket*11/100;
                hargaFix = hargaTotal-diskon;
            } else {
                hargaTotal=jumlahTiket*tiket;
                diskon=0;
                hargaFix = hargaTotal-diskon;
            }
            System.out.println("Harga total tiket anda adalah " + hargaTotal);
            System.out.println("Diskon : " + diskon);
            System.out.println("Total : "+ hargaFix);
            

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaFix;
            
            System.out.println("Total Tiket Terjual " + totalTiketTerjual);
            System.out.println("Total Penjualan adalah " + totalPenjualan);
            
            
        } while (true);
    

    }
}
