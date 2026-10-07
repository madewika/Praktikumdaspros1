package jobsheet3;
import java.util.Scanner;
public class MenghitungLuasPersegiPanjang13 {
    public static void main(String[] args) {
    int panjang;
    int lebar;
    int luas;

    Scanner wika = new Scanner(System.in);
        
    System.out.print("Masukan panjang ");
    panjang = wika.nextInt();

    System.out.print("Masukan lebar ");
    lebar = wika.nextInt();

    luas = panjang*lebar;
    System.out.println("Luas persegi panjang adalah " + luas);
    wika.close();
    }
    }

