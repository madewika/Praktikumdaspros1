package jobsheet2;
import java.util.Scanner;
public class Bank13 {
public static void main(String[] args) {
Scanner wika = new Scanner(System.in);
int jml_tabungan_awal;
int lama_menabung;
double bunga;
double presentase_bunga = 0.02;
double jml_tabungan_akhir;

System.out.print("Masukkan jumlah tabungan awal anda ");
jml_tabungan_awal = wika.nextInt();

System.out.print("Masukan lama menabung");
lama_menabung = wika.nextInt();

bunga = jml_tabungan_awal * presentase_bunga * lama_menabung;
jml_tabungan_akhir = jml_tabungan_awal + bunga;

System.out.println("Bunga adalah " + bunga);
System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
wika.close();

    }
}
