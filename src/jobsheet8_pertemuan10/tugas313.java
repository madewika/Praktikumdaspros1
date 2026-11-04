package jobsheet8_pertemuan10;
import java.util.Scanner;
public class tugas313 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        int jumlahToko;
        int jumlahPelanggan, totalPelanggan=0;
        int jumlahBarang, totalBarang=0;
        int barangKeseluruhan=0;
        int barangTerbanyak=0;
        int tokoPembelianterbanyak=0;

        do {
            System.out.print("Masukan jumlah toko : ");
            jumlahToko=wika.nextInt();

            if (jumlahToko<1) {
                System.out.println("Jumlah toko harus lebih dari 1");
            } 
        } while (jumlahToko<1);

        for (int i = 1; i <= jumlahToko; i++) {
            do {
            System.out.println("------------Toko ke-"+i + "----------");
            System.out.print("Masukan jumlah pelanggan : ");
            jumlahPelanggan=wika.nextInt();

            if (jumlahPelanggan<0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif");
            } else {
                totalPelanggan+=jumlahPelanggan;
            } 
            } while (jumlahPelanggan<0);

            for (int j = 1; j <= jumlahPelanggan; j++) {

                do {
                    System.out.print("Pelanggan ke-"+ j +" jumlah barang : ");
                    jumlahBarang=wika.nextInt();

                    if (jumlahBarang<0) {
                    System.out.println("Jumlah barang tidak boleh negatif");
                    System.out.println("-------------------------------");
                } 
                } while (jumlahBarang<0);

                totalBarang+=jumlahBarang;
            }

            barangKeseluruhan+=totalBarang;
            if (barangTerbanyak<totalBarang) {
                barangTerbanyak=totalBarang;
                tokoPembelianterbanyak=i;
            } 
            System.out.println("Total barang : " + totalBarang);

            totalBarang=0;

        }
        System.out.println("----------------------------------------");
        System.out.println("Total pelanggan : " + totalPelanggan);
        System.out.println("Total Keseluruhan toko : " + barangKeseluruhan);
        System.out.println("Toko dengan barang terbanyak : " + tokoPembelianterbanyak + "\ndengan total barang : " + barangTerbanyak);

    }
}
