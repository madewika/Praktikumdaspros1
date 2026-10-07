package jobsheet5;
import java.util.Scanner;
public class tugas2SeleksiAsisten13 {
    public static void main(String[] args) {
        boolean isAktif, isSanksi, isSertif;
        double nilaiDaspro, wawancara;

        Scanner wika=new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif ? (True/False) ");
        isAktif=wika.nextBoolean();

        System.out.print("Apakah mendapatkan sanksi akademik? (True/False) ");
        isSanksi=wika.nextBoolean();

        System.out.print("Nilai Dasar pemograman : ");
        nilaiDaspro=wika.nextDouble();

        System.out.print("Apakah memiliki sertif kompetensi pemograman ? (True/False) ");
        isSertif=wika.nextBoolean();

        System.out.print("Masukan nilai wawancara : ");
        wawancara=wika.nextDouble();

        if (isAktif && !isSanksi) {
            if (nilaiDaspro >=77 || isSertif) {
                if (wawancara >=72) {
                    System.out.println("Selamat! Anda dinyatakan lolos seleksi asisten dosen");
                } else {
                    System.out.println("Gagal! Nilai wawanacara anda kurang dari 72");
                }
            } else {
                System.out.println("Gagal! nilai daspro kurang dari 77 atau tidak memiliki sertifikat kompetensi");
            }
        } else {
            System.out.println("Gagal! Status mahasiswa tidak memenuhi syarat");
        }



    }

    
}
