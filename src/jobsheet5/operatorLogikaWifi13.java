package jobsheet5;
import java.util.Scanner;
public class operatorLogikaWifi13 {
    public static void main(String[] args) {
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        Scanner wika = new Scanner(System.in);

        System.out.print("Apakah pengguna mahasiswa? (True/False) ");
        mahasiswa = wika.nextBoolean();

        System.out.print("Apakah pengguna dosen? (True/False) ");
        dosen = wika.nextBoolean();

        System.out.print("Apakah akun sedang di blokir? (True/False) ");
        akunDiblokir = wika.nextBoolean();

        if ((mahasiswa&&dosen) && !akunDiblokir) {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }

    }
    
}
