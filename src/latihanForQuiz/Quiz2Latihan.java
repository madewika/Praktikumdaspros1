package latihanForQuiz;
import java.util.Scanner;
public class Quiz2Latihan {
    public static void main(String[] args) {
      String nama;
      String statusKeanggotaan;
      int durasiPemakaiaan, tagihanKotor=0;
      int diskon=0;
      int tagihanTotal;
      int uang, kembalian;

      Scanner wika=new Scanner(System.in);

      System.out.print("Masukan Nama Penyewa :");
      nama = wika.nextLine();

      System.out.print("Durasi pemakaiaan : ");
      durasiPemakaiaan= wika.nextInt();

      statusKeanggotaan=wika.nextLine();

      System.out.print("Memiliki kartu keanggotaan : ");
      statusKeanggotaan=wika.nextLine();

      if (statusKeanggotaan.equalsIgnoreCase("Y")) {
        if (durasiPemakaiaan>5) {
            tagihanKotor = durasiPemakaiaan*7000+5000;
            diskon = tagihanKotor*10/100;
            tagihanTotal = tagihanKotor-diskon;
        } else if (durasiPemakaiaan>=3 && durasiPemakaiaan<=5) {
            tagihanKotor = durasiPemakaiaan*8500;
            diskon = tagihanKotor*10/100;
            tagihanTotal =tagihanKotor-diskon;
        } else {
            tagihanKotor = durasiPemakaiaan*10000;
            diskon = tagihanKotor*10/100;
            tagihanTotal = tagihanKotor-diskon;
        }
      } else if (durasiPemakaiaan>5) {
        tagihanTotal = durasiPemakaiaan*7000+5000;
      } else if (durasiPemakaiaan>=3 && durasiPemakaiaan<=5) {
        tagihanTotal = durasiPemakaiaan*8500;
      } else {
         tagihanTotal = durasiPemakaiaan*10000;
      }  
      System.out.println("Tagihan sebelum diskon = " +  tagihanKotor);
      System.out.println("Diskon keanggotaan = "+ diskon);
      System.out.println("Total bayar = "+ tagihanTotal);

      System.out.print("Masukan uang pembayaran = ");
      uang =wika.nextInt();

      kembalian =uang-tagihanTotal;

      System.out.println("Kembalian mu adalah "+kembalian);
      
    }
    
}

