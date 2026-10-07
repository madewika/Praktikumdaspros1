package jobsheet2;
import java.util.Scanner;
public class Segitiga13 {
    public static void main(String[] args) {
    Scanner wika = new Scanner(System.in);
    int alas;
    int tinggi;
    float luas;

    System.out.print("Masukkan alas segitiga: ");
    alas = wika.nextInt();
    System.out.print("Masukkan tinggi segitiga: ");
    tinggi = wika.nextInt();

    luas = alas * tinggi / 2.0F;
    System.out.println("Luas segitiga :" + luas);
    wika.close();
    }
}
