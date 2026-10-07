package jobsheet6_pertemuan7;
import java.util.Scanner;
public class StudiKasus113 {
    public static void main(String[] args) {
        Scanner wika = new Scanner (System.in);
        int hargaPerCup=16000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukan jumlah cup yang anda beli : ");
        jumlahCup = wika.nextInt();

        System.out.print("Masukan jumlah uang : ");
        uangBayar = wika.nextInt();
    
        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga>=110000) {
            diskon = totalHarga * 6/100;
            totalBayar = totalHarga-diskon;
        } else {
            diskon = 0;
            totalBayar = totalHarga;
            
        }
        System.out.println("Total Harga adalah " + totalHarga);
        System.out.println("Diskon anda adalah " + diskon);
        System.out.println("Total Bayar anda adalah " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar-totalBayar;
            System.out.println("Kembalian anda adalah "+ kembalian);
        } else {
            kurang = totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang "+ kurang);
            
        }

    }
    
}
