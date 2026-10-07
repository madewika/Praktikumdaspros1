package jobsheet5;
import java.util.Scanner;
public class nestedAksesLab13 {
    public static void main(String[] args) {
        Scanner wika = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDiSanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah Mahasiswa aktif? (True/Flase) ");
        mahasiswaAktif= wika.nextBoolean();

        System.out.print("Apakah sedang disanksi? (True/Flase) ");
        sedangDiSanksi = wika.nextBoolean();

        System.out.print("Apakah memiliki izin dosen? (True/Flase) ");
        punyaIzinDosen = wika.nextBoolean();

        System.out.print("Apakah memiliki izin asisten Lab? (True/Flase) ");
        asistenLab = wika.nextBoolean();
        

        if (mahasiswaAktif && !sedangDiSanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: Membutuhkan izin dosen atau status asisten Lab");
            }
            
        } else {
            System.out.println("Akses ditolak: ststus Mahasiswa tidak memenuhi syarat");
            
        }

    }
    
}
