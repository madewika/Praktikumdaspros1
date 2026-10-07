package jobsheet2;
import java.util.Scanner;
public class LuasTanah {
public static void main(String[] args) {
Scanner wika = new Scanner(System.in);
double panjangTanah;
double lebarTanah;
double diameterLingkaran;
double sisiPagar;
double jarijari;
double phi = 3.14;
double sisaLuasTanah;

System.out.println("Menghitung sisa luas tanah, harap memasukan data berikut dengan satuan meter");
System.out.print("Masukkan panjang tanah: ");
panjangTanah = wika.nextDouble();

System.out.print("Masukkan lebar tanah: ");
lebarTanah = wika.nextDouble();

System.out.print("Masukkan diameter kolam: ");
diameterLingkaran = wika.nextDouble();

jarijari = diameterLingkaran / 2;

System.out.print("Masukkan panjang sisi pagar: ");
sisiPagar = wika.nextDouble();

sisaLuasTanah = (panjangTanah * lebarTanah) - ((phi * jarijari * jarijari) + (sisiPagar * sisiPagar));
System.out.println("Sisa luas tanah adalah " + sisaLuasTanah + " meter persegi");
wika.close();
}
}


