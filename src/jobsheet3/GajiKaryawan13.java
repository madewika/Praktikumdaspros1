package jobsheet3;
import java.util.Scanner;
public class GajiKaryawan13 {
public static void main(String[] args) {
int gajiPokok;
double bonus;
int totalGaji;
double tunjTransp=600000;
double tunjMkn=400000;

Scanner wika = new Scanner (System.in);

System.out.print("Masukan gaji pokok anda ");
gajiPokok=wika.nextInt();

bonus= 0.05*gajiPokok;
totalGaji = (int) (gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok));
System.out.println("Bonus Bulanan anda adalah Rp." + bonus);
System.out.println("Gaji yang diterima adalah Rp." + totalGaji);
wika.close();

}
}
