package jobsheet3;
import java.util.Scanner;
public class CicilanLaptop {
    public static void main(String[] args) {
    int harga;
    int uangMuka;
    int lamaMenyicil;
    double bunga=0.02;
    double cicilanPokok;
    double cicilanPerBulan;

    Scanner wika = new Scanner(System.in);

    System.out.print("Masukan Harga Laptop Rp.");
    harga = wika.nextInt();

    System.out.print("Masukan uang muka Rp.");
    uangMuka = wika.nextInt();

    System.out.print("Lama (dalam bulan) anda menyicil ");
    lamaMenyicil = wika.nextInt();

    cicilanPokok = (harga-uangMuka)/lamaMenyicil;
    cicilanPerBulan = cicilanPokok + ((harga - uangMuka)*bunga);

    System.out.println("Cicilan per bulan anda adalah Rp." + cicilanPerBulan);
    wika.close();
    



    }
    
}
