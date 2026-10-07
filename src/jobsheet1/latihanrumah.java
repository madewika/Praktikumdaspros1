package jobsheet1;
import java.util.Scanner;
public class latihanrumah {
public static void main(String[] args) {
   String nickname, id;

   int wdp = 220;
   int jumlahWdp;
   int hargaWdp = 29000;
   int svp = 55;
   int jumlahSvp;
   int hargaSvp=15000;
   int totalHarga;
   int totalDm;

   Scanner wika = new Scanner(System.in);

   System.out.print("Masukan nama pemaain : ");
   nickname = wika.nextLine();

   System.out.print("Masukan id pelanggan : ");
   id = wika.nextLine();

   System.out.print("Masukan jumlah weekly diamond pass : ");
   jumlahWdp=wika.nextInt();

   System.out.print("Masukan jumlah super value pass : ");
   jumlahSvp = wika.nextInt();

   totalDm = wdp*jumlahWdp + svp*jumlahSvp;
   totalHarga = hargaWdp*jumlahWdp + hargaSvp*jumlahSvp;

   System.out.println("Nama : " + nickname);
   System.out.println("ID : " + id);
   System.out.printf("Total Diamond yang di dapat %,d diamond", totalDm);
   System.out.printf("\nTotal harga Rp.%,d ", totalHarga);
  wika.close();
}
}
